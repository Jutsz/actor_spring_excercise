package com.example.actor_spring_excercise.service;


import com.example.actor_spring_excercise.dto.ActorDTO;
import com.example.actor_spring_excercise.model.Actor;
import com.example.actor_spring_excercise.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private ActorRepository actorRepository;
    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getActors() {
        return actorRepository.getActors();
    }

    public void addActor(ActorDTO actorDTO) {
        Actor actor = new Actor(0, actorDTO.getName(), actorDTO.getFamousRole(), actorDTO.getSpecialSkill());
        actorRepository.addActor(actor);
    }

    public Actor findActorById(int id) {
        return actorRepository.findActorById(id);
    }
}
