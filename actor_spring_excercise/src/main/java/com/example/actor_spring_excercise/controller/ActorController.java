package com.example.actor_spring_excercise.controller;

import com.example.actor_spring_excercise.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("actors")
public class ActorController {
    private ActorService actorService;

    @Autowired

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
}
