package org.breadsb.strings;

// https://edabit.com/challenge/mtrBW4w2Bkum4bGt5

import java.util.LinkedHashSet;
import java.util.List;

public class RemoveRepeatedCharacters {
    // 1. regex "", String[], remove if n=n-1
    // 2. LinkedHashSet - order and unique elements
    // 3. for loop

    private final static String EXAMPLE1 = "aaaaa";
    private final static String EXAMPLE2 = "WWE!!!";
    private final static String EXAMPLE3 = "teshahset";

    static long time1=0L;
    static long time2=0L;
    static long differ=0L;

    public static String unrepeatedFirstMethod(String s) {
        return s.replaceAll("(.)(?=\1*)", "");
    }

    public static String unrepeatedSecondMethod(String s) {
        String[] list = s.split("");
        LinkedHashSet<String> charSet = new LinkedHashSet<>(List.of(list));
        return String.join("", charSet);
    }

    public static String unrepeatedThirdMethod(String s) {
        StringBuilder sb = new StringBuilder();
        int index;
        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            index = s.indexOf(c, i+1);
            if (index == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String unrepeatedFourthMethod(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().distinct().forEach(sb::append);
        return sb.toString();
    }

    public static String unrepeatedFifthMethod(String s) {
        //THE FASTEST WAY

        String result = "";
        boolean repeated;
        for(int i=0; i<s.length();i++) {
            repeated = false;
            for(int j=0; j<i; j++) {
                if (s.charAt(j)==s.charAt(i)) {
                    repeated = true;
                    break;
                }
            }
            if(repeated) {
                continue;
            } else {
                result = result.concat(String.valueOf(s.charAt(i)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        time1 = System.nanoTime();
        System.out.print(unrepeatedFirstMethod(EXAMPLE3));
        time2 = System.nanoTime();
        differ = time2 - time1;
        System.out.println("1. - Time for Split: " + differ + "ns");

        time1 = System.nanoTime();
        System.out.print(unrepeatedSecondMethod(EXAMPLE3));
        time2 = System.nanoTime();
        differ = time2 - time1;
        System.out.println("2. - Time for Split: " + differ + "ns");

        time1 = System.nanoTime();
        System.out.print("3. " + unrepeatedThirdMethod(EXAMPLE3));
        time2 = System.nanoTime();
        differ = time2 - time1;
        System.out.println(" - Time for Split: " + differ + "ns");

        time1 = System.nanoTime();
        System.out.print("4. " + unrepeatedFourthMethod(EXAMPLE3));
        time2 = System.nanoTime();
        differ = time2 - time1;
        System.out.println(" - Time for Split: " + differ + "ns");

        time1 = System.nanoTime();
        System.out.print("5. " + unrepeatedFifthMethod(EXAMPLE3));
        time2 = System.nanoTime();
        differ = time2 - time1;
        System.out.println(" - Time for Split: " + differ + "ns");
    }
}
