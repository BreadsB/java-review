package org.breadsb.edabit.algorithms;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.algorithms.RearrangeTheSentence.*;
import static org.junit.jupiter.api.Assertions.*;

class RearrangeTheSentenceTest {

    @Test
    void test1() {
        //GIVEN
        String s = "Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.";

        //WHEN
        String result = rearrange(s);

        //THEN
        String expected = "I love Tesh just the way she is.";
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        String s = "the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!";

        String result = rearrange(s);

        String expected = "Happiest birthday to the man of no steel!";
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        String s = "is2 Thi1s T4est 3a";

        String result = rearrange(s);

        String expected = "This is a Test";
        assertEquals(expected, result);
    }

    @Test
    void test4() {
        String s = "4of Fo1r pe6ople g3ood th5e the2";

        String result = rearrange(s);

        String expected = "For the good of the people";
        assertEquals(expected, result);
    }

    @Test
    void test5() {
        String s = " ";

        String result = rearrange(s);

        String expected = "";
        assertEquals(expected, result);
    }
}