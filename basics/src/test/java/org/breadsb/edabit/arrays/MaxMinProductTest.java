package org.breadsb.edabit.arrays;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.arrays.MaxMinProduct.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMinProductTest {

    @Test
    void testMaxProduct() {
        assertEquals(504, maxProduct(new int[] {-8, -9, 1, 2, 7}));
        assertEquals(126, maxProduct(new int[] {-8, 7, 9, 1, 2}));
        assertEquals(50, maxProduct(new int[] {1, 1, 5, 1, 1,-10,-1}));
        assertEquals(-210, maxProduct(new int[] {-8,-7,-6,-5}));
        assertEquals(56, maxProduct(new int[] {-8,-7,-6,-5, 1}));
        assertEquals(0, maxProduct(new int[] {1, 0, 1, 0, 0}));
        assertEquals(0, maxProduct(new int[] {-5, 1, 10, 0, 0}));
        assertEquals(0, maxProduct(new int[] {-5,-1,-1, 0, 0}));
        assertEquals(5, maxProduct(new int[] {-5, 1,-1, 0, 0}));
        assertEquals(60, maxProduct(new int[] {-5,-3,-1, 0, 4}));
        assertEquals(441, maxProduct(new int[] {5, 3,-1, 0,-4, 7, 7, 9}));
        assertEquals(-1, maxProduct(new int[] {1,-1, 1}));
    }

    @Test
    void testMinProduct() {
        assertEquals(-1, minProduct(new int[] {1,-1, 1}));
        assertEquals(-1, minProduct(new int[] {1,-1, 1, 1}));
        assertEquals(-126, minProduct(new int[] {-8,-9, 1, 2, 7}));
        assertEquals(-504, minProduct(new int[] {-8, 1, 2, 7, 9}));
    }
}
