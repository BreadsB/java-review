package org.breadsb.edabit.arrays;

// https://edabit.com/challenge/uqZD99bDGx3LnSv6w
public class RecursionArrayRanges {

    public static int[] inclusiveArray(int startNum, int endNum) {

        if (startNum>endNum) {
            return new int[] {startNum};
        }
        if (startNum==endNum) {
            return new int[] {endNum};
        }

        int[] recursionSingleArray = inclusiveArray(startNum, endNum-1);
        int[] result = new int[recursionSingleArray.length+1];
        System.arraycopy(recursionSingleArray, 0, result, 0, recursionSingleArray.length);
        int[] two = new int[] {endNum};
        System.arraycopy(two, 0, result, result.length-1, two.length);
        return result;
    }

    /*
    *   First case:
    *   recursionSingleArray = new int[] {1}
    *   int[] result = new int[2]; Needs space for next value
    *   result = int[] {1};
    *   int[] two = new int[] {2};
    *   result = int[] {1,
    * */
}