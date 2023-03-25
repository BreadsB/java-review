package org.breadsb.edabit.expert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://edabit.com/challenge/3FAMXz4wAYGqpCtDR
public class WordBuckets {

    // phrase can use iterator if has next Letter
    //

    public static String[] bucketize(String phrase, int n) { // "she sells sea shells by the sea", 10

        phrase = phrase.trim();
        String[] one = phrase.split("(w)|(?=\\s)");
        List<String> stringList = new ArrayList<>();
        int b = n;
        List<String> temp = new ArrayList<>();
        for (String element : one) {

            if (element.length() > b) {
                stringList.add(String.join(" ", temp));
                b = n;
                temp.clear();
                element = element.trim();
            }
            b -= element.length();
            temp.add(element.trim());
        }
        if (!temp.isEmpty()) {
            stringList.add(String.join(" ", temp));
        }
//        stringList = stringList.stream().map(element -> element.trim()).collect(Collectors.toList());

        return stringList.toArray(new String[]{});
    }

    public static String[] bucketize2(String phrase, int n) {
        phrase = phrase.trim();
        String[] s = phrase.split(" ");
        List<String> stringList = new ArrayList<>();
        int a = phrase.length()/n;
        for (int i=0; i<a; i++) {
            stringList.add(phrase.substring(i*n, (i*n)+n));
        }
        return new String[0];
    }
}
