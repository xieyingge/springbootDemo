package com.example.demo.util;


import com.example.demo.entity.ShippingCostArea;
import com.example.demo.fedex.rate.stub.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.types.NonNegativeInteger;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
public class ShippingCostUtil {

    public static final Map<String, Integer> FEDEX_SERVICE_TYPE_LOCAL = new HashMap<>();
    public static final Map<String, Integer> FEDEX_SERVICE_TYPE_INTERNATIONAL = new HashMap<>();


    static {
        FEDEX_SERVICE_TYPE_LOCAL.put("PRIORITY_OVERNIGHT", 4);
        FEDEX_SERVICE_TYPE_LOCAL.put("STANDARD_OVERNIGHT", 5);
        FEDEX_SERVICE_TYPE_LOCAL.put("FEDEX_2_DAY_AM", 41);
        FEDEX_SERVICE_TYPE_LOCAL.put("FEDEX_2_DAY", 3);
        FEDEX_SERVICE_TYPE_LOCAL.put("FEDEX_EXPRESS_SAVER", 1);
        FEDEX_SERVICE_TYPE_LOCAL.put("FEDEX_GROUND", 9);

        FEDEX_SERVICE_TYPE_INTERNATIONAL.put("INTERNATIONAL_PRIORITY", 7);
        FEDEX_SERVICE_TYPE_INTERNATIONAL.put("INTERNATIONAL_ECONOMY", 8);
    }

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
            RateReply reply = port.getRates(request); // Service call

            return reply;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        processShippingCostWweightRange(BigDecimal.valueOf(100), BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.1), "FEDEX_2_DAY");
    }

    public static void processShippingCostWweightRange(final BigDecimal destination, final BigDecimal increment, BigDecimal startWeight, String serviceType) {
        if (startWeight.compareTo(BigDecimal.valueOf(0.0)) < 0) {
            return;
        }
        BigDecimal weight = startWeight;
        int time = 0;
        BigDecimal preShippingCost = null;
        BigDecimal startW = weight;
        BigDecimal endW = null;

        Party from = from();
        Party to = to();
        List<ShippingCostArea> result = new ArrayList<>();
        for (; ; ) {
            RateReply reply = getShippingCostReply(serviceType, "YOUR_PACKAGING", from, to, addLineItem(weight));
            BigDecimal shippingCost = (BigDecimal) getShippingCost(reply);
            System.out.println("star weight: " + startW + " current weight: " + weight);

            if (++time == 3) {
                break;
            }
            // if return is error retry 3 times
            if (shippingCost == null) {
                System.out.println("reply is error, retry....,  " + time);
                continue;
            }
            time = 0;
            System.out.println("preShippingCost: " + preShippingCost + " currentShippingCost: " + shippingCost);
            System.out.println();
            //fist time pre is null bigdecimal compare will exception
            if (preShippingCost != null && shippingCost.compareTo(preShippingCost) != 0) {
                endW = weight.subtract(increment);
                System.out.println("区间： [ " + startW + " , " + endW + " ]");


                ShippingCostArea build = ShippingCostArea.builder()
//                        .shippingMethod(FEDEX_SERVICE_TYPE.get(serviceType))
//                        .shippingCompany(1)
//                        .weightFrom(startW.toPlainString())
//                        .weightTo(endW.toPlainString())
//                        .shippingFee(preShippingCost.toPlainString())
                        .shippingFromCountry(from.getAddress().getCountryCode())
                        .shippingFromState(from.getAddress().getStateOrProvinceCode())
                        .shippingFromCity(from.getAddress().getCity())
                        .shippingFromZipcode(from.getAddress().getPostalCode())
                        .shippingToCountry(to.getAddress().getCountryCode())
                        .shippingToState(to.getAddress().getStateOrProvinceCode())
                        .shippingToCity(to.getAddress().getCity())
                        .shippingToZipcode(to.getAddress().getPostalCode())
                        .build();

                result.add(build);

                if (result.size() >= 100 || weight.compareTo(destination) == 0) {

                }

                startW = weight;
                preShippingCost = shippingCost;
            }
            // first time set value
            if (preShippingCost == null) {
                preShippingCost = shippingCost;
            }

            if (weight.compareTo(destination) == 0) {
                break;
            }
            weight = weight.add(increment);
        }
        System.out.println("end!!!");
    }

    public static Map<String, BigDecimal> getShippingCost(RateReply reply) {
        try {
            RateReplyDetail[] rrds = reply.getRateReplyDetails();
            RateReplyDetail rrd = rrds[0];

            RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
            RatedShipmentDetail rsd = rsds[0];

            ShipmentRateDetail srd = rsd.getShipmentRateDetail();
            Map<String, BigDecimal> map = new HashMap<>();
            map.put("totalNetCharge", srd.getTotalNetCharge().getAmount());

            RatedPackageDetail[] rpds = rsd.getRatedPackages();
            RatedPackageDetail rpd = rpds[0];

            PackageRateDetail prd = rpd.getPackageRateDetail();
            map.put("BaseCharge", prd.getBaseCharge().getAmount());
            Surcharge[] surcharges = prd.getSurcharges();
            StringBuilder fcsb = new StringBuilder();
            BigDecimal sumSb = new BigDecimal(0);
            for (int i = 0; i < surcharges.length; i++) {
                Surcharge surcharge = surcharges[i];
                if (surcharge.getDescription().contains("Fuel")) {
                    map.put("FuelSurcharge", surcharge.getAmount().getAmount());
                } else {
                    fcsb.append(surcharge.getDescription()).append("+");
                    sumSb = sumSb.add(surcharge.getAmount().getAmount());
                }
            }
            if (fcsb.length() > 0) {
                fcsb.delete(fcsb.length() - 1, fcsb.length());
                map.put(fcsb.toString(), sumSb);
            }
            return map;
        } catch (Exception e) {
            log.error("get shipping cost map exception!");
        }
        return new HashMap<>();
    }

    private static RequestedPackageLineItem addLineItem(BigDecimal weight) {
        RequestedPackageLineItem lineItem = new RequestedPackageLineItem();
        lineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        lineItem.setWeight(new Weight(WeightUnits.LB, weight));
        lineItem.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
//            lineItem.setDimensions(new Dimensions(new NonNegativeInteger("10"), new NonNegativeInteger("10"), new NonNegativeInteger("10"), LinearUnits.IN));
        return lineItem;
    }


    private static Party from() {
        Party party = new Party();
        Address address = new Address(); // Origin information
        address.setStreetLines(new String[]{"65 Vesta St"});
        address.setCity("San Francisco");//田纳西州 的城市 孟菲斯
        address.setStateOrProvinceCode("CA");//田纳西州
        address.setPostalCode("941124");
        address.setCountryCode("US");//美国
        party.setAddress(address);
        return party;
    }

    private static Party to() {
        Party party = new Party();
        Address address = new Address(); // Origin information
//        address.setStreetLines(new String[]{"SHIPPER ADDRESS LINE 1"});
        address.setCity("Diamond Bar");//钻石吧 又为 戴蒙德吧  美国的一个城市
        address.setStateOrProvinceCode("CA");//加利福尼亚州
        address.setPostalCode("91765");
        address.setCountryCode("US");
        party.setAddress(address);
        return party;
    }


//    public static void main(String[] args) {
//        // Build a RateRequest request object
//        boolean getAllRatesFlag = true; // set to true to get the rates for different service types
//        RateRequest request = new RateRequest();
//
//        request.setClientDetail(createClientDetail());
//        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
//
//        //
//        TransactionDetail transactionDetail = new TransactionDetail();
//        transactionDetail.setCustomerTransactionId("java sample - Rate Available Service Request"); // The client will get the same value back in the response
//        request.setTransactionDetail(transactionDetail);
//
//        //
//        VersionId versionId = new VersionId("crs", 26, 0, 0);
//        request.setVersion(versionId);
//
//        //
//        //request.setReturnTransitAndCommit(true);
//        RequestedShipment requestedShipment = new RequestedShipment();
//
//        requestedShipment.setShipTimestamp(Calendar.getInstance());
//        //指定将包裹交给 FedEx 所用的方法。此元素不会派遣速递员进行包裹取件
//        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
//        if (getAllRatesFlag) {
//            requestedShipment.setServiceType("FEDEX_2_DAY");
//            requestedShipment.setPackagingType("YOUR_PACKAGING");
//        }
//        requestedShipment.setShipper(addShipper());
//        requestedShipment.setRecipient(addDomesticRecipient());
//        //指出要以哪种方式和途径向Fedex支付托运服务费用的描述性数据
////        requestedShipment.setShippingChargesPayment(addShippingChargesPayment());
//
//        requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[]{addRequestedPackageLineItem()});
//        requestedShipment.setPackageCount(new NonNegativeInteger("1"));
//        request.setRequestedShipment(requestedShipment);
//
//        //
//        try {
//            // Initialize the service
//            RateServiceLocator service;
//            RatePortType port;
//            //
//            service = new RateServiceLocator();
//            updateEndPoint(service);
//            port = service.getRateServicePort();
//            // This is the call to the web service passing in a RateRequest and returning a RateReply
//            RateReply reply = port.getRates(request); // Service call
//            if (isResponseOk(reply.getHighestSeverity())) {
//                writeServiceOutput(reply);
//            }
//            printNotifications(reply.getNotifications());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void writeServiceOutput(RateReply reply) {
        RateReplyDetail[] rrds = reply.getRateReplyDetails();
        for (int i = 0; i < rrds.length; i++) {
            RateReplyDetail rrd = rrds[i];
            print("\nService type", rrd.getServiceType());
            print("Packaging type", rrd.getPackagingType());
            printTime("Delivery Date", rrd.getDeliveryTimestamp(), TimeZone.getTimeZone("PTS"));
            print("Test Date", getLocalTimeAsStringFromNoneOffsetCalendar(rrd.getDeliveryTimestamp()));
            if (rrd.getTransitTime() != null) print("Transit Time: ", rrd.getTransitTime().toString());
            RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
            for (int j = 0; j < rsds.length; j++) {
                print("RatedShipmentDetail " + j, "");
                RatedShipmentDetail rsd = rsds[j];
                ShipmentRateDetail srd = rsd.getShipmentRateDetail();
                print("  Rate type", srd.getRateType());
                printWeight("  Total Billing weight", srd.getTotalBillingWeight());
                printMoney("  Total surcharges", srd.getTotalSurcharges());
                printMoney("  Total net charge", srd.getTotalNetCharge());

                RatedPackageDetail[] rpds = rsd.getRatedPackages();
                if (rpds != null && rpds.length > 0) {
                    print("  RatedPackageDetails", "");
                    for (int k = 0; k < rpds.length; k++) {
                        print("  RatedPackageDetail " + i, "");
                        RatedPackageDetail rpd = rpds[k];
                        PackageRateDetail prd = rpd.getPackageRateDetail();
                        if (prd != null) {
                            printWeight("    Billing weight", prd.getBillingWeight());
                            printMoney("    Base charge", prd.getBaseCharge());
                            Surcharge[] surcharges = prd.getSurcharges();
                            if (surcharges != null && surcharges.length > 0) {
                                for (int m = 0; m < surcharges.length; m++) {
                                    Surcharge surcharge = surcharges[m];
                                    printMoney("    " + surcharge.getDescription() + " surcharge", surcharge.getAmount());
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("");
    }

    //If TimeStamp is not offset Java assumes UTC.
    //By setting the TimeZone to UTC the correct time is displayed.
    private static void printTime(String description, Calendar calendar, TimeZone timeZone) {
        if (calendar != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy h:mm a");
            dateFormat.setTimeZone(timeZone);
            String displayDate = dateFormat.format(calendar.getTime());
            System.out.println(description + ": " + displayDate);

        }
    }

    private static void printTime(String description, Calendar calendar) {
        if (calendar != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy h:mm a");
            String displayDate = dateFormat.format(calendar.getTime());
            System.out.println(description + ": " + displayDate);

        }
    }

    private static String getLocalTimeAsStringFromNoneOffsetCalendar(Calendar noneOffsetCalendar) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy h:mm a");
        if (noneOffsetCalendar != null) {
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return dateFormat.format(noneOffsetCalendar.getTime());
        }
        return dateFormat.format(Calendar.getInstance().getTime());
    }

    private static Party addShipper() {
        Party party = new Party();
        Address address = new Address(); // Origin information
        address.setStreetLines(new String[]{"SHIPPER ADDRESS LINE 1"});
        address.setCity("Memphis");//田纳西州 的城市 孟菲斯
        address.setStateOrProvinceCode("TN");//田纳西州
        address.setPostalCode("38115");
        address.setCountryCode("US");//美国
        party.setAddress(address);
        return party;
    }

    private static Party addInternationalRecipient() {
        Party party = new Party();
        Address address = new Address(); // Destination information
        address.setStreetLines(new String[]{"RECIPIENT ADDRESS LINE 1"});
        address.setCity("Anjou");
        address.setStateOrProvinceCode("PQ");
        address.setPostalCode("H1J2V8");
        address.setCountryCode("CA");
        party.setAddress(address);
        return party;
    }

    private static Party addDomesticRecipient() {
        Party party = new Party();
        Address address = new Address(); // Origin information
//        address.setStreetLines(new String[]{"SHIPPER ADDRESS LINE 1"});
        address.setCity("Diamond Bar");//钻石吧 又为 戴蒙德吧  美国的一个城市
        address.setStateOrProvinceCode("CA");//加利福尼亚州
        address.setPostalCode("91765");
        address.setCountryCode("US");
        party.setAddress(address);
        return party;
    }

    private static Payment addShippingChargesPayment() {
        Payment payment = new Payment();
        payment.setPaymentType(PaymentType.SENDER);
        return payment;
    }

    private static RequestedPackageLineItem addRequestedPackageLineItem() {
        RequestedPackageLineItem lineItem = new RequestedPackageLineItem();
        lineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        lineItem.setWeight(new Weight(WeightUnits.LB, new BigDecimal(15.0)));
        lineItem.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
        lineItem.setDimensions(new Dimensions(new NonNegativeInteger("1"), new NonNegativeInteger("1"), new NonNegativeInteger("1"), LinearUnits.IN));
        return lineItem;
    }

    private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
//        String accountNumber = System.getProperty("accountNumber");
//        String meterNumber = System.getProperty("meterNumber");
//
//        //
//        // See if the accountNumber and meterNumber properties are set,
//        // if set use those values, otherwise default them to "XXX"
//        //
//        if (accountNumber == null) {
//        	accountNumber = "XXX"; // Replace "XXX" with clients account number
//        }
//        if (meterNumber == null) {
//        	meterNumber = "XXX"; // Replace "XXX" with clients meter number
//        }
        String accountNumber = "510087100";
        String meterNumber = "119022197";
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
//        String key = System.getProperty("key");
//        String password = System.getProperty("password");
//        //
//        // See if the key and password properties are set,
//        // if set use those values, otherwise default them to "XXX"
//        //
//        if (key == null) {
//        	key = "XXX"; // Replace "XXX" with clients key
//        }
//        if (password == null) {
//        	password = "XXX"; // Replace "XXX" with clients password
//        }
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

    private synchronized static void printNotifications(Notification[] notifications) {
        System.out.println(" Notifications:");
        if (notifications == null || notifications.length == 0) {
            System.out.println("  No notifications returned");
        }
        for (int i = 0; i < notifications.length; i++) {
            Notification n = notifications[i];
            System.out.print("  Notification no. " + i + ": ");
            if (n == null) {
                System.out.println("null");
                continue;
            } else {
                System.out.println("");
            }
            NotificationSeverityType nst = n.getSeverity();

            System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
            System.out.println("    Code: " + n.getCode());
            System.out.println("    Message: " + n.getMessage());
            System.out.println("    Source: " + n.getSource());
        }
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

    private static void print(String msg, Object obj) {
        if (msg == null || obj == null) {
            return;
        }
        System.out.println(msg + ": " + obj.toString());
    }

    private static void printMoney(String msg, Money money) {
        if (msg == null || money == null) {
            return;
        }
        System.out.println(msg + ": " + money.getAmount() + " " + money.getCurrency());
    }

    private static void printWeight(String msg, Weight weight) {
        if (msg == null || weight == null) {
            return;
        }
        System.out.println(msg + ": " + weight.getValue() + " " + weight.getUnits());
    }

    private static void updateEndPoint(RateServiceLocator serviceLocator) {
        String endPoint = System.getProperty("endPoint");
        if (endPoint != null) {
            serviceLocator.setRateServicePortEndpointAddress(endPoint);
        }
    }

}
