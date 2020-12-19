package com.nicokrieg.blogexamples.GraphQlDemo.api.movies;

import com.nicokrieg.blogexamples.GraphQlDemo.domain.MovieService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieQuery implements GraphQLQueryResolver {

    private final MovieService movieService;

    public MovieResponse getAllMovies() {

        return new MovieResponse(movieService.getAllMovies());

    }

}
