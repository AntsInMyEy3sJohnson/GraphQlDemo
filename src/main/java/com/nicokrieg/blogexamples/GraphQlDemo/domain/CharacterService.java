package com.nicokrieg.blogexamples.GraphQlDemo.domain;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Character;
import com.nicokrieg.blogexamples.GraphQlDemo.persistence.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }
}
