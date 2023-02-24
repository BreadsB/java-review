package org.breadsb.strings;

import java.util.Arrays;

public class InterviewQuestion1 {



    protected static String countLetters(String input) {
        StringBuilder result = new StringBuilder();
        String[] inputArray = input.split("(?<=(.))(?!\\1)");

        for (String element : inputArray) {
            result.append(element.length()).append(element.charAt(0));
        }

        return result.toString();
    }
}
