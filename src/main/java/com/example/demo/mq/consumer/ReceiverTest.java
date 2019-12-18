package com.example.demo.mq.consumer;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.io.IOException;
import java.util.Map;

//@Component
public class ReceiverTest {



//    @RabbitListener(bindings = {
//            @QueueBinding(
//                    value = @Queue(value = "order.queue"),
//                    exchange = @Exchange(value = "order.exchange"),
//                    key = {"orderRoutingKeyOne"}
//            )
//    })
//    @RabbitHandler
    public void onOrderMessage(@Payload Object user , @Headers Map<String,Object> headers, Channel channel) throws IOException {
        System.out.println("---------收到消息，开始消费---------");
        System.out.println(user);
        Long deliveryTag = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(deliveryTag,false);
    }


}
