package com.caixia.config.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @auther: LiChaoChao
 * @date: 2018-12-17
 */
@Component
public class HelloSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        System.out.println("Sender : " + message + "....." + new Date());
        rabbitTemplate.convertAndSend("hello", message);//routingKey
    }
}
