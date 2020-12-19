package com.nicokrieg.blogexamples.GraphQlDemo.domain;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Movie;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.CharacterRepository;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final CharacterRepository characterRepository;

    public List<Movie> getAllMovies() {

        return movieRepository.findAll();

    }

}
