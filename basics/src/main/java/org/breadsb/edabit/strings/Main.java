package org.breadsb.edabit.strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BeerSong beerSong = new BeerSong();
        beerSong.singSong(99);
    }

    private static String greeting(String name) {
        return String.format("Hello %s", name);
    }

    private static void greeting2() {
        StringBuilder sb = new StringBuilder();
        sb.append("root");
        System.out.println(sb);
        sb.append("James");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append("MonthlyRate");
        System.out.println(sb.length());
    }

    private static void greeting3() {
        String name = "Sam";
        name = name.replace('S','R'); // Big letters matters!
        System.out.println(name);
    }

    private static void joinStrings(String one, String two) {
        one = one.concat(two);
        System.out.println(one);
    }

    private static String scanUserInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first String");
        String first = myScanner.nextLine();
        System.out.println("Enter second String");
        String second = myScanner.nextLine();

        return first.concat(second);
    }


}
