package org.breadsb.strings;

import java.util.List;

public class MemorySize {
    public static String actualMemorySize(String s) {
        String[] a = s.split("(?=[a-zA-Z])(?<=\\d)");
        double ms = Double.parseDouble(a[0]);
        String result = String.format("%.2f", (ms*0.93))
                .concat(a[1]);
        return "Memory: " + result;
    }

    public static void main(String[] args) {
        System.out.println(actualMemorySize("32GB"));
    }
}
