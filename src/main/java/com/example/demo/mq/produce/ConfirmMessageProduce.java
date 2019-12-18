package com.example.demo.mq.produce;

import com.example.demo.entity.MpUser;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfirmMessageProduce {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    final RabbitTemplate.ConfirmCallback callback = new RabbitTemplate.ConfirmCallback() {
        @Override
        public void confirm(CorrelationData correlationData, boolean ack, String cause) {
            System.out.println("correlationData id: " + correlationData.getId());
            if (ack) {
                System.out.println("确认成功，进行数据库操作");
            } else {
                System.out.println("失败了，进行异常处理，重试补偿等操作");
            }
        }
    };

    public void sendMessage() {
        rabbitTemplate.setConfirmCallback(callback);
        CorrelationData correlationData = new CorrelationData("myShellyOne");
        MpUser shelly = MpUser.builder().id(1L).name("Shelly").age(18).email("www.skyStar.com").build();
        rabbitTemplate.convertAndSend("order-exchange", "order.ABC", shelly, correlationData);
        System.out.println("send success");
    }

}
