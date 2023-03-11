package org.breadsb.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.breadsb.recursion.ArraySum.*;

public class ArraySumTest {

    @Test
    void test1() {
        int[] given = new int[] {1, 2, 3, 4};
        Assertions.assertEquals(10, solution2(given));
        Assertions.assertEquals(10, solution1(given));
    }

    @Test
    void test2() {
        int[] given = new int[] {-1, -1, -1};
        Assertions.assertEquals(-3, solution2(given));
        Assertions.assertEquals(-3, solution1(given));
    }

    @Test
    void test3() {
        int[] given = new int[0];
        Assertions.assertEquals(0, solution1(given));
        Assertions.assertEquals(0, solution2(given));
    }
}
