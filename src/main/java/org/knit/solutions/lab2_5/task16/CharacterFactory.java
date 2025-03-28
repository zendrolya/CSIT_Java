package org.knit.solutions.lab2_5.task16;

import java.lang.Character;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<Character, SpecificCharacter> characters = new HashMap<>();

    public static SpecificCharacter getCharacter(char symb) {
        if (characters.containsKey(symb)) {
            return characters.get(symb);
        }
        SpecificCharacter newChar = new SpecificCharacter(symb);
        characters.put(symb, newChar);
        return newChar;
    }

    public static int getCacheSize() {
        return characters.size();
    }
}
