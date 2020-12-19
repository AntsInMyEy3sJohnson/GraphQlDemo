package com.nicokrieg.blogexamples.GraphQlDemo.api.characters;

import com.nicokrieg.blogexamples.GraphQlDemo.domain.CharacterService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CharacterQuery implements GraphQLQueryResolver {

    private final CharacterService characterService;

    public CharacterResponse getAllCharacters() {

        return new CharacterResponse(characterService.getCharacters());

    }
}
