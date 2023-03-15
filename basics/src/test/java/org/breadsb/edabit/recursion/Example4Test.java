package org.breadsb.edabit.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example4Test {

    @Test
    void test1() {
        assertEquals(72, Example4.closingInSum(2520));
        assertEquals(485, Example4.closingInSum(1979672314137318116L));
        assertEquals(426, Example4.closingInSum(2801980378842185820L));
        assertEquals(430, Example4.closingInSum(3440584288422776554L));
    }
}
