package com.example.demo.service.impl;

import com.example.demo.dao.ShippingCostCrawlerDao;
import com.example.demo.entity.*;
import com.example.demo.fedex.rate.stub.*;
import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.ShippingCostAreaService;
import com.example.demo.service.ShippingCostCrawlerService;
import com.example.demo.util.ShippingCostUtil;
import com.example.demo.util.ThreadPoolUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.types.NonNegativeInteger;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static com.example.demo.entity.ShippingCompany.*;
import static com.example.demo.entity.ShippingCostArea.*;
import static com.example.demo.entity.ShippingCostFeeDetail.*;
import static com.example.demo.util.ShippingCostUtil.*;


@Service
@Slf4j
public class ShippingCostCrawlerServiceImpl implements ShippingCostCrawlerService {
    private static final BigDecimal DESTINATION = BigDecimal.valueOf(31);
    private static final BigDecimal INCREMENT = BigDecimal.valueOf(1);
    private static final BigDecimal START_WEIGHT = BigDecimal.valueOf(0.1);

    private static final int PROCESS_NUM = Runtime.getRuntime().availableProcessors();
    private static final ThreadFactory THREAD_FACTORY = ThreadPoolUtil.getNamedThreadFactory("shipping-crawler-%d");
    private static final ThreadFactory ALL_SERVICE_THREAD_FACTORY = ThreadPoolUtil.getNamedThreadFactory("allService-crawler-%d");
    private ExecutorService pool = ThreadPoolUtil.getPool(2 * PROCESS_NUM, THREAD_FACTORY);
    private ExecutorService allServicePool = ThreadPoolUtil.getPool(2 * PROCESS_NUM, ALL_SERVICE_THREAD_FACTORY);

    @Autowired
    private ShippingCostAreaService shippingCostAreaService;

    @Autowired
    private ShippingCostCrawlerDao dao;

    @Autowired
    private CountryPostalCodeService countryPostalCodeService;


    @Override
    public void multiProcessGetShippingCostAndInsert() {
        log.error("multi process start，start select area data!");
        List<ShippingCostArea> shippingCostAreaList = shippingCostAreaService.selectByShippingCompany(FEDEX);
        log.error("data count is: {}", shippingCostAreaList.size());
        List<List<ShippingCostArea>> splitDatas = splitData(shippingCostAreaList, 5000);
        log.error("split data is: {}", splitDatas.size());
        int i = 0;
        for (List<ShippingCostArea> costAreaList : splitDatas) {
            log.error("submit task: {}", (++i));
            pool.submit(new Task(costAreaList));
        }
        log.error("submit task end!");
    }

