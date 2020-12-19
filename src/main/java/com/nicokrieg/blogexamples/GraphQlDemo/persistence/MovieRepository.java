package com.nicokrieg.blogexamples.GraphQlDemo.persistence;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
