package com.nicokrieg.blogexamples.GraphQlDemo.api.characters;

import com.nicokrieg.blogexamples.GraphQlDemo.data.Character;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class CharacterResponse {

    private final List<Character> characters;

}
