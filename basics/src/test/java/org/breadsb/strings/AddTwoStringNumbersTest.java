package org.breadsb.strings;

import org.junit.jupiter.api.Test;

import static org.breadsb.strings.AddTwoStringNumbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoStringNumbersTest {

    @Test
    public void testAddStrNumsWhileNumsAreIntegers() {
        //GIVEN
        String num1 = "5";
        String num2 = "9";

        //WHEN
        String result = addStrNums(num1, num2);

        //THEN
        String expected = "14";
        assertEquals(expected, result);
    }

    @Test
    public void testAddStrNumsWhileNumsAreLetters() {
        //GIVEN
        String num1 = "asdqwe";
        String num2 = "10";

        //WHEN
        String result = addStrNums(num1, num2);

        //THEN
        String expected = "-1";
        assertEquals(expected, result);
    }

    @Test
    public void testAddStrNumsWhileNumIsEmpty() {

        //GIVEN
        String num1 = "";
        String num2 = "5";

        //WHEN
        String result = addStrNums(num1, num2);

        //THEN
        String expected = "5";
        assertEquals(expected, result);
    }

    @Test
    void testAddStrNumsMethodTwoWhileNumsAreEmpty() {

        //GIVEN
        String num1 = "";
        String num2 = "8";

        //WHEN
        String result = addStrNumsMethodTwo(num1, num2);

        //THEN
        String expected = "8";
        assertEquals(expected, result);
    }

    @Test
    void testAddStrNumsMethodTwoWhileNumHaveLetters() {
        //GIVEN
        String num1 = "asdqwe";
        String num2 = "10";

        //WHEN
        String result = addStrNumsMethodTwo(num1, num2);

        //THEN
        String expected = "-1";
        assertEquals(expected, result);
    }
}
