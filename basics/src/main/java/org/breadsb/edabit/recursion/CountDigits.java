package org.breadsb.edabit.recursion;

public class CountDigits {

    public static int count(int n) {
        return String.valueOf(n).length();
    }

    public static int count2(int n) {
        while (n!=0) {
            return 1 + count2(n/10);
        }
        return 0;
    }

    public static int count3(int n) {
        if (n<10 && n>-10) {
            return 1;
        }
        return count3(n/10)+1;
    }
}
