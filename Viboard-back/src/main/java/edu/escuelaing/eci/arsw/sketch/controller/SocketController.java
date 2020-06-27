package edu.escuelaing.eci.arsw.sketch.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import edu.escuelaing.eci.arsw.sketch.bean.Chat;

@Controller
public class SocketController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public Chat sendToAll(@Payload Chat message) {
        return message;
    }

}