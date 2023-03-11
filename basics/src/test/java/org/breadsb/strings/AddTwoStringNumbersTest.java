package org.breadsb.strings;

import org.junit.jupiter.api.*;

import static org.breadsb.edabit.strings.AddTwoStringNumbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddTwoStringNumbersTest {

    @Test
    @Order(1)
    @DisplayName("Add two string numbers while numbers are Integers. Method 1.")
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
    @Order(2)
    @DisplayName("Add two string numbers while one number have letters. Method 1.")
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
    @Order(4)
    @DisplayName("Add two string numbers while one number is blank. Method 1.")
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
    @Order(5)
    @DisplayName("Add two string numbers while one number is blank. Method 2.")
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
    @Order(3)
    @DisplayName("Add two string numbers while one number have letters. Method 2.")
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

    @Test
    @Order(6)
    @DisplayName("Add two string numbers while two numbers are very long. Method 1.")
    void testAddLongStrNums() {
        //GIVEN
        String num1 = "1874682736267235927359283579235789257";
        String num2 = "32652983572985729";

        //WHEN
        String result = addStrNums(num1, num2);

        //THEN
        String expected = "1874682736267235927391936562808774986";
        assertEquals(expected, result);
    }

    @Test
    @Order(7)
    @DisplayName("Add two string numbers while two numbers are very long. Method 2.")
    void testAddLongStrNumsMethodTwo() {
        //GIVEN
        String num1 = "1874682736267235927359283579235789257";
        String num2 = "32652983572985729";

        //WHEN
        String result = addStrNumsMethodTwo(num1, num2);

        //THEN
        String expected = "1874682736267235927391936562808774986";
        assertEquals(expected, result);
    }
}
