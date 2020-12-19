package com.nicokrieg.blogexamples.GraphQlDemo.api.actors;

import com.nicokrieg.blogexamples.GraphQlDemo.domain.ActorService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ActorQuery implements GraphQLQueryResolver {

    private final ActorService actorService;

    public ActorResponse getAllActors() {

        return new ActorResponse(actorService.getAllActors());

    }
}
