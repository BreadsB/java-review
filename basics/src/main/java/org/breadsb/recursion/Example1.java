package org.breadsb.recursion;

public class Example1 {
    public static int length(String str) {
        if(str.isEmpty()) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }
}
