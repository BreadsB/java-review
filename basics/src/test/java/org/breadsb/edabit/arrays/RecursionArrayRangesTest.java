package org.breadsb.edabit.arrays;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.arrays.RecursionArrayRanges.inclusiveArray;
import static org.junit.jupiter.api.Assertions.*;

class RecursionArrayRangesTest {

    @Test
    void test1() {
        assertArrayEquals(new int[] {1,2,3,4,5}, inclusiveArray(1, 5));
        assertArrayEquals(new int[] {2,3,4,5,6,7,8}, inclusiveArray(2, 8));
        assertArrayEquals(new int[] {10,11,12,13,14,15,16,17,18,19,20}, inclusiveArray(10, 20));
//        assertArrayEquals(new int[] {17}, inclusiveArray(17, 5));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[] {1,2,3}, RecursionArrayRanges.inclusiveArray(1,3));
        assertArrayEquals(new int[] {1,2,3,4,5}, RecursionArrayRanges.inclusiveArray(1,5));
        assertArrayEquals(new int[] {12,13,14,15,16,17,18}, RecursionArrayRanges.inclusiveArray(12,18));
        assertArrayEquals(new int[] {14}, RecursionArrayRanges.inclusiveArray(14,7));
        assertArrayEquals(new int[] {10}, RecursionArrayRanges.inclusiveArray(10,1));
        assertArrayEquals(new int[] {0}, RecursionArrayRanges.inclusiveArray(0,0));
        assertArrayEquals(new int[] {0,1}, RecursionArrayRanges.inclusiveArray(0,1));
    }
}