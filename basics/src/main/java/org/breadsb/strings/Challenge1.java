package org.breadsb.strings;

//https://edabit.com/challenge/PZnwXraqBPYv7w4Sm

public class Challenge1 {

    public static boolean checkEnding(String str1, String str2) {
//        str1 is null
//        str2 is null
//        str2 is greater than str1
        if (str1.isEmpty() || str2.isEmpty() || str2.length()>str1.length()) {
            return false;
        }
//        recursion with booleans?
        return str1.endsWith(str2);
    }
}
