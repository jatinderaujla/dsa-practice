package com.jatinderaujla.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    /**
     * Find the count of each character inside the given string
     * @param str given string
     * @return map count of each character
     */
    public Map<Character, Integer> characterCount(String str){
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        return charCounts;
    }

    /**
     * Find the count of each character from the given string using streams
     * @param str given string
     * @return map of each character count
     */
    public Map<Character, Long> characterCountUsingStream(String str){
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
