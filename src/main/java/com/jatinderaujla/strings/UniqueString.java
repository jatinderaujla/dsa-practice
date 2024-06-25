package com.jatinderaujla.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueString {
    public boolean isUniqueBruteForce(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public boolean isUniqueUsingSet(String str){
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(characters.contains(ch)) return false;
            characters.add(ch);
        }
        return true;
    }

    public boolean isUniqueUsingSort(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length-1; i++) {
            if(charArr[i] == charArr[i+1]) return false;
        }
        return true;
    }

    public boolean isUniqueUsingBitManipulation(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if((checker & 1 << val) > 0){
                return false;
            }
            checker = checker | 1 << val;
        }
        return true;
    }
}
