package org.breadsb.edabit.data_structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixNotationTest {


    @Test
    void test1() {
        assertEquals(18, PostfixNotation.postfix("3 6 *"));
        assertEquals(4, PostfixNotation.postfix("2 2 +"));
        assertEquals(0, PostfixNotation.postfix("5 10 /"));
        assertEquals(0, PostfixNotation.postfix("10 /"));
        assertEquals(1, PostfixNotation.postfix("2 3 * 1 - 5 /"));
        assertEquals(5, PostfixNotation.postfix("5"));
        assertEquals(10, PostfixNotation.postfix("10 10 * 10 /"));
        assertEquals(10, PostfixNotation.postfix("5 6 * 2 1 + /"));
        assertEquals(-2, PostfixNotation.postfix("1 1 + 2 2 + -"));
        assertEquals(6, PostfixNotation.postfix("8 4 / 9 * 3 1 * /"));
    }
}