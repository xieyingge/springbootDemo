package com.example.demo.scheduling;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class ShippingCostAcquireScheduling {

//    @Scheduled(cron = "0/1 * * * * ?")
    public void getCurrentDate(){
        log.info(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
