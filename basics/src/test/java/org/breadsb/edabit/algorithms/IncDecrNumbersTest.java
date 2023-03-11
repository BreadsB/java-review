package org.breadsb.edabit.algorithms;

import org.breadsb.edabit.algorithms.IncDecrNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncDecrNumbersTest {

    @Test
    void testOne() {
        //GIVEN
        int a = 0;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testTwo() {
        //GIVEN
        int a = 1;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 10;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testThree() {
        //GIVEN
        int a = 2;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 100;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFour() {
        //GIVEN
        int a = 3;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 475;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFive() {
        //GIVEN
        int a = 4;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 1675;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSix() {
        //GIVEN
        int a = 5;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 4954;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testSeven() {
        //GIVEN
        int a = 6;
        //WHEN
        int result = IncDecrNumbers.incDec(a);
        //THEN
        int expected = 12952;
        Assertions.assertEquals(expected, result);
    }
}
