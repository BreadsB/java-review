package org.breadsb.strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://edabit.com/challenge/kKQPf5xTAdnBjqvZ8
public class ParenthesesClusters {

    public static String[] split(String str) {
        String[] a = str.split("");
        List<String> result = new ArrayList<>();
        int count = 0;
        int positionStart = 0;
        int positionEnd = 0;
        for (String el : a) {
            if (el.equals("(")) {
                count++;
            } else if (el.equals(")")) {
                count--;
            }
            positionEnd++;
            if(count==0) {
                result.add(str.substring(positionStart,positionEnd));
                positionStart = positionEnd;
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String one = "()()(())";
        String[] resultOne = split(one);
        System.out.println(Arrays.toString(resultOne));
    }
}
