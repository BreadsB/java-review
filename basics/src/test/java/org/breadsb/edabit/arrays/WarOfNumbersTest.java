package org.breadsb.edabit.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarOfNumbersTest {

    @Test
    void test1() {
        int a = WarOfNumbers.warOfNumbers(new int[] {2, 8, 7, 5});
        assertEquals(2, a);
    }

    @Test
    void test2() {
        assertEquals(27, WarOfNumbers.warOfNumbers(new int[] {12,90,75}));
    }

    @Test
    void test3() {
        assertEquals(168,   WarOfNumbers.warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
        assertEquals(793,   WarOfNumbers.warOfNumbers(new int[] {654,7,23,3,78,4,56,34}));
        assertEquals(5,     WarOfNumbers.warOfNumbers(new int[] {1,2,3,4,5,6,7,8,9}));
        assertEquals(228,   WarOfNumbers.warOfNumbers(new int[] {97,83,209,141,134,298,110,207,229,275,115,64,244,278}));
        assertEquals(83,    WarOfNumbers.warOfNumbers(new int[] {332,92,35,315,109,168,320,230,63,323,16,204,105,17,226,157,245,44,223,136,93}));
        assertEquals(846,   WarOfNumbers.warOfNumbers(new int[] {322,89,36,310,297,157,251,55,264,244,200,304,25,308,311,269,303,257,6,311,307,310,50,46,54,237,59,105,267}));
        assertEquals(0,     WarOfNumbers.warOfNumbers(new int[] {50,100,149,1,200,199,3,2}));
    }
}
