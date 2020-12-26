package com.nicokrieg.blogexamples.GraphQlDemo;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Actor;
import com.nicokrieg.blogexamples.GraphQlDemo.data.Character;
import com.nicokrieg.blogexamples.GraphQlDemo.data.Movie;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.ActorRepository;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class GraphQlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(MovieRepository movieRepository, ActorRepository actorRepository) {

        return args -> {

            var keanuReeves = Actor.withProperties("Keanu", "Reeves", 56, Actor.Gender.MALE);
            var carrieAnneMoss = Actor.withProperties("Carrie-Anne", "Moss", 53, Actor.Gender.FEMALE);
            var laurenceFishburne = Actor.withProperties("Laurence", "Fishburne", 59, Actor.Gender.MALE);
            var hugoWeaving = Actor.withProperties("Hugo", "Weaving", 60, Actor.Gender.MALE);
            var lambertWilson = Actor.withProperties("Lambert", "Wilson", 62, Actor.Gender.MALE);
            var rachelWeisz = Actor.withProperties("Rachel", "Weisz", 50, Actor.Gender.FEMALE);

            var neo = Character.withProperties("Neo");
            var trinity = Character.withProperties("Trinity");
            var morpheus = Character.withProperties("Morpheus");
            var agentSmith = Character.withProperties("Agent Smith");
            var theMerowingian = Character.withProperties("The Merowingian");
            var john = Character.withProperties("John Constantine");
            var angela = Character.withProperties("Angela Dodson");

            neo.setActor(keanuReeves);
            trinity.setActor(carrieAnneMoss);
            morpheus.setActor(laurenceFishburne);
            agentSmith.setActor(hugoWeaving);
            theMerowingian.setActor(lambertWilson);
            john.setActor(keanuReeves);
            angela.setActor(rachelWeisz);

            var theMatrix = Movie.withProperties("The Matrix", 1999, Movie.Genre.SCIENCE_FICTION);
            theMatrix.setCharacters(Set.of(neo, trinity, morpheus, agentSmith));

            var theMatrixReloaded = Movie.withProperties("The Matrix Reloaded", 2003, Movie.Genre.SCIENCE_FICTION);
            theMatrixReloaded.setCharacters(Set.of(neo, trinity, morpheus, agentSmith, theMerowingian));

            var constantine = Movie.withProperties("Constantine", 2005, Movie.Genre.FANTASY);
            constantine.setCharacters(Set.of(john, angela));

            movieRepository.saveAll(List.of(theMatrix, theMatrixReloaded, constantine));

        };
    }


}
