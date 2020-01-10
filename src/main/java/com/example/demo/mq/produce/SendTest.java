package com.example.demo.mq.produce;

import com.example.demo.entity.MpUser;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class SendTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void testSendMessage() {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId("1");
        MpUser shelly = MpUser.builder()
                .id(1L)
                .name("Shelly")
                .age(18)
                .email("www.skyStar.com")
                .build();
        rabbitTemplate.convertAndSend("order.exchange", "orderRoutingKeyOne", shelly, correlationData);
    }

}
