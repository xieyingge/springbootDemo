package com.example.demo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@PropertySource(value = {"classpath:config/myProps.yml"}, factory = YamlConfigFactory.class)
@ConfigurationProperties(prefix = "testprops", ignoreInvalidFields = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestProps {
    private String simpleProps;
    private String[] arrayProps;
    private List<Map<String, String>> listProp1 = new ArrayList<>();
    private List<String> listProp2 = new ArrayList<>();
    private Map<String, String> mapProps = new HashMap<>();
    private List<MyPoJo> myPoJos;

}
