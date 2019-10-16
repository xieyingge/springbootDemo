package com.example.demo.util;


import com.example.demo.entity.ShippingCostFeeDetail;
import com.example.demo.fedex.rate.stub.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.types.NonNegativeInteger;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class ShippingCostUtil {

    private static AtomicInteger countServiceTimes = new AtomicInteger(0);


    /**
     * @param serviceType   FIRST_OVERNIGHT   PRIORITY_OVERNIGHT   STANDARD_OVERNIGHT   FEDEX_2_DAY_AM   FEDEX_2_DAY   FEDEX_EXPRESS_SAVER    FEDEX_GROUND
     * @param packagingType YOUR_PACKAGING   FEDEX_BOX
     * @param shipper       寄件人的   国家，州，城市，街道，邮编信息
     * @param recipient     收件人的地址信息同寄件人
     * @param huowushu
     */
    public static RateReply getShippingCostReply(String serviceType, String packagingType, Party shipper, Party recipient, RequestedPackageLineItem... huowushu) {
        RateRequest request = new RateRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        VersionId versionId = new VersionId("crs", 26, 0, 0);
        request.setVersion(versionId);

        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - Rate Available Service Request"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);

        RequestedShipment requestedShipment = new RequestedShipment();
        requestedShipment.setServiceType(serviceType);
        requestedShipment.setPackagingType(packagingType);
        requestedShipment.setShipTimestamp(Calendar.getInstance());
        //指定将包裹交给 FedEx 所用的方法。此元素不会派遣速递员进行包裹取件
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);

        requestedShipment.setShipper(shipper);
        requestedShipment.setRecipient(recipient);
        //指出要以哪种方式和途径向Fedex支付托运服务费用的描述性数据
        requestedShipment.setShippingChargesPayment(addShippingChargesPayment());

        requestedShipment.setRequestedPackageLineItems(huowushu);
        requestedShipment.setPackageCount(new NonNegativeInteger(String.valueOf(huowushu.length)));
        request.setRequestedShipment(requestedShipment);

        try {
            // Initialize the service
            RateServiceLocator service;
            RatePortType port;
            //
            service = new RateServiceLocator();
            updateEndPoint(service);
            port = service.getRateServicePort();
            // This is the call to the web service passing in a RateRequest and returning a RateReply
            countServiceTimes.incrementAndGet();
            RateReply reply = port.getRates(request); // Service call

            return reply;
        } catch (Exception e) {
            //这里exception，可能是掉接口被封掉了，暂停一小时。
            log.error("request exception, service is called {} times, service unvailable , sleep tem minutes， exception is ,{}", countServiceTimes.get(), e);
            sleep(10, TimeUnit.MINUTES);
            log.error("service restart after sleep ten minutes!");
        }
        return null;
    }


    public static Map<String, ShippingCostFeeDetail> getAllServiceTypeShippingCost(RateReply reply) {
        Map<String, ShippingCostFeeDetail> resultMap = new HashMap<>();
        RateReplyDetail[] rrds = reply.getRateReplyDetails();
        for (int i = 0; i < rrds.length; i++) {
            ShippingCostFeeDetail result = ShippingCostFeeDetail.builder().build();
            RateReplyDetail rrd = rrds[i];
            String serviceType = rrd.getServiceType();
            if ("FIRST_OVERNIGHT".equals(serviceType)
                    || "INTERNATIONAL_PRIORITY".equals(serviceType)
                    || "INTERNATIONAL_ECONOMY".equals(serviceType)) {
                continue;
            }
            resultMap.put(serviceType, result);

            RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
            for (int j = 0; j < rsds.length; j++) {
                RatedShipmentDetail rsd = rsds[j];
                ShipmentRateDetail srd = rsd.getShipmentRateDetail();

                result.setTotalNetCharge(srd.getTotalNetCharge().getAmount());

                RatedPackageDetail[] rpds = rsd.getRatedPackages();
                if (rpds != null && rpds.length > 0) {
                    for (int k = 0; k < rpds.length; k++) {
                        RatedPackageDetail rpd = rpds[k];
                        PackageRateDetail prd = rpd.getPackageRateDetail();
                        if (prd != null) {

                            result.setBaseCharge(prd.getBaseCharge().getAmount());

                            Surcharge[] surcharges = prd.getSurcharges();
                            if (surcharges != null && surcharges.length > 0) {
                                BigDecimal sumOther = new BigDecimal(0);
                                for (int m = 0; m < surcharges.length; m++) {
                                    Surcharge surcharge = surcharges[m];
                                    if (surcharge.getDescription().contains("Fuel")) {
                                        result.setFuelSurcharge(surcharge.getAmount().getAmount());
                                    } else {
                                        sumOther = sumOther.add(surcharge.getAmount().getAmount());
                                    }
                                }
                                result.setOther(sumOther);
                            }
                        }
                    }
                }
            }
        }
        return resultMap;
    }


    public static ShippingCostFeeDetail getShippingCost(RateReply reply) {
        ShippingCostFeeDetail result = ShippingCostFeeDetail.builder().build();
        try {
            RateReplyDetail[] rrds = reply.getRateReplyDetails();
            RateReplyDetail rrd = rrds[0];

            RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
            RatedShipmentDetail rsd = rsds[0];

            ShipmentRateDetail srd = rsd.getShipmentRateDetail();

            result.setTotalNetCharge(srd.getTotalNetCharge().getAmount());

            RatedPackageDetail[] rpds = rsd.getRatedPackages();
            RatedPackageDetail rpd = rpds[0];

            PackageRateDetail prd = rpd.getPackageRateDetail();

            result.setBaseCharge(prd.getBaseCharge().getAmount());

            Surcharge[] surcharges = prd.getSurcharges();
            BigDecimal sumOther = new BigDecimal(0);
            if (surcharges != null && surcharges.length > 0) {
                for (int i = 0; i < surcharges.length; i++) {
                    Surcharge surcharge = surcharges[i];
                    if (surcharge.getDescription().contains("Fuel")) {
                        result.setFuelSurcharge(surcharge.getAmount().getAmount());
                    } else {
                        sumOther = sumOther.add(surcharge.getAmount().getAmount());
                    }
                }
            }
            result.setOther(sumOther);
            return result;
        } catch (Exception e) {
            log.error("get shipping cost map exception!");
        }
        return ShippingCostFeeDetail.builder().build();
    }


    private static Payment addShippingChargesPayment() {
        Payment payment = new Payment();
        payment.setPaymentType(PaymentType.SENDER);
        return payment;
    }


    private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();

        String accountNumber = "510087100";
        String meterNumber = "119022197";
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();

        String key = "JKEkBA9iXzSjEtqR";
        String password = "w3qTfkEwiWF1BXF34m3IPfGQr";
        userCredential.setKey(key);
        userCredential.setPassword(password);

        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential = false; //Set this value to true is using a parent credential
        if (useParentCredential) {

            String parentKey = System.getProperty("parentkey");
            String parentPassword = System.getProperty("parentpassword");
            //
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
            //
            if (parentKey == null) {
                parentKey = "XXX"; // Replace "XXX" with clients parent key
            }
            if (parentPassword == null) {
                parentPassword = "XXX"; // Replace "XXX" with clients parent password
            }
            parentCredential = new WebAuthenticationCredential();
            parentCredential.setKey(parentKey);
            parentCredential.setPassword(parentPassword);
        }
        return new WebAuthenticationDetail(parentCredential, userCredential);
    }



    public static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
        if (notificationSeverityType == null) {
            return false;
        }
        if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
                notificationSeverityType.equals(NotificationSeverityType.NOTE) ||
                notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
            return true;
        }
        return false;
    }


    private static void updateEndPoint(RateServiceLocator serviceLocator) {
        String endPoint = System.getProperty("endPoint");
        if (endPoint != null) {
            serviceLocator.setRateServicePortEndpointAddress(endPoint);
        }
    }

    public static void sleep(long time, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

}
