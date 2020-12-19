package com.nicokrieg.blogexamples.GraphQlDemo.api.movies;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Movie;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class MovieResponse {

    private final List<Movie> movies;

}
