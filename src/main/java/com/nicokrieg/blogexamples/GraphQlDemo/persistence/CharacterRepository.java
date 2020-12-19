package com.nicokrieg.blogexamples.GraphQlDemo.persistence;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
