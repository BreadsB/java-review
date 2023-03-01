package org.breadsb.algorithms;

//https://edabit.com/challenge/a242aPZGmmx8xhiuy

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

    public static boolean isPalindromePossible2(String s) {
        boolean result = false;
        if (s.length()%2!=0) {
            char[] a = s.toCharArray();
            boolean[] b = new boolean[a.length];

            int i = 0;

            for (char element : a) {
                b[i] = (s.chars().filter(n -> n == element).count())%2==0;
                i++;
            }

            int y = 0;
            int z = 0;
            for (boolean element : b) {
                if (element) {
                    y++;
                } else {
                    z++;
                }
            }
            if (z==1 || y%2==0) {
                result = true;
            }
        }
        return result;
    }
}
