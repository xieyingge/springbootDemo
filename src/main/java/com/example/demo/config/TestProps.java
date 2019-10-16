package com.example.demo.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
//@PropertySource(value = {"classpath:config/myProps.yml"}, factory = YamlConfigFactory.class)
//@ConfigurationProperties(prefix = "testprops", ignoreInvalidFields = true)
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class TestProps {
    private String simpleProps;
    private String[] arrayProps;
    private List<Map<String, String>> listProp1 = new ArrayList<>();
    private List<String> listProp2 = new ArrayList<>();
    private Map<String, String> mapProps = new HashMap<>();
    private List<MyPoJo> myPoJos;

}
