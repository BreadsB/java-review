package org.breadsb.edabit.recursion;

public class Example2 {
    public static char[] VOWELS = new char[] {'a', 'e', 'i', 'o', 'u'};
    public static int countVowels(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            for(char element : VOWELS) {
                if (str.charAt(0)==element) {
                    return 1 + countVowels(str.substring(1));
                }
            }
            return countVowels(str.substring(1));
        }
    }

    public static int countVowels2(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }
}
