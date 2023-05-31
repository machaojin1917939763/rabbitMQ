package com.machaojin.web.rabbitMq;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping("/publish")
public class Publish {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message){
        for (int i = 0; i < 20; i++) {
            rabbitTemplate.convertAndSend("exchange","",message + "说：今天真的好热！",new CorrelationData(UUID.randomUUID().toString()));
        }
        return "发送成功";
    }
}
