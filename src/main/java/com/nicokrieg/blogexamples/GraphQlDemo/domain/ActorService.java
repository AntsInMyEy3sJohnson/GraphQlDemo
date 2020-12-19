package com.nicokrieg.blogexamples.GraphQlDemo.domain;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Actor;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    public List<Actor> getAllActors() {

        return actorRepository.findAll();

    }
}
