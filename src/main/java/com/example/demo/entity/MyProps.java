package com.example.demo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MyProps {

    @Value("${myProp.name}")
    private String name;

}
