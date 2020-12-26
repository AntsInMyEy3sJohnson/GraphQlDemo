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
public class Actor {

    public static Actor withProperties(String firstName, String lastName, int age, Gender gender) {
        var actor = new Actor();
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        actor.setAge(age);
        actor.setGender(gender);
        return actor;
    }

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private int age;

    private Gender gender;

    @OneToMany(mappedBy = "actor", cascade = CascadeType.PERSIST)
    @Fetch(FetchMode.JOIN)
    private Set<Character> characters;

    public enum Gender {
        MALE,
        FEMALE
    }

}
