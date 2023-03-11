package org.breadsb.edabit.strings;

import java.util.*;

// https://exercism.org/tracks/java/exercises/word-count

public class WordCount {

    static final String[] SYMBOLS = {":",",","\\.","\"","!","\n","'\\B","\\B'"};

    public Map<String, Integer> countWords(String sentence) {

        ArrayList<String> temp = replaceLetters(sentence);
        HashMap<String, Integer> hm = new HashMap<>();

        temp.forEach(el -> hm.put(el, Collections.frequency(temp, el)));
        return hm;
    }

    public ArrayList<String> replaceLetters(String sentence) {
        String result = sentence;
        for (String symbol : SYMBOLS) {
            result = result.replaceAll(symbol, " ");
        }
        ArrayList<String> resultList = new ArrayList<>(List.of(result
                .toLowerCase()
                .trim()
                .split("\\s+")));

        return resultList;
    }
}