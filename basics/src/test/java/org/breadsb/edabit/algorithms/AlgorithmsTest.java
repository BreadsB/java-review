package org.breadsb.edabit.algorithms;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.algorithms.Algorithms.FindTheDifference.*;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void testChars() {
        String a = "String";
        int a_sum = a.chars().sum();
        String b = "Straing";
        int b_sum = b.chars().sum();
        int diff = b_sum > a_sum ? b_sum - a_sum : a_sum - b_sum;
        char diffChar = (char) diff;
        int number = 60;
        System.out.println("a_sum: "+a_sum+", b_sum: "+b_sum+", diff: "+diff+", diff as char: "+diffChar);
        System.out.println("number 1: "+(char)number);
    }

    @Test
    void testOne() {
        assertEquals('a', findTheDifference3("String", "Stringa"));
        assertEquals('a', findTheDifference2("String", "Stringa"));
    }

    @Test
    void testTwo() {
        assertEquals('d', findTheDifference3("bcefg", "bcdefg"));
        assertEquals('d', findTheDifference2("bcefg", "bcdefg"));
    }

    @Test
    void testThree() {
        assertEquals('e', findTheDifference3("bcdfg", "bcdefg"));
        assertEquals('e', findTheDifference2("bcdfg", "bcdefg"));
    }

    @Test
    void testFourth() {
        assertEquals('e', findTheDifference3("aiou", "aeiou"));
        assertEquals('e', findTheDifference2("aiou", "aeiou"));
    }

    @Test
    void testFive() {
        assertEquals('p', findTheDifference3("mnoqrst", "mnopqrst"));
        assertEquals('p', findTheDifference2("mnoqrst", "mnopqrst"));
    }

    @Test
    void testSix() {
        assertEquals('t', findTheDifference3("rsuvw", "rstuvw"));
        assertEquals('t', findTheDifference2("rsuvw", "rstuvw"));
        assertEquals('t', findTheDifference3("rsuvw", "rstuvw"));
    }

    @Test
    void testSeven() {
        assertEquals('e', findTheDifference3("abcd", "abcde"));
        assertEquals('e', findTheDifference2("abcd", "abcde"));
    }

    @Test
    void testEight() {
        assertEquals('s', findTheDifference3("rt", "rst"));
        assertEquals('s', findTheDifference2("rt", "rst"));
    }

    @Test
    void test09() {
        assertEquals('a', findTheDifference3("ae", "aea"));
        assertEquals('a', findTheDifference2("ae", "aea"));
    }

    @Test
    public void randomizedTest() {
        for (int i = 0; i < Letters.randInt(11, 20); i++) {
            String a = String.valueOf(Letters.randChar(97, 122)), s = Letters.randStr(6, 8);
            assertEquals(a.charAt(0), findTheDifference2(s, Letters.shuffle(s + a)));
        }
    }

    class Letters {
        public static String shuffle(String s) {
            char[] r = s.toCharArray();
            for (int i = s.length() - 1; i > 0; i--) {
                char t = r[i];
                int k = (int) Math.floor(Math.random() * (i + 1));
                r[i] = r[k];
                r[k] = t;
            }
            return String.valueOf(r);
        }

        public static String randStr(int... m) {
            char[] s = new char[Letters.randInt(m)];
            for (int i = 0; i < s.length; i++) s[i] = Letters.randChar();
            return String.valueOf(s);
        }

        public static char randChar(int... x) {
            x = x.length < 1 ? new int[]{97, 122} : x;
            return Character.toChars((int) Math.floor(Math.random() * (x[1] - x[0] + 1)) + x[0])[0];
        }

        public static int randInt(int... x) {
            x = x.length < 2 ? new int[]{6, 8} : x;
            return (int) Math.floor(Math.random() * (x[1] - x[0] + 1)) + x[0];
        }
    }
}