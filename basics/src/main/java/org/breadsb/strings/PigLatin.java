package org.breadsb.strings;

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

    public String rule1(String word) {
        StringBuilder result = new StringBuilder(word);
        for (char vowel : VOWELS) {
            if (word.startsWith(String.valueOf(vowel))) {
                result.append(BABY_AY);
            }
        }
        return result.toString().toLowerCase();
    }

    public String rule2(String word) {

        String newWord = "";
        word = word.toLowerCase();

        for (String consonant : CONSONANTS) {
            if (word.startsWith(consonant)) {
                if (consonant.length() == 1) {
                    newWord = word.substring(1) + word.subSequence(0, 1) + BABY_AY;
                } else if (consonant.length() == 2) {
                    newWord = word.substring(2) + word.subSequence(0, 2) + BABY_AY;
                } else if (consonant.length() == 3) {
                    newWord = word.substring(3) + word.subSequence(0, 3) + BABY_AY;
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
                newWord = word.substring(temporarylength) + word.subSequence(0, temporarylength) + BABY_AY;
            }
        }

        return newWord;
    }

    public String rule4(String word) {

        word = word.toLowerCase();
        String result = "";

        for (String consonant : CONSONANTS) {
            if (word.length() == 2 && (word.charAt(1) == 'y') || word.startsWith(consonant + "y")) {
                result = word.substring(consonant.length()) + word.substring(0, consonant.length()) + BABY_AY;
                break;
            }
        }

        return result;
    }

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