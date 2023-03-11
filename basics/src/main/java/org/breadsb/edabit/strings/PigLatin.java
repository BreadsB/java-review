package org.breadsb.edabit.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {

    static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    static final String[] CONSONANTS = {"b", "c", "d", "f", "g", "j", "k", "l", "m", "n",
                                        "p", "q", "s", "t", "v", "x", "z", "h", "r", "w", "y"};
    static final String[] CONSONANTS_CLUSTERS = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
                                                "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                                                "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    static final String BABY_AY = "ay";

    public boolean checkVowels(String word) {
        boolean result = false;
        word = word.toLowerCase();

        for (char vowel : VOWELS) {
            if (word.startsWith(String.valueOf(vowel))) {
                result = true;
                break;
            }
        }

        return result;
    }

    public boolean checkConsonantsCluster(String word) {
        boolean result = false;
        word = word.toLowerCase();

        for (String cluster : CONSONANTS_CLUSTERS) {
            if (word.startsWith(cluster)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public String loopInArray(String[] data, String word) {
        String result = "";

        for (String consonant : data) {
            if (word.startsWith(consonant + "qu")) {
                result = word.substring(consonant.length() + 2) +
                        word.substring(0, consonant.length() + 2) +
                        BABY_AY;
                break;
            } else {
                String s = word.substring(consonant.length()) + word.substring(0, consonant.length()) + BABY_AY;
                if (word.startsWith(consonant + "y")) {
                    result = s;
                    break;
                } else if (word.startsWith(consonant)) {
                    result = s;
                    break;
                }
            }
        }

        return result;
    }

    public String allRules(String word) {

        String result = "";

        if (checkVowels(word)) {
            result = word.concat(BABY_AY);
        } else if (checkConsonantsCluster(word)) {
            result = loopInArray(CONSONANTS_CLUSTERS, word);
        } else {
            result = loopInArray(CONSONANTS, word);
        }

        return result;
    }
}