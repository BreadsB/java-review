package org.breadsb.edabit.data_structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixNotationTest {


    @Test
    void test1() {
        assertEquals(18, PostfixNotation.postfix2("3 6 *"));
        assertEquals(4, PostfixNotation.postfix2("2 2 +"));
        assertEquals(0, PostfixNotation.postfix2("5 10 /"));
        assertEquals(0, PostfixNotation.postfix2("10 /"));
        assertEquals(1, PostfixNotation.postfix2("2 3 * 1 - 5 /"));
        assertEquals(5, PostfixNotation.postfix2("5"));
        assertEquals(10, PostfixNotation.postfix2("10 10 * 10 /"));
        assertEquals(10, PostfixNotation.postfix2("5 6 * 2 1 + /"));
        assertEquals(-2, PostfixNotation.postfix2("1 1 + 2 2 + -"));
        assertEquals(6, PostfixNotation.postfix2("8 4 / 9 * 3 1 * /"));
    }
}