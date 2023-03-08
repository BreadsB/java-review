package org.breadsb.arrays;

import java.util.*;

public class DifferenceMaxMin {

    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];

        return max-min;
    }

    public static int sol2(int[] arr) {
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();
        if (max.isPresent()) {
            return max.getAsInt()-min.getAsInt();
        }
        return 0;
    }

    public static int sol3(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int max = Collections.max(list);
        int min = Collections.min(list);
        return max-min;
    }
}