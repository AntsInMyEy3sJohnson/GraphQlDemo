package com.nicokrieg.blogexamples.GraphQlDemo.persistence;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
