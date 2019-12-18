package com.example.demo.test;

import com.example.demo.mq.produce.SendTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MqTest {

    @Autowired
    private SendTest sendTest;


    @Test
    public void test(){
        sendTest.testSendMessage();
        System.out.println("send message success!!");
    }

}
