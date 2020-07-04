package com.pyp.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Anagramas {
/**
 * Dado un array de strings se debe remover todos los anagramas permaneciendo la base comparada para luego devolver
 * los restantes en orden
 */

    public static void main(String[] args) {
        List<String> texts = Arrays.asList("code","aaagmnrs","anagrams","doce");
        extractAnagrams(texts).forEach(System.out::println);
    }

    private static List<String> extractAnagrams(List<String> texts) {
        HashMap<String, String> result = new HashMap<>();
        texts.forEach(text -> {
            char[] textChar = text.toCharArray();
            Arrays.sort(textChar);
            String key = new String(textChar);
            if (!result.containsKey(key)) result.put(key, text);
        });
        return result.values().stream().sorted().collect(Collectors.toList());
    }
}
