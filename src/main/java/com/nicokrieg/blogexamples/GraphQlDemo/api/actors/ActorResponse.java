package com.nicokrieg.blogexamples.GraphQlDemo.api.actors;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Actor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class ActorResponse {

    private final List<Actor> actors;

}
