package org.breadsb.algorithms;

import org.breadsb.algorithms.Algorithms.FindTheDifference;
import org.junit.jupiter.api.Test;

import static org.breadsb.algorithms.Algorithms.FindTheDifference.*;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void testOne() {
        assertEquals('a', findTheDifference("String", "Stringa"));
    }

    @Test
    void testTwo() {
        assertEquals('d', findTheDifference("bcefg", "bcdefg"));
    }

    @Test
    void testThree() {
        assertEquals('e', findTheDifference("bcdfg", "bcdefg"));
    }

    @Test
    void testFourth() {
        assertEquals('e', findTheDifference("aiou", "aeiou"));
    }

    @Test
    void testFive() {
        assertEquals('p', findTheDifference("mnoqrst", "mnopqrst"));
    }

    @Test
    void testSix() {
        assertEquals('t', findTheDifference("rsuvw", "rstuvw"));
    }

    @Test
    void testSeven() {
        assertEquals('e', findTheDifference("abcd", "abcde"));
    }

    @Test
    void testEight() {
        assertEquals('s', findTheDifference("rt", "rst"));
    }

    @Test
    void test09() {
        assertEquals('a', findTheDifference("ae", "aea"));
    }
}