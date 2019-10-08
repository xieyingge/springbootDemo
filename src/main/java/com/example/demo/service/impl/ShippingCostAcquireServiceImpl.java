package com.example.demo.service.impl;

import com.example.demo.dao.ShippingCostAcquireDao;
import com.example.demo.entity.CountryPostalCode;
import com.example.demo.entity.ShippingCostAcquire;
import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.ShippingCostAcquireService;
import com.example.demo.util.ThreadPoolUtil;
import com.fedex.rate.stub.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.types.NonNegativeInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

import static com.example.demo.util.ShippingCostUtil.*;


@Service
@Slf4j
public class ShippingCostAcquireServiceImpl implements ShippingCostAcquireService {

    @Autowired
    private ShippingCostAcquireDao dao;

    @Autowired
    private CountryPostalCodeService countryPostalCodeService;

    private static final int PROCESS_NUM = Runtime.getRuntime().availableProcessors();
    private static final ThreadFactory THREAD_FACTORY = ThreadPoolUtil.getNamedThreadFactory("shipping-cost-%d");
    private ExecutorService pool = ThreadPoolUtil.getPool(2 * PROCESS_NUM, 4 * PROCESS_NUM, 60L, THREAD_FACTORY);
    private static final BigDecimal DESTINATION = BigDecimal.valueOf(100);
    private static final BigDecimal INCREMENT = BigDecimal.valueOf(0.1);
    private static final BigDecimal START_WEIGHT = BigDecimal.valueOf(0.1);


    public void multiProcessGetShippingCostAndInsert() {
        List<CountryPostalCode> datas = countryPostalCodeService.selectAll();
        List<List<CountryPostalCode>> splitedData = splitData(datas, 5000);
        for (List<CountryPostalCode> countryPostalCodeList : splitedData) {
            Set<String> serviceTypes = FEDEX_SERVICE_TYPE_LOCAL.keySet();
            for (String service : serviceTypes) {
                pool.execute(new Task(
                        countryPostalCodeList,
                        DESTINATION,
                        INCREMENT,
                        START_WEIGHT,
                        service,
                        from()
                ));
            }
        }
    }

    private class Task implements Runnable {
        private List<CountryPostalCode> datas;
        private BigDecimal destinationPound;
        private BigDecimal increment;
        private BigDecimal startWeight;
        private String serviceType;
        private Party shipper;


        public Task(List<CountryPostalCode> datas, BigDecimal destinationPound, BigDecimal increment, BigDecimal startWeight, String serviceType, Party shipper) {
            this.datas = datas;
            this.destinationPound = destinationPound;
            this.increment = increment;
            this.startWeight = startWeight;
            this.serviceType = serviceType;
            this.shipper = shipper;
        }

        @Override
        public void run() {
            for (CountryPostalCode receiver : datas) {
                getShippingCostAndInsert(
                        destinationPound,
                        increment,
                        startWeight,
                        serviceType,
                        shipper,
                        getReceiverByCountryPostalCode(receiver)
                );
            }
        }
    }

    @Override
    public void getShippingCostAndInsert(final BigDecimal destination, final BigDecimal increment, BigDecimal startWeight, String serviceType, Party from, Party to) {
        if (startWeight.compareTo(BigDecimal.valueOf(0.0)) < 0) {
            return;
        }
        BigDecimal weight = startWeight;
        BigDecimal preShippingCost = null;
        BigDecimal startW = weight;

        List<ShippingCostAcquire> result = new ArrayList<>();
        for (; ; ) {
            if (weight.compareTo(destination) == 0) {
                break;
            }

            RateReply reply = getShippingCostByParams(serviceType, "YOUR_PACKAGING", from, to, addLineItem(weight));
            BigDecimal shippingCost = null;
            if (isResponseOk(reply.getHighestSeverity())) {
                shippingCost = getShippingCost(reply);
            } else {
                dealErrorReply(serviceType, from, to, reply);
            }
//            System.out.println("star weight: " + startW + " current weight: " + weight);

            if (shippingCost == null) {
                log.error(Thread.currentThread().getName() + "  reply is error ");
                break;
            }

//            System.out.println("preShippingCost: " + preShippingCost + " currentShippingCost: " + shippingCost);
//            System.out.println();

            //fist time pre is null bigdecimal compare will exception
            if (preShippingCost != null && shippingCost.compareTo(preShippingCost) != 0) {
                BigDecimal endW = weight.subtract(increment);
//                System.out.println("区间： [ " + startW + " , " + endW + " ]");

                ShippingCostAcquire build = getShippingCostAcquire(serviceType, preShippingCost, startW, endW, to, from);
                result.add(build);
                if (result.size() >= 10 || weight.compareTo(destination) == 0) {
                    dao.insertBatch(result);
                    log.info(Thread.currentThread().getName() + " 插入10 条成功！！");
                    result.clear();
                }

                startW = weight;
                preShippingCost = shippingCost;
            }
            // first time set value
            if (preShippingCost == null) {
                preShippingCost = shippingCost;
            }

            weight = weight.add(increment);
        }
//        System.out.println("end!!!");
    }

    private void dealErrorReply(String serviceType, Party from, Party to, RateReply reply) {
        Notification[] notifications = reply.getNotifications();
        if (notifications != null && notifications.length > 0) {
            for (int i = 0; i < notifications.length; i++) {
                Notification n = notifications[i];
                if (n == null) {
                    continue;
                }
                String code = n.getCode();
                String message = n.getMessage();
                ShippingCostAcquire build = getShippingCostAcquire(serviceType, null, null, null, to, from);
                build.setErrorCode(code);
                build.setErrorMessage(message);
                insert(build);
                log.info(Thread.currentThread().getName() + " 插入错误日志信息！！");
                break;
            }
        }
    }

    private static String bigDecimalToString(BigDecimal bigDecimal){
        return bigDecimal == null ? null : bigDecimal.toPlainString();
    }

    private ShippingCostAcquire getShippingCostAcquire(String serviceType, BigDecimal totalShippingCost, BigDecimal weightFrom, BigDecimal weightTo, Party to, Party from) {
        return ShippingCostAcquire.builder()
                .shippingMethod(FEDEX_SERVICE_TYPE_LOCAL.get(serviceType))
                .shippingCompany(1)
                .weightFrom(bigDecimalToString(weightFrom))
                .weightTo(bigDecimalToString(weightTo))
                .shippingFee(bigDecimalToString(totalShippingCost))
                .shippingFromCountry(from.getAddress().getCountryCode())
                .shippingFromState(from.getAddress().getStateOrProvinceCode())
                .shippingFromCity(from.getAddress().getCity())
                .shippingFromZipcode(from.getAddress().getPostalCode())
                .shippingToCountry(to.getAddress().getCountryCode())
                .shippingToState(to.getAddress().getStateOrProvinceCode())
                .shippingToCity(to.getAddress().getCity())
                .shippingToZipcode(to.getAddress().getPostalCode())
                .build();
    }


    public static Party from() {
        Party party = new Party();
        Address address = new Address();
//        address.setStreetLines(new String[]{"65 Vesta St"});
        address.setCity("Daly City");
        address.setStateOrProvinceCode("CA");
        address.setPostalCode("94014");
        address.setCountryCode("US");
        party.setAddress(address);
        return party;
    }


    private static RequestedPackageLineItem addLineItem(BigDecimal weight) {
        RequestedPackageLineItem lineItem = new RequestedPackageLineItem();
        lineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        lineItem.setWeight(new Weight(WeightUnits.LB, weight));
        lineItem.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
//            lineItem.setDimensions(new Dimensions(new NonNegativeInteger("10"), new NonNegativeInteger("10"), new NonNegativeInteger("10"), LinearUnits.IN));
        return lineItem;
    }


    private static Party getReceiverByCountryPostalCode(CountryPostalCode cpc) {
        Party party = new Party();
        Address address = new Address(); // Origin information
        address.setCountryCode(cpc.getCountry());
        address.setStateOrProvinceCode(cpc.getState());
        address.setCity(cpc.getCity());
        address.setPostalCode(cpc.getZip());
        party.setAddress(address);
        return party;
    }


    /**
     * 每组n个元素
     *
     * @param source 要分组的数据源
     * @param n      每组n个元素
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> splitData(List<T> source, int n) {

        if (null == source || source.size() == 0 || n <= 0)
            return null;
        List<List<T>> result = new ArrayList<List<T>>();
        int remainder = source.size() % n;
        int size = (source.size() / n);
        for (int i = 0; i < size; i++) {
            List<T> subset = null;
            subset = source.subList(i * n, (i + 1) * n);
            result.add(subset);
        }
        if (remainder > 0) {
            List<T> subset = null;
            subset = source.subList(size * n, size * n + remainder);
            result.add(subset);
        }
        return result;
    }


    @Override
    public int insert(ShippingCostAcquire param) {
        return dao.insert(param);
    }


    @Override
    public void nomalProcessGetShippingCostAndInsert() {
        List<CountryPostalCode> datas = countryPostalCodeService.selectAll();
        Set<String> serviceTypes = FEDEX_SERVICE_TYPE_LOCAL.keySet();
        for (CountryPostalCode countryPostalCode : datas) {
            for (String service : serviceTypes) {
                getShippingCostAndInsert(
                        DESTINATION,
                        INCREMENT,
                        START_WEIGHT
                        , service,
                        from(),
                        getReceiverByCountryPostalCode(countryPostalCode)
                );
            }
        }
    }
}
