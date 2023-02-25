package org.breadsb.strings;

// https://edabit.com/challenge/6CkRcCdGAmCGPZnyb

import java.util.ArrayList;
import java.util.List;

public class RemoveTheWord {

    public static String[] removeLetters(String[] chars, String word) {
        String[] wordConverted = word.split("");
        List<String> array = new ArrayList<>(List.of(chars));

        for (String element : wordConverted) {
            for (String i : array) {
                if (i.equals(element)) {
                    array.remove(i);
                    break;
                }
            }
        }

        return array.toArray(new String[0]);
    }
}
