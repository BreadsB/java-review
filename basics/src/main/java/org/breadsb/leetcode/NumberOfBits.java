package org.breadsb.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumberOfBits {
    public static int hammingWeight(int n) {
        int weight = 0;
        while (n!=0) {
            weight += (n &1);
            n >>>= 1;
        }
        return weight;
    }
}