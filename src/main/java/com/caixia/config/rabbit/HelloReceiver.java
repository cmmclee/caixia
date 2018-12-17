package com.caixia.config.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @auther: LiChaoChao
 * @date: 2018-12-17
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver : " + message  + "....." + new Date());
    }
}
