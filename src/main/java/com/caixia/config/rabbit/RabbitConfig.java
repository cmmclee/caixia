package com.caixia.config.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @auther: LiChaoChao
 * @date: 2018-12-17
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange("exchange");
    }

    @Bean
    Binding bindingDirectExchange(Queue helloQueue, DirectExchange exchange) {
        return BindingBuilder.bind(helloQueue).to(exchange).with("hello");//bindingKey
    }
}
