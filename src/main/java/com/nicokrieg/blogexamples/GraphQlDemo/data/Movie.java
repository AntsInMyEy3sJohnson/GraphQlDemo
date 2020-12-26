package com.nicokrieg.blogexamples.GraphQlDemo.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Movie {

    public static Movie withProperties(String name, int year, Genre genre) {
        var movie = new Movie();
        movie.setTitle(name);
        movie.setYear(year);
        movie.setGenre(genre);
        return movie;
    }

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private int year;

    private Genre genre;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @Fetch(FetchMode.JOIN)
    @JoinTable(name = "movie_characters",
            joinColumns = {@JoinColumn(name = "fk_movie")},
            inverseJoinColumns = {@JoinColumn(name = "fk_character")})
    private Set<Character> characters;

    public enum Genre {
        FANTASY,
        SCIENCE_FICTION,
        ACTION,
        DRAMA,
        HORROR,
        ADVENTURE,
        COMEDY,
        ROMANCE,
        DOCUMENTARY
    }

}
