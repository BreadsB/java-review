package org.breadsb.strings;

import java.util.Arrays;

public class InterviewQuestion1 {



    protected static String convertMethodOne(String input) {
        StringBuilder result = new StringBuilder();
        String[] inputArray = input.split("(?<=(.))(?!\\1)");
        for (String element : inputArray) {
            result.append(element.length()).append(element.charAt(0));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaawwwa";
        System.out.println(convertMethodOne(input));
    }
}
