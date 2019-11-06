package com.example.demo.entity.ifelse;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserPayServiceStrategyFactory {
    private static final Map<String, UserPayService> SERVICES = new ConcurrentHashMap<>();

    public static UserPayService getByUserType(String type) {
        return SERVICES.get(type);
    }

    public static void register(String type, UserPayService service) {
        //验证null point exception
        SERVICES.put(type, service);
    }

}
