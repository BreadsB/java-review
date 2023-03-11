package org.breadsb.strings;

import org.breadsb.edabit.strings.ReverseWordInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordInStringTest {

    @Test
    void firstTestReverseWordMethod() {
        //GIVEN
        String s = "the sky is blue";

        //WHEN
        String result = ReverseWordInString.reverseWord(s);

        //THEN
        String expected = "blue is sky the";
        assertEquals(expected, result);
    }

    @Test
    void secondTestReverseWordMethod() {
        //GIVEN
        String s = "  hello world!  ";

        //WHEN
        String result = ReverseWordInString.reverseWord(s);

        //THEN
        String expected = "world! hello";
        assertEquals(expected, result);
    }

    @Test
    void ThirdTestReverseWordMethod() {
        //GIVEN
        String s = "a good   example";

        //WHEN
        String result = ReverseWordInString.reverseWord(s);

        //THEN
        String expected = "example good a";
        assertEquals(expected, result);
    }

    @Test
    public void test1() {
        assertEquals("world! hello", ReverseWordInString.reverseWord("  hello world!  "));
    }

    @Test
    public void test2() {
        assertEquals("the sky is blue", ReverseWordInString.reverseWord("blue is sky the"));
    }

    @Test
    public void test3() {
        assertEquals("example good a", ReverseWordInString.reverseWord( "a good   example"));
    }
    @Test
    public void test4() {
        assertEquals("example good a", ReverseWordInString.reverseWord( "a good   example"));
    }
    @Test
    public void test5() {
        assertEquals("this is another example of fraud!", ReverseWordInString.reverseWord( "fraud! of example another is  this"));
    }
    @Test
    public void test6() {
        assertEquals("how in the world!abc did that happen!", ReverseWordInString.reverseWord( "happen! that did world!abc the in how"));
    }
    @Test
    public void test7() {
        assertEquals("You are the man!", ReverseWordInString.reverseWord( "man! the are You"));
    }
}