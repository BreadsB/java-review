package org.breadsb.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfBitsTest {
//              https://www.rapidtables.com/convert/number/decimal-to-binary.html
//              https://www.techtarget.com/whatis/definition/bitwise

    @Test
    void test0() {
        int result = NumberOfBits.hammingWeight(Integer.parseInt("100000000010"));
        assertEquals(2, result);
    }

    @Test
    void test1() {

        int a = 100;
        String b = "100abc";
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.bitCount(a));
        System.out.println(Integer.parseInt("0101", 2));
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

    @Test
    void test2() {
//        https://javappa.com/kurs-java/operatory
//        https://www.geeksforgeeks.org/bitwise-shift-operators-in-java/
        assertEquals(1, 5&1); // 5 in binary system = 0101, 1 in binary system = 0001; 0101 & 0001 == 0001 => 1
        assertEquals(3,3&7); // 3 in binary = 0011, 7 in binary = 0111, 0011 & 0111 == 0011 => 3
        assertEquals(2, 6&2); // 0110 & 0010 == 0010 => 2
        assertEquals(0, 9&4); // 1001 & 0100 == 0000 => 0
//        a & b -> transform a and b to decimal. Then compare two binary number. If there is 0 return 0. If both have 1, return 1.
    }
}