package org.breadsb.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {

    static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    static final String[] CONSONANTS = {"b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "s", "t", "v", "x", "z", "h", "r", "w", "y", "bl", "br", "ch", "ck", "cl"};
    static final String BABY_AY = "ay";

    public String rule1(String word) {
        StringBuilder result = new StringBuilder(word);
        for (char vowel : VOWELS) {
            if (word.startsWith(String.valueOf(vowel))) {
                result.subSequence(0,1);

            }
        }
        return result.toString().toLowerCase();
    }

    public String rule2(String word) {

        String newWord = "";
        word = word.toLowerCase();

        for (String consonant : CONSONANTS) {
            if (word.startsWith(consonant)) {
                if (consonant.length()==1) {
                    newWord = word.substring(1) + word.subSequence(0,1) + BABY_AY;
                } else if (consonant.length()==2) {
                    newWord = word.substring(2) + word.subSequence(0,2) + BABY_AY;
                } else if (consonant.length()==3) {
                    newWord = word.substring(3) + word.subSequence(0,3) + BABY_AY;
                }
            }
        }
        return newWord;
    }

    public String rule3(String word) {
        List<String> temporaryString = Arrays.stream(CONSONANTS).map(g -> g + "qu").collect(Collectors.toList());
        String newWord = "";
        word = word.toLowerCase();

        for (String consonant : temporaryString) {

            int temporarylength = consonant.length();

            if (word.startsWith(consonant)) {
                newWord = word.substring(temporarylength) + word.subSequence(0, temporarylength) + "ay";
            }
        }
        return newWord;
    }
}