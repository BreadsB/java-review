package org.breadsb.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceMaxMinTest {

    @Test
    void test1() {
        assertEquals(90, DifferenceMaxMin.differenceMaxMin(new int[] {10, 4, 1, 2, 8, 91}));
        assertEquals(90, DifferenceMaxMin.sol2(new int[] {10, 4, 1, 2, 8, 91}));
        assertEquals(90, DifferenceMaxMin.sol3(new int[] {10, 4, 1, 2, 8, 91}));
    }

    @Test
    void test2() {
        assertEquals(124, DifferenceMaxMin.differenceMaxMin(new int[] {-70, 43, 34, 54, 22}));
        assertEquals(124, DifferenceMaxMin.sol2(new int[] {-70, 43, 34, 54, 22}));
        assertEquals(124, DifferenceMaxMin.sol3(new int[] {-70, 43, 34, 54, 22}));
    }
}