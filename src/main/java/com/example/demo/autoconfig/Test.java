package com.example.demo.autoconfig;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;


public class Test implements ApplicationContextInitializer {
    public Test() {
        System.out.println("fdfdfdfdfdfdfddffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
    }
}
