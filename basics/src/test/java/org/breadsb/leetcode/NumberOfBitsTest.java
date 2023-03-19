package org.breadsb.leetcode;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfBitsTest {
//              https://www.rapidtables.com/convert/number/decimal-to-binary.html
//              https://www.techtarget.com/whatis/definition/bitwise

    @Test
    void test1() {

        int a = 100;
        String b = "100abc";
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.bitCount(a));
    }

    @Test
    void binarySystem() {
//        System dwojkowy
//        8,4,2,1
        assertEquals("111", Integer.toBinaryString(7));
        assertEquals("1010", Integer.toBinaryString(10));
        assertEquals("1001", Integer.toBinaryString(9));
        assertEquals("11001", Integer.toBinaryString(25));
    }

    @Test
    void hexagonalSystem() {
//        https://www.rapidtables.com/convert/number/decimal-to-hex.html
        assertEquals("19", Integer.toHexString(25));
//        25/16 = 1 + 9, 1/16 = 0 + 1

    }

    @Test
    void octalSystem() {
//        https://www.rapidtables.com/convert/number/decimal-to-octal.html
        assertEquals("1356", Integer.toOctalString(750));
//        750/8 = 93 + [6], 93/8 = 11 + [5], 11/8 = 1 + [3], 1/8 = 0 + [1]
    }
}