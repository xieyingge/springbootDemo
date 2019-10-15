package com.example.demo.entity;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ShippingCompany {

    public final static Long FEDEX = 1L;
    public final static Long USPS = 2L;
    public final static Long DHL = 3L;

    public final static Long USPS_PRIORITY_MAIL = 10L;
    public final static Long USPS_PRIORITY_MAIL_EXPRESS_INTERNATIONAL = 12L;
    public final static Long USPS_PRIORITY_MAIL_INTERNATIONAL = 40L;
    public final static Long USPS_FIRST_CLASS_MAIL_INTERNATIONAL = 13L;
    public final static Long USPS_FIRST_CLASS_MAIL = 20L;

    public final static Long ADD_TO_LAST_ORDER = 17L;
    public final static Long ADD_TO_LAST_ORDER_WITHIN_US = 18L;

    public final static Long FEDEX_EXPRESS_SAVER = 1L;
    public final static Long FEDEX_2DAY = 3L;
    public final static Long FEDEX_2DAY_AM = 41L;
    public final static Long FEDEX_PRIORITY_OVERNIGHT = 4L;
    public final static Long FEDEX_STANDARD_OVERNIGHT = 5L;
    public final static Long FEDEX_INTERNATIONAL_PRIORITY = 7L;
    public final static Long FEDEX_INTERNATIONAL_ECONOMY = 8L;
    public final static Long FEDEX_GROUND = 9L;
    public final static Long FEDEX_SATURDAY_DELIVERY = 19L;
    public final static Long FEDEX_INTERNATIONAL_GROUND = 24L;
    public final static Long FEDEX_INTERNATIONAL_PRIORITY_SATRUDAY_DELICERY = 42L;


    public static final Map<Long, String> FEDEX_SERVICE_TYPE = new HashMap<>();

    public static Long getFedexServiceTypeIdByName(String serviceName) {
        if (StringUtils.isBlank(serviceName)) {
            return null;
        }
        for (Map.Entry<Long, String> entry : FEDEX_SERVICE_TYPE.entrySet()) {
            if (entry.getValue().equals(serviceName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    static {
        FEDEX_SERVICE_TYPE.put(4L, "PRIORITY_OVERNIGHT");
        FEDEX_SERVICE_TYPE.put(5L, "STANDARD_OVERNIGHT");
        FEDEX_SERVICE_TYPE.put(41L, "FEDEX_2_DAY_AM");
        FEDEX_SERVICE_TYPE.put(3L, "FEDEX_2_DAY");
        FEDEX_SERVICE_TYPE.put(1L, "FEDEX_EXPRESS_SAVER");
        FEDEX_SERVICE_TYPE.put(9L, "FEDEX_GROUND");
    }

    public static List<Long> getCrawlerNeedFedexCompany() {
        return Arrays.asList(
                FEDEX_PRIORITY_OVERNIGHT, FEDEX_STANDARD_OVERNIGHT,
                FEDEX_2DAY_AM, FEDEX_2DAY,
                FEDEX_EXPRESS_SAVER, FEDEX_GROUND
        );
    }


    public static List<Long> getFedexCompanies() {
        Long[] fedexCompanies = {FEDEX_EXPRESS_SAVER, FEDEX_2DAY, FEDEX_PRIORITY_OVERNIGHT,
                FEDEX_STANDARD_OVERNIGHT, FEDEX_INTERNATIONAL_PRIORITY, FEDEX_INTERNATIONAL_ECONOMY,
                FEDEX_GROUND, FEDEX_SATURDAY_DELIVERY, FEDEX_INTERNATIONAL_GROUND, FEDEX_INTERNATIONAL_PRIORITY_SATRUDAY_DELICERY};
        return Arrays.asList(fedexCompanies);
    }

    public static List<Long> getFedexOvernightCompanies() {
        Long[] fedexOvernightCompanies = {FEDEX_STANDARD_OVERNIGHT, FEDEX_PRIORITY_OVERNIGHT};
        return Arrays.asList(fedexOvernightCompanies);
    }

    public static List<Long> getOvernightCompanies() {
        Long[] companies = {FEDEX_EXPRESS_SAVER, FEDEX_2DAY, FEDEX_STANDARD_OVERNIGHT, FEDEX_PRIORITY_OVERNIGHT, FEDEX_2DAY_AM,};
        return Arrays.asList(companies);
    }

    public static List<Long> getUspsCompanies() {
        Long[] uspsCompanies = {USPS_PRIORITY_MAIL, USPS_PRIORITY_MAIL_EXPRESS_INTERNATIONAL,
                USPS_FIRST_CLASS_MAIL_INTERNATIONAL, USPS_FIRST_CLASS_MAIL, USPS_PRIORITY_MAIL_INTERNATIONAL};
        return Arrays.asList(uspsCompanies);
    }

    public static boolean isUspsCompany(Long shippingCompany) {
        List<Long> uspsCompanies = getUspsCompanies();
        return uspsCompanies.contains(shippingCompany);
    }

    public static Set<Long> getCompaniesDeliverableInSpecificTime() {
        Long[] homePageCutOffTimeCompanies = {
                ShippingCompany.FEDEX_PRIORITY_OVERNIGHT,
                ShippingCompany.FEDEX_STANDARD_OVERNIGHT,
                ShippingCompany.FEDEX_SATURDAY_DELIVERY,
                ShippingCompany.FEDEX_2DAY
        };
        return new HashSet<Long>(Arrays.asList(homePageCutOffTimeCompanies));
        //return Arrays.asList(homePageCutOffTimeCompanies);
    }

    public static Set<Long> getCompaniesDeliverableOverNight() {
        Long[] homePageCutOffTimeCompanies = {
                ShippingCompany.FEDEX_PRIORITY_OVERNIGHT,
                ShippingCompany.FEDEX_STANDARD_OVERNIGHT,
                ShippingCompany.FEDEX_SATURDAY_DELIVERY
        };
        return new HashSet<>(Arrays.asList(homePageCutOffTimeCompanies));
    }

    public static List<Long> getMergeCompanies() {
        Long[] uspsCompanies = {ADD_TO_LAST_ORDER, ADD_TO_LAST_ORDER_WITHIN_US};
        return Arrays.asList(uspsCompanies);
    }

    public static Map<Long, String> getFedexWeekendShipping() {
        Map<Long, String> result = new HashMap<>();
        result.put(19L, "FedEx Saturday Delivery");
        result.put(42L, "FedEx International Priority Saturday Delivery");
        return result;
    }

    public static boolean isMergeCompany(Long shippingCompany) {
        List<Long> mergeCompanies = getMergeCompanies();
        return mergeCompanies.contains(shippingCompany);
    }


}
