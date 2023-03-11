package org.breadsb.edabit.algorithms;

//https://edabit.com/challenge/a242aPZGmmx8xhiuy

import java.util.Arrays;

public class PalindromicAnagram {

    public static boolean isPalindromePossible(String str) {
        boolean result = false;

        if (str.length()==1) {
            result = true;
        } else {
            char[] a = str.toCharArray();
            int x = 0, y = 0;

            for (char element : a) {
                int i = 0;
                if ((str.chars().filter(n -> n == element).count()) % 2 == 0) {
                    x++;
                } else {
                    y++;
                }
            }
            if (y<=1 && x > 0) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isPalindromePossible2(String str) {
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        str = new String(strChars).replaceAll("([a-z])\\1","");
        return str.length() <=1;
    }

    public static boolean isPalindromePossible3(String str) {
        int k=0;
        for (String i : str.split("")) {
            k += (str.replace(i, "").length() == str.length()-1) ? 1 : 0;
        }
        return k<=1;
    }
}
