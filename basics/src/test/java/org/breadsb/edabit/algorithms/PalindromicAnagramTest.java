package org.breadsb.edabit.algorithms;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.algorithms.PalindromicAnagram.*;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicAnagramTest {

    @Test
    void testOne() {
        //GIVEN
        String s = "palindrome";

        //WHEN
        boolean result = isPalindromePossible(s);
        boolean result2 = isPalindromePossible3(s);

        //THEN
        assertFalse(result);
        assertFalse(result2);
    }

    @Test
    void testTwo() {
        assertTrue(isPalindromePossible("suhbeusheff"));
        assertTrue(isPalindromePossible3("suhbeusheff"));
    }

    @Test
    void testThree() {
        assertTrue(isPalindromePossible("noon"));
        assertTrue(isPalindromePossible3("noon"));
    }

    @Test
    void testFour() {
        assertFalse(isPalindromePossible("zgzqxljjp"));
        assertFalse(isPalindromePossible3("zgzqxljjp"));
    }

    @Test
    void testFive() {
        assertFalse(isPalindromePossible("tgmqkpdhnhatoco"));
        assertFalse(isPalindromePossible3("tgmqkpdhnhatoco"));
    }
}