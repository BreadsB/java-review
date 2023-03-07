package org.breadsb.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void test1() {
        //GIVEN
        String testInput = "cheesecake";
        //WHEN
        int actualResult = Example2.countVowels(testInput);

        //THEN
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        //GIVEN
        String testInput = "bbb";
        //WHEN
        int actualResult = Example2.countVowels(testInput);

        //THEN
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3() {
        //GIVEN
        String testInput = "apple";
        //WHEN
        int actualResult = Example2.countVowels(testInput);

        //THEN
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test4() {
        //GIVEN
        String testInput = "baabab";
        //WHEN
        int actualResult = Example2.countVowels(testInput);

        //THEN
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test5() {
        //GIVEN
        String testInput = "baabab";
        //WHEN
        int actualResult = Example2.countVowels2(testInput);

        //THEN
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }
}