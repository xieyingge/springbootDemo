package com.example.demo.service.impl;

import com.example.demo.dao.ShippingCostCrawlerDao;
import com.example.demo.entity.ShippingCostArea;
import com.example.demo.entity.ShippingCostCrawler;
import com.example.demo.fedex.rate.stub.*;
import com.example.demo.service.ShippingCostAreaService;
import com.example.demo.service.ShippingCostCrawlerService;
import com.example.demo.util.ShippingCostUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.types.NonNegativeInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.example.demo.entity.ShippingCompany.FEDEX;
import static com.example.demo.entity.ShippingCompany.FEDEX_SERVICE_TYPE;
import static com.example.demo.util.ShippingCostUtil.getShippingCost;
import static com.example.demo.util.ShippingCostUtil.isResponseOk;


@Service
@Slf4j
public class ShippingCostCrawlerServiceImpl implements ShippingCostCrawlerService {
    private static final BigDecimal DESTINATION = BigDecimal.valueOf(100);
    private static final BigDecimal INCREMENT = BigDecimal.valueOf(0.1);
    private static final BigDecimal START_WEIGHT = BigDecimal.valueOf(0.1);

    @Autowired
    private ShippingCostAreaService shippingCostAreaService;

    @Autowired
    private ShippingCostCrawlerDao dao;


    @Override
    public void insertBatch(List<ShippingCostCrawler> params) {
        dao.insertBatch(params);
    }

    @Override
    public void insert(ShippingCostCrawler param) {
        dao.insert(param);
    }

    @Override
    public void nomalProcessGetShippingCostAndInsert() {
        List<ShippingCostArea> shippingCostAreaList = shippingCostAreaService.selectByShippingCompany(FEDEX);
        for (ShippingCostArea area : shippingCostAreaList) {
            getShippingCostAndInsert(
                    FEDEX_SERVICE_TYPE.get(area.getShippingMethodId()),
                    area
            );
        }
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


    private void getShippingCostAndInsert(String serviceType, ShippingCostArea area) {
        if (START_WEIGHT.compareTo(BigDecimal.valueOf(0.0)) < 0) {
            return;
        }
        Party shipper = getFromParty(area);
        Party recipient = getToParty(area);
        BigDecimal weight = START_WEIGHT;
        BigDecimal preShippingCost = null;
        BigDecimal startW = weight;

        List<ShippingCostCrawler> result = new ArrayList<>();
        for (; ; ) {
            if (weight.compareTo(DESTINATION) == 0) {
                if (!result.isEmpty()) {
                    insertBatch(result);
                    result.clear();
                }
                break;
            }

            RateReply reply = ShippingCostUtil.getShippingCostReply(serviceType, "YOUR_PACKAGING", shipper, recipient, addLineItem(weight));
            if (reply == null) {
                break;
            }
            BigDecimal shippingCost = null;
            Map<String, BigDecimal> shippingCostMap = null;
            if (isResponseOk(reply.getHighestSeverity())) {
                shippingCostMap = getShippingCost(reply);
                shippingCost = shippingCostMap.get("totalNetCharge");
            } else {
                dealErrorReply(area, reply);
            }

            if (shippingCost == null) {
                break;
            }

            //fist time pre is null bigdecimal compare will exception
            if (preShippingCost != null && shippingCost.compareTo(preShippingCost) != 0) {
                BigDecimal endW = weight.subtract(INCREMENT);

                ShippingCostCrawler build = getShippingCostCrawler(area, preShippingCost, startW, shippingCostMap, endW);
                result.add(build);
                if (result.size() >= 1) {
                    insertBatch(result);
                    result.clear();
                }
                startW = weight;
                preShippingCost = shippingCost;
            }
            // first time set value
            if (preShippingCost == null) {
                preShippingCost = shippingCost;
            }

            weight = weight.add(INCREMENT);
        }
    }

    private ShippingCostCrawler getShippingCostCrawler(ShippingCostArea area, BigDecimal preShippingCost, BigDecimal startW, Map<String, BigDecimal> shippingCostMap, BigDecimal endW) {
        Set<String> keySet = shippingCostMap.keySet();
        keySet.remove("BaseCharge");
        keySet.remove("FuelSurcharge");
        String keyC = keySet.iterator().next();
        return ShippingCostCrawler.builder()
                .shippingCostAreaId(area.getId())
                .weightFrom(startW)
                .weightTo(endW)
                .shippingFee(preShippingCost)
                .feeAName("BaseCharge")
                .feeA(shippingCostMap.get("BaseCharge"))
                .feeBName("FuelSurcharge")
                .feeB(shippingCostMap.get("FuelSurcharge"))
                .feeCName(keyC)
                .feeC(shippingCostMap.get(keyC)).build();
    }

    private static RequestedPackageLineItem addLineItem(BigDecimal weight) {
        RequestedPackageLineItem lineItem = new RequestedPackageLineItem();
        lineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        lineItem.setWeight(new Weight(WeightUnits.LB, weight));
        lineItem.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
//            lineItem.setDimensions(new Dimensions(new NonNegativeInteger("10"), new NonNegativeInteger("10"), new NonNegativeInteger("10"), LinearUnits.IN));
        return lineItem;
    }

    private void dealErrorReply(ShippingCostArea area, RateReply reply) {
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
                    shippingCostAreaService.updateErrorCodeAndMesage(area);
                    break;
                }
            }
        } catch (Exception ignore) {
            log.error("deal error exception!");
        }
    }


}
