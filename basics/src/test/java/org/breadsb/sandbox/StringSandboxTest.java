package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

class StringSandboxTest {

    @Test
    void test1() {
        String s = StringSandbox.decoding("The façade pattern is a software design pattern.", "US-ASCII");
        System.out.println(s);
    }

    @Test
    void testConvertingStringToBinary() {
        String s = StringSandbox.convertToBinary("Hello friend", "US-ASCII");
        System.out.println(s);
    }

    @Test
    void testLocalStringObjects() {

        String s1 = "hello"; // "hello" placed to String pool
        String s2 = "hello"; // s2 reference to "hello" in String pool
        String s3 = new String("hello"); // s3 created in heap memory with value "hello"

        Assertions.assertEquals(s1, s2);
        Assertions.assertEquals(s1, s3);
        Assertions.assertEquals(s2, s3);

        Assertions.assertTrue(s1 == s2);
        Assertions.assertTrue(s1.equals(s2));
        Assertions.assertTrue(s1.equals(s3));
        Assertions.assertTrue(Objects.equals(s1, s2));
        Assertions.assertTrue(Objects.equals(s1, s3));
        Assertions.assertTrue(Objects.equals(null, s3));

        Assertions.assertFalse(s1 == s3);

        Assertions.assertSame(s1, s2);

        Assertions.assertNotSame(s1, s3);
        Assertions.assertNotSame(s2, s3);
    }

    @Test
    void testingFormatter() {
        String s = String.format("We have only 10%% chances to do this");
        Assertions.assertEquals("We have only 10% chances to do this", s);

        String s2 = String.format("I just met a new person. His name is %s", "Mike");
        Assertions.assertEquals("I just met a new person. His name is Mike", s2);

        String s3 = String.format("%s and %s are twins", "Robert", "Andrew");
        Assertions.assertEquals("Robert and Andrew are twins", s3);

        String s4 = String.format("%2$s and %1$s are twins", "Robert", "Andrew");
        Assertions.assertEquals("Andrew and Robert are twins", s4);

        String s5 = String.format("Hello%10s", "world");
        Assertions.assertEquals("Hello     world", s5);

        Calendar c1 = new GregorianCalendar(2022, 5, 7);
        Calendar c2 = new GregorianCalendar(2020, 1, 14);
        String s6 = String.format("Date of birth: %1$te %1$tB %2$tY", c1, c2);
        Assertions.assertEquals("Date of birth: 7 czerwca 2020", s6);
    }
}