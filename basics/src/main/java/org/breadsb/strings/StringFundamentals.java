package org.breadsb.strings;

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
        stringImmutability();
    }
}
