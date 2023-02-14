package org.breadsb.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NLengthLetterGroup {
    public static String[] collect(String s, int n) {
        int lengthOfString = s.length();
        int steps = lengthOfString / n;
        System.out.println(lengthOfString + ":" + steps);
        List<String> listOfElements = new ArrayList<>();
        int from=0;
        int to=n;

        for (int i=1; i<=steps; i++) {
            listOfElements.add(s.substring(from, to));
            from=to;
            to+=n;
        }

        listOfElements = listOfElements.stream().sorted().collect(Collectors.toList());

        return listOfElements.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(collect("intercontinentalisationalism", 6)));
        System.out.println(Arrays.toString(collect("strengths", 3)));
        System.out.println(Arrays.toString(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)));
        System.out.println(9%3);
    }
}
