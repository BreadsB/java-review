package org.breadsb.strings;

import org.junit.jupiter.api.Test;

import static org.breadsb.strings.RemoveTheWord.*;
import static org.junit.jupiter.api.Assertions.*;

class RemoveTheWordTest {

    @Test
    void testOne() {
        //GIVEN
        String[] chars = new String[]{"s","t","r","i","n","g","w"};
        String word = "string";

        //WHEN
        String[] result = removeLetters(chars, word);

        //THEN
        String[] expected = new String[]{"w"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test1() {
        //GIVEN
        String[] chars = new String[]{"b", "b", "l", "l", "g", "n", "o", "a", "w"};
        String word = "balloon";

        //WHEN
        String[] result = removeLetters(chars, word);

        //THEN
        String[] expected = new String[]{"b", "g", "w"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        //GIVEN
        String[] chars = new String[]{"d", "b", "t", "e", "a", "i"};
        String word = "edabit";

        //WHEN
        String[] result = removeLetters(chars, word);

        //THEN
        String[] expected = new String[0];
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        //GIVEN
        String[] chars = new String[]{"t", "t", "e", "s", "t", "u"};
        String word = "testing";

        //WHEN
        String[] result = removeLetters(chars, word);

        //THEN
        String[] expected = new String[]{"t", "u"};
        assertArrayEquals(expected, result);
    }
}