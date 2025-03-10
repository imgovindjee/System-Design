package com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern;

import com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern.IntrensicSystem.DocumentCharacter;
import com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern.IntrensicSystem.ILetter;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<Character, ILetter> characterObject_cache = new HashMap<>();

    public static Map<Character, ILetter> getCharacterObject_cache() {
        return characterObject_cache;
    }

    public static ILetter createLetter(char ch) {
        if(characterObject_cache.containsKey(ch)) {
            System.out.println("-------------------------------------------------------------------------------------" +
                    "\nCharacter Already Created Just Cloning it: "+ch);
           return characterObject_cache.get(ch);
        } else {
            DocumentCharacter documentCharacter = new DocumentCharacter(ch, "ARIAL", 19);
            characterObject_cache.put(ch, documentCharacter);
            System.out.println("-------------------------------------------------------------------------------------" +
                    "\nNewly Created Character: "+ch);
            return documentCharacter;
        }
    }
}
