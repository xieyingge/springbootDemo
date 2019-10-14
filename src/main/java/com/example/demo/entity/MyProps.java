package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;

//@ConfigurationProperties
//@Component
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@ToString
public class MyProps {

    @Value("${myProp.name}")
    private String name;

}
