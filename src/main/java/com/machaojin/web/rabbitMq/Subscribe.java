package com.machaojin.web.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
public class Subscribe {

    @RabbitListener(queues = "e-mail")
    public void e_mail(String message){
        System.out.println("e-mail-接收到消息：" + message);
    }

    @RabbitListener(queues = "message")
    public void message(String message){
        System.out.println("message-接收到消息：" + message);
    }


}
