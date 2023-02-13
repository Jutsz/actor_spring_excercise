package com.example.actor_spring_excercise.repository;

import com.example.actor_spring_excercise.model.Actor;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
@Getter
public class ActorRepository {
    private List<Actor> actors = new ArrayList<>() {{
        add (new Actor(1, "Bud Spencer", "Piedone", "big punches", "Egyik film"));
        add (new Actor(2, "Terence Hill", "Jack", "big punches", "Masik film"));}};

    public void addActor(Actor actor){
        actor.setId(actors.get(actors.size()-1).getId()+1);
        actors.add(actor);
    }

    public Actor findActorById(int id){
        return actors.stream()
                .filter(actor -> actor.getId()==id)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }


}
