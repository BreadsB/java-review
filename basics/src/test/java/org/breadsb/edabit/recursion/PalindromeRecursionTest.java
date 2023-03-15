package org.breadsb.edabit.recursion;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.recursion.PalindromeRecursion.isPalindrome;
import static org.breadsb.edabit.recursion.PalindromeRecursion.isPalindrome2;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeRecursionTest {

    @Test
    void test1() {
        assertTrue(isPalindrome("madam"));
        assertFalse(isPalindrome("adieu"));
        assertTrue(isPalindrome("rotor"));
    }

    @Test
    void test2() {
        assertTrue(isPalindrome2("madam"));
        assertFalse(isPalindrome2("adieu"));
        assertTrue(isPalindrome2("rotor"));
    }
}