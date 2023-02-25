package org.breadsb.strings;

// https://edabit.com/challenge/njGTBhXa7zP3pvsnp


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordInString {
    public static String reverseWord(String s) {
        List<String> list = new ArrayList<>(List.of(s.split("\\s+")));
        Collections.reverse(list);
        list.removeIf(String::isBlank);
        return String.join(" ", list);
    }

}
