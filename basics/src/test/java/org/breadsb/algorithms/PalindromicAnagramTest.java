package org.breadsb.algorithms;

import org.junit.jupiter.api.Test;

import static org.breadsb.algorithms.PalindromicAnagram.*;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicAnagramTest {

    @Test
    void testOne() {
        //GIVEN
        String s = "palindrome";

        //WHEN
        boolean result = isPalindromePossible(s);
        System.out.println(result);

        //THEN
        assertFalse(result);
    }

    @Test
    void testTwo() {
        assertTrue(isPalindromePossible("suhbeusheff"));
    }

    @Test
    void testThree() {
        assertTrue(isPalindromePossible("noon"));
    }

    @Test
    void testFour() {
        assertTrue(isPalindromePossible("zgzqxljjp"));
    }

    @Test
    void testFive() {
        assertTrue(isPalindromePossible("tgmqkpdhnhatoco"));
    }
}