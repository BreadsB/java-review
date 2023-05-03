package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.util.Arrays.asList;

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

        Assertions.assertFalse(Objects.equals(null, s3));
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

    @Test
    void testingStringTokenizer() {
        StringSandbox ssbox = new StringSandbox();
        String s1 = "Remember token?";
        String s2 = "I,remember,this,token";

        List<String> result1 = new ArrayList<>(asList("Remember token?"));
        List<String> result2 = new ArrayList<>(asList("I","remember","this","token"));

        Assertions.assertEquals(result1, ssbox.getTokens(s1, ","));
        Assertions.assertTrue(result1.equals(ssbox.getTokens(s1, ",")));
        Assertions.assertEquals(result2, ssbox.getTokens(s2, ","));
    }

    @Test
    void testingStringJoiner() {
        String one = "Hello";
        String two = "World";

        String result = StringSandbox.joinTwoStringsUsingJoiner(one, two, StringSandbox.Delimiter.MINUS);

        Assertions.assertEquals("Joiner: [Hello-World]", result);
    }

    @Test
    void testSecondJoiner() {
        String s1 = "Good";
        String s2 = "Morning";

        String result = StringSandbox.secondJoiner(s1, s2, StringSandbox.Delimiter.MINUS);

        Assertions.assertEquals("Joiner: [Good-Morning]", result);
    }

    @Test
    void testEmptyJoiner() {
        StringJoiner sj = new StringJoiner(",");
        sj.setEmptyValue("Empty");

        Assertions.assertEquals("Empty", sj.toString());
    }

    @Test
    void mergingTwoStringJoiners() {
        StringJoiner joiner1 = new StringJoiner(",");
        joiner1.setEmptyValue("Empty");

        StringJoiner joiner2 = new StringJoiner("-");
        joiner2.add("Big").add("Ben");

        joiner2.merge(joiner1);

        Assertions.assertEquals("Big-Ben", joiner2.toString());
        Assertions.assertEquals("Empty", joiner1.toString());
    }

    @Test
    void testIfStringIsNumeric() {
        int a = 170;
        StringSandbox.intAsHexBinary(a);
    }

}