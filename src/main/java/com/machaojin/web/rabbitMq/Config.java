package com.machaojin.web.rabbitMq;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class Config {

    //生成两个队列分别是短信消息队列和邮件消息队列
    @Bean
    public Queue Message(){
        return new Queue("message");
    }

    @Bean
    public Queue Email(){
        return new Queue("e-mail");
    }

    @Bean
    public FanoutExchange exchange(){
        return new FanoutExchange("exchange");
    }

    @Bean
    public Binding emaillBinding(Queue Email, FanoutExchange exchange){
        return BindingBuilder.bind(Email).to(exchange);
    }

    @Bean
    public Binding messageBinding(Queue Message, FanoutExchange exchange){
        return BindingBuilder.bind(Message).to(exchange);
    }
}