    @Override
    public void nomalProcessGetShippingCostAndInsert() {
        //  已经爬过的不要取到
        log.error("start crawler fedex rate data: {}", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        List<ShippingCostArea> shippingCostAreaList = shippingCostAreaService.selectByShippingCompany(FEDEX);
        for (ShippingCostArea area : shippingCostAreaList) {
            log.info("area id: {}, start time: {}", area.getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            try {
                getShippingCostByServiceType(area);
            } catch (Exception e) {
                log.error("databaseException: {} ", e);
            }
            log.info("area id: {}, end time: {}", area.getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " success");
        }
        log.error("end crawler fedex rate data: {}", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    private Party getToParty(ShippingCostArea area) {
        Party party = new Party();
        Address address = new Address();
        address.setCountryCode(area.getShippingToCountry());
        address.setStateOrProvinceCode(area.getShippingToState());
        address.setCity(area.getShippingToCity());
        address.setPostalCode(area.getShippingToZipcode());
        party.setAddress(address);
        return party;
    }

    private Party getFromParty(ShippingCostArea area) {
        Party party = new Party();
        Address address = new Address();
//        address.setStreetLines(new String[]{"65 Vesta St"});
        address.setCountryCode(area.getShippingFromCountry());
        address.setStateOrProvinceCode(area.getShippingFromState());
        address.setCity(area.getShippingFromCity());
        address.setPostalCode(area.getShippingFromZipcode());
        party.setAddress(address);
        return party;
    }


    private void getShippingCostByServiceType(ShippingCostArea area) {
        if (START_WEIGHT.compareTo(BigDecimal.valueOf(0.0)) < 0) {
            return;
        }
        Party shipper = getFromParty(area);
        Party recipient = getToParty(area);
        BigDecimal weight = START_WEIGHT;
        BigDecimal startW = BigDecimal.valueOf(0);

        ShippingCostFeeDetail currentFeeDetail;
        ShippingCostFeeDetail preFeeDetail = null;


        List<ShippingCostCrawler> result = new ArrayList<>();
        for (; ; ) {
            if (weight.compareTo(DESTINATION) > 0) {
                if (!result.isEmpty()) {
                    insertBatch(result);
                    result.clear();
                }
                break;
            }

            RateReply reply = ShippingCostUtil.getShippingCostReply(
                    FEDEX_SERVICE_TYPE.get(area.getShippingMethodId()),
                    "YOUR_PACKAGING",
                    shipper,
                    recipient,
                    addLineItem(weight)
            );
            currentFeeDetail = dealReply(area, reply);
            if (currentFeeDetail == null) break;

            //fist time pre is null bigdecimal compare will exception
            if (preFeeDetail != null && isPriceChange(currentFeeDetail, preFeeDetail)) {
                BigDecimal endW = weight.subtract(INCREMENT);

                ShippingCostCrawler build = getShippingCostCrawler(area, preFeeDetail, startW, endW);
                result.add(build);
                if (result.size() >= 5) {
                    insertBatch(result);
                    result.clear();
                }
                startW = endW;
                preFeeDetail = currentFeeDetail;
            }
            // first time set value
            if (preFeeDetail == null) {
                preFeeDetail = currentFeeDetail;
            }

            if (weight.compareTo(START_WEIGHT) == 0) {
                weight = BigDecimal.valueOf(1);
            } else {
                weight = weight.add(INCREMENT);
            }
        }
    }

    private ShippingCostFeeDetail dealReply(ShippingCostArea area, RateReply reply) {
        ShippingCostFeeDetail currentFeeDetail;
        if (reply == null) {
            area.setErrorCode("999");
            area.setErrorMessage("reply is null, get data exception");
            log.info("area id: {}, reply is null, get data exception", area.getId());
            shippingCostAreaService.updateErrorCodeAndMesage(area);
            return null;
        }

        if (isResponseOk(reply.getHighestSeverity())) {
            currentFeeDetail = getShippingCost(reply);
        } else {
            boolean isServiceUnvailable = dealErrorReply(area, reply);
            if (isServiceUnvailable) {
                log.error("service unvailable sleep ten minutes!");
                sleep(10, TimeUnit.MINUTES);
                log.error("service restart after sleep ten minutes!");
            }
            return null;
        }

        if (currentFeeDetail.getTotalNetCharge() == null) {
            return null;
        }
        return currentFeeDetail;
    }

    private boolean isPriceChange(ShippingCostFeeDetail currentShippingCost, ShippingCostFeeDetail preShippingCost) {
        if (currentShippingCost != null && preShippingCost != null && currentShippingCost.getTotalNetCharge() != null) {

            return preShippingCost.getTotalNetCharge() != null && currentShippingCost.getTotalNetCharge().compareTo(preShippingCost.getTotalNetCharge()) != 0;
        }
        return false;
    }

    private ShippingCostCrawler getShippingCostCrawler(ShippingCostArea area, ShippingCostFeeDetail preShippingCost, BigDecimal startW, BigDecimal endW) {

        return ShippingCostCrawler.builder()
                .shippingCostAreaId(area.getId())
                .weightFrom(startW)
                .weightTo(endW)
                .shippingFee(preShippingCost.getTotalNetCharge())
                .feeAName(FEE_A_NAME)
                .feeA(preShippingCost.getBaseCharge())
                .feeBName(FEE_B_NAME)
                .feeB(preShippingCost.getFuelSurcharge())
                .feeCName(FEE_C_NAME)
                .feeC(preShippingCost.getOther()).build();
    }

    private static RequestedPackageLineItem addLineItem(BigDecimal weight) {
        RequestedPackageLineItem lineItem = new RequestedPackageLineItem();
        lineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        lineItem.setWeight(new Weight(WeightUnits.LB, weight));
        lineItem.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
//            lineItem.setDimensions(new Dimensions(new NonNegativeInteger("10"), new NonNegativeInteger("10"), new NonNegativeInteger("10"), LinearUnits.IN));
        return lineItem;
    }

    private boolean dealErrorReply(ShippingCostArea area, RateReply reply) {
        try {
            Notification[] notifications = reply.getNotifications();
            if (notifications != null && notifications.length > 0) {
                for (int i = 0; i < notifications.length; i++) {
                    Notification n = notifications[i];
                    if (n == null) {
                        continue;
                    }
                    String code = n.getCode();
                    String message = n.getMessage();
                    area.setErrorCode(code);
                    area.setErrorMessage(message);
                    log.info("area id: {}, reply is error, message: {}", area.getId(), message);
                    shippingCostAreaService.updateErrorCodeAndMesage(area);
                    if (message.contains("temporarily unavailable")) {
                        return true;
                    }
                    break;
                }
            }
        } catch (Exception ignore) {
            log.error("deal error exception, area id is: " + area.getId());
        }
        return false;
    }


    @Override
    public void insertBatch(List<ShippingCostCrawler> params) {
        dao.insertBatch(params);
    }

    @Override
    public void insert(ShippingCostCrawler param) {
        dao.insert(param);
    }

    private class Task implements Runnable {
        private List<ShippingCostArea> costAreaList;

        @Override
        public void run() {
            for (ShippingCostArea area : costAreaList) {
                try {
                    log.error(" areaId: {}, start time: {}", area.getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                    getShippingCostByServiceType(area);
                    log.error(" areaId: {}, end time: {}", area.getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                } catch (Exception e) {
                    log.error("databaseException: {} ", e);
                }
            }
        }

        public Task(List<ShippingCostArea> costAreaList) {
            this.costAreaList = costAreaList;
        }
    }

    @Override
    public void normalGetShippingCostAllServiceType() {
        log.info("all service normal get start, select postalcode!");
        List<CountryPostalCode> crawlerNeedDes = countryPostalCodeService.selectNotCrawlerPostalCode();
        log.info("postalcode data size: {} piece", crawlerNeedDes.size());
        for (CountryPostalCode des : crawlerNeedDes) {
            try {
                log.error(" destination zipcode: {}, start time: {}", des.getZip(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

                List<ShippingCostArea> shippingCostAreaList = shippingCostAreaService.selectByShippingCompanyAndZipcode(FEDEX, des.getZip());
                dealAcceptableCities(des, shippingCostAreaList);
                getAllServiceTypeShippingCost(getShippingCostAreaByPostCode(des), shippingCostAreaList);

                log.error(" destination zipcode: {}, end time: {}", des.getZip(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            } catch (Exception e) {
                log.error("destination zipcode: {}, Exception!", des.getZip());
            }
        }
        log.info("all service normal get end");
    }

    private void dealAcceptableCities(CountryPostalCode des, List<ShippingCostArea> desServiceType) {
        String acceptableCities = des.getAcceptableCities();
        if (StringUtils.isNotBlank(acceptableCities)) {
            String[] cities = acceptableCities.split(",");
            for (String city : cities) {
                getAllServiceTypeShippingCost(getShippingCostAreaByPostCode(des, city), desServiceType);
            }
        }
    }

    private void getAllServiceTypeShippingCost(ShippingCostArea area, List<ShippingCostArea> desServiceType) {
        if (START_WEIGHT.compareTo(BigDecimal.valueOf(0.0)) < 0) {
            return;
        }
        Party shipper = getFromParty(area);
        Party recipient = getToParty(area);
        BigDecimal weight = START_WEIGHT;
        Map<String, BigDecimal> allTypeStartWeight = getInitServiceTypeStartWeightMap();
        Map<String, ShippingCostFeeDetail> currentAllTypeShippingCost;
        Map<String, ShippingCostFeeDetail> preAllTypeShippingCost = null;

        List<ShippingCostCrawler> result = new ArrayList<>();
        for (; ; ) {
            if (weight.compareTo(DESTINATION) > 0) {
                if (!result.isEmpty()) {
                    insertBatch(result);
                    result.clear();
                }
                break;
            }

            RateReply reply = ShippingCostUtil.getShippingCostReply(
                    null,
                    "YOUR_PACKAGING",
                    shipper,
                    recipient,
                    addLineItem(weight)
            );

            if (reply == null) {
                break;
            }
            if (isResponseOk(reply.getHighestSeverity())) {
                currentAllTypeShippingCost = ShippingCostUtil.getAllServiceTypeShippingCost(reply);
            } else {
                boolean b = allServiceTypeDealErrorReply(reply, area);
                if (b) {
                    log.error("temporarily unavailable sleep 5 minutes");
                    sleep(5, TimeUnit.MINUTES);
                    log.error("sleep end restart!");
                    continue;
                } else {
                    break;
                }
            }

            if (preAllTypeShippingCost != null) {
                for (Map.Entry<String, ShippingCostFeeDetail> serviceTypeShippingCostEntry : currentAllTypeShippingCost.entrySet()) {
                    String serviceType = serviceTypeShippingCostEntry.getKey();

                    ShippingCostFeeDetail preFeeDetail = preAllTypeShippingCost.get(serviceType);
                    if (isPriceChange(serviceTypeShippingCostEntry.getValue(), preFeeDetail)) {
                        BigDecimal startW = allTypeStartWeight.get(serviceType);
                        BigDecimal endW = weight.subtract(INCREMENT);
                        Long shippingCostAreaId = findShippingCostAreaId(area, desServiceType, serviceType);
                        if (shippingCostAreaId == null) {
                            log.info("service type: {}, zipcode: {}, city: {} is not in area table, error!", serviceType, area.getShippingToZipcode(), area.getShippingToCity());
                            continue;
                        }
                        area.setId(shippingCostAreaId);
                        ShippingCostCrawler build = getShippingCostCrawler(area, preFeeDetail, startW, endW);
                        result.add(build);
                        if (result.size() >= 5) {
                            insertBatch(result);
                            result.clear();
                        }
                        allTypeStartWeight.put(serviceType, endW);
                    }
                }

            } else {
                dealNotSupportDes(area, currentAllTypeShippingCost);
            }
            preAllTypeShippingCost = currentAllTypeShippingCost;

            if (weight.compareTo(START_WEIGHT) == 0) {
                weight = BigDecimal.valueOf(1);
            } else {
                weight = weight.add(INCREMENT);
            }
        }
    }

    private boolean allServiceTypeDealErrorReply(RateReply reply, ShippingCostArea area) {
        try {
            Notification[] notifications = reply.getNotifications();
            if (notifications != null && notifications.length > 0) {
                for (int i = 0; i < notifications.length; i++) {
                    Notification n = notifications[i];
                    if (n == null) {
                        continue;
                    }
                    String message = n.getMessage();
                    if (message.contains("temporarily unavailable")) {
                        return true;
                    } else {
                        // 插入错误信息
                        area.setErrorCode(n.getCode());
                        area.setErrorMessage(message);
                        shippingCostAreaService.updateErrorCodeAndMesageAllServiceType(area, ShippingCompany.getCrawlerNeedFedexCompany());

                        log.info("message: {}, area to zipcode: {}, to city: {} for all service type is response not success!"
                                , message, area.getShippingToZipcode(), area.getShippingToCity());
                    }
                    break;
                }
            }
        } catch (Exception ignore) {

        }
        return false;
    }

    private void dealNotSupportDes(ShippingCostArea area, Map<String, ShippingCostFeeDetail> currentAllTypeShippingCost) {
        List<ShippingCostArea> notSupportServiceArea = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Long, String> serviceType : FEDEX_SERVICE_TYPE.entrySet()) {
            if (currentAllTypeShippingCost.get(serviceType.getValue()) == null) {
                ShippingCostArea build = ShippingCostArea.builder()
                        .shippingMethodId(serviceType.getKey())
                        .shippingToZipcode(area.getShippingToZipcode())
                        .shippingToCity(area.getShippingToCity())
                        .errorCode("2223")
                        .errorMessage(serviceType.getValue() + " is not supported for the destination.")
                        .build();
                notSupportServiceArea.add(build);
                str.append(serviceType.getValue()).append(",");
            }
        }
        if (!notSupportServiceArea.isEmpty()) {
            log.info("service type,{} is not supported for the destination.", str.toString());
            shippingCostAreaService.updateNoSupportErrorMessage(notSupportServiceArea);
        }
    }

    private Long findShippingCostAreaId(ShippingCostArea area, List<ShippingCostArea> desServiceType, String serviceType) {
        for (ShippingCostArea shippingCostArea : desServiceType) {
            if (isSameServiceTypeAndDes(area, serviceType, shippingCostArea)) {
                return shippingCostArea.getId();
            }
        }
        return null;
    }

    private boolean isSameServiceTypeAndDes(ShippingCostArea area, String serviceType, ShippingCostArea shippingCostArea) {
        return shippingCostArea.getShippingToZipcode().equals(area.getShippingToZipcode())
                && shippingCostArea.getShippingToCity().equals(area.getShippingToCity())
                && shippingCostArea.getShippingMethodId().equals(getFedexServiceTypeIdByName(serviceType));
    }

    private Map<String, BigDecimal> getInitServiceTypeStartWeightMap() {
        Map<String, BigDecimal> allTypeStartWeight = new HashMap<>();
        for (String serviceType : FEDEX_SERVICE_TYPE.values()) {
            allTypeStartWeight.put(serviceType, BigDecimal.valueOf(0));
        }
        return allTypeStartWeight;
    }

    /**
     * shippingMethodId is null means no service type .
     *
     * @param des
     * @return
     */
    private ShippingCostArea getShippingCostAreaByPostCode(CountryPostalCode des) {
        return getShippingCostAreaByPostCode(des, des.getCity());
    }

    private ShippingCostArea getShippingCostAreaByPostCode(CountryPostalCode des, String toCity) {
        return ShippingCostArea.builder()
                .shippingCompanyId(FEDEX)
                .shippingFromCountry(FROM_COUNTRY)
                .shippingFromState(FROM_STATE)
                .shippingFromCity(FROM_CITY)
                .shippingFromZipcode(FROM_POSTAL_CODE)
                .shippingToCountry(des.getCountry())
                .shippingToState(des.getState())
                .shippingToCity(toCity)
                .shippingToZipcode(des.getZip())
                .build();
    }


    @Override
    public void multiProcessGetShippingCostAllServiceType() {
        log.info("all service multi process get start, select postalcode!");
        List<CountryPostalCode> crawlerNeedDes = countryPostalCodeService.selectNotCrawlerPostalCode();
        log.info("postalcode data size: {} ", crawlerNeedDes.size());
        List<List<CountryPostalCode>> splitDatas = splitData(crawlerNeedDes, crawlerNeedDes.size() / (PROCESS_NUM * 2 - 1));
        int i = 0;
        for (List<CountryPostalCode> destinations : splitDatas) {
            log.info("submit task: {}", (++i));
            allServicePool.submit(new AllServiceTask(destinations));
        }
        log.info("all service multi process submit end!");
    }

    private class AllServiceTask implements Runnable {
        private List<CountryPostalCode> destinations;

        public AllServiceTask(List<CountryPostalCode> destinations) {
            this.destinations = destinations;
        }

        @Override
        public void run() {
            for (CountryPostalCode des : destinations) {
                try {
                    log.info(" destination zipcode: {}, start time: {}", des.getZip(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

                    List<ShippingCostArea> shippingCostAreaList = shippingCostAreaService.selectByShippingCompanyAndZipcode(FEDEX, des.getZip());
                    dealAcceptableCities(des, shippingCostAreaList);
                    getAllServiceTypeShippingCost(getShippingCostAreaByPostCode(des), shippingCostAreaList);

                    log.info(" destination zipcode: {}, end time: {}", des.getZip(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                } catch (Exception e) {
                    log.error("destination zipcode: {}, Exception: {}!", des.getZip(), e);
                }
            }
            log.info("{}, records is finished!", destinations.size());
        }
    }
}
