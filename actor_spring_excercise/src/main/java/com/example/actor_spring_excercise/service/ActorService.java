package com.example.actor_spring_excercise.service;


import com.example.actor_spring_excercise.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
    private ActorRepository actorRepository;
    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
}
