package com.example.demo.mq.consumer;

import com.example.demo.entity.MpUser;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

//@Component
public class ConfirmMessageConsumer {



    //配置监听的哪一个队列，同时在没有queue和exchange的情况下会去创建并建立绑定关系
    @RabbitListener(
            bindings = {
                    @QueueBinding(
                            value = @Queue(value = "order-queue", durable = "true"),
                            exchange = @Exchange(value = "order-exchange", durable = "true", type = "topic"),
                            key = "order.*"
                    )
            }
    )
    @RabbitHandler//如果有消息过来，在消费的时候调用这个方法
    public void consumerMessage(@Payload MpUser mpUser, @Headers Map<String, Object> hearders, Channel channel) throws IOException {
        System.out.println("------ 收到消息，开始消费消息 -------");
        System.out.println("user Id: " + mpUser.getId());

        /**
         * Delivery Tag 用来标识信道中投递的消息。RabbitMQ 推送消息给 Consumer 时，会附带一个 Delivery Tag，
         * 以便 Consumer 可以在消息确认时告诉 RabbitMQ 到底是哪条消息被确认了。
         * RabbitMQ 保证在每个信道中，每条消息的 Delivery Tag 从 1 开始递增。
         */
        Long deliveryTag = (Long) hearders.get(AmqpHeaders.DELIVERY_TAG);


        /**
         *  multiple 取值为 false 时，表示通知 RabbitMQ 当前消息被确认
         *  如果为 true，则额外将比第一个参数指定的 delivery tag 小的消息一并确认
         */
        boolean multiple = false;
        channel.basicAck(deliveryTag, false);
    }


}
