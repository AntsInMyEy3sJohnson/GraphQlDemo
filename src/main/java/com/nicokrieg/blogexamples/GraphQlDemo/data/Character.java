package com.nicokrieg.blogexamples.GraphQlDemo.data;

import lombok.AllArgsConstructor;
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
public class Character {

    public static Character withProperties(String name) {
        var character = new Character();
        character.setName(name);
        return character;
    }

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Actor actor;

    @ManyToMany(mappedBy = "characters")
    @Fetch(FetchMode.JOIN)
    private Set<Movie> movies;

}
