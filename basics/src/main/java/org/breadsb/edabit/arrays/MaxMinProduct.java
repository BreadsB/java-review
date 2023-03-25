package org.breadsb.edabit.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMinProduct {

    public static int maxProduct(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();

        int left = arr[0]*arr[1];
        int right = arr[arr.length-1]*arr[arr.length-2];
        int result = 0;
        int result1 = left*arr[arr.length-1];
        int result2 = right*arr[arr.length-3];

        if (result1>result2) {
            result = result1;
        } else {
            result = result2;
        }

        return result;
    }

    public static int minProduct(int[] arr) {
        return 0;
    }
}
