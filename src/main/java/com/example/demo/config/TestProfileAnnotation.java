package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@Slf4j
public class TestProfileAnnotation {

    public TestProfileAnnotation() {
        log.error("TestProfileAnnotation------------------------");
    }

//    @PostConstruct
    public void init(){
        log.error("TestProfilegfsdgfsdhgfdshgfsdhgfdhgfdjhdfgjghfjhfgjhgAnnotation------------------------");
    }
}
