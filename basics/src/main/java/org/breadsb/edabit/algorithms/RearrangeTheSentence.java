package org.breadsb.edabit.algorithms;

//        https://edabit.com/challenge/FPemghc8ut9xfaMGo

import java.util.Arrays;
import java.util.StringJoiner;

public class RearrangeTheSentence {
    public static String rearrange(String s) {

        //Split on whitespace
        //find digit in word, remove it and use it as ID
        //sort by ID
        //convert word to Strings in good order
        String[] splited = s.split("\\s");
        StringJoiner sb = new StringJoiner(" ");

        for (int i=0; i<=splited.length; i++) {
            for (String element : splited) {
                if (element.contains(String.valueOf(i))) {
                    sb.add(element.replace(String.valueOf(i), ""));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
