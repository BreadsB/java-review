package org.breadsb.edabit.strings;

import java.util.Arrays;
import java.util.List;

public class StringFundamentals {

    public static void stringImmutability() {
        String hello = "Hello";
        hello.concat("Addon");
        System.out.println(hello);
        hello = hello.concat("Addon");
        System.out.println(hello);
        // String is immutable
    }

    public static void main(String[] args) {
//        stringImmutability();
        examples();
    }

    public static void examples() {
        String s = "asdqwrqwtwetwetqwet";
        List<Character> c = s.chars().mapToObj(o->(char)o).toList();
//        List<String> str = s.chars().mapToObj(String.class::cast).toList();
        System.out.println("1: " + c);
//        System.out.println("1str: " + str);
        s.chars().mapToObj(o->(char)o).forEach(System.out::print);
//        System.out.println(String.join("", c));
        char[] chars = s.toCharArray();
        String charsJoined2 = new String(chars);
        String charsJoined3 = c.toString();
        System.out.println("\ncharsJoined2: " + charsJoined2);
        System.out.println("\ncharsJoined3: " + charsJoined3);
        System.out.println(String.valueOf(chars));
        System.out.println(c);
        System.out.println(Arrays.toString(chars));
    }
}
