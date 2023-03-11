package org.breadsb.edabit.recursion;

import java.util.Arrays;

public class ArraySum {

    public static int solution1(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int solution2(int[] arr) {
        while (arr.length>0) {
            return arr[arr.length-1] + solution2(Arrays.copyOf(arr, arr.length-1));
        }
        return 0;
    }
}
