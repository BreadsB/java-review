package org.breadsb.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//https://www.rexegg.com/regex-quickstart.html
//https://www.baeldung.com/java-split-string-keep-delimiters

public class RegExMethodsSuiteTest {

    @Test
    void testSplitWithoutConsuming() {
        //GIVEN
        String input1 = "aaaawwwa";

        //WHEN
        String[] result = input1.split(RegExPatterns.SPLIT_BETWEEN_A_W.getRegex());

        //THEN
        String[] expected = new String[] {"aaaa", "wwwa"};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSplitWithoutConsuming2() {
        String input2 = "aaabbwwwcccyyy550?";
        String[] result = input2.split(RegExPatterns.POSITION_ON_CHARACTER_CHANGE.getRegex());
        String[] expected = new String[] {"aaa", "bb", "www", "ccc", "yyy", "55", "0", "?"};
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSplitWithoutConsuming3() {
        //split on letter and mark change, but not at digit change.

        String input2 = "aaabbwwwcccyyy550?";
        String[] result = input2.split("(?<=([a-zA-Z]))(?!\\1)");
        String[] expected = new String[] {"aaa", "bb", "www", "ccc", "yyy", "550", "?"};
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSplitStringTillEnd() {
        String input2 = "ABCDE";
        String[] result = input2.split("(?=(\\w+))");
        String[] expected = new String[] {"ABCDE", "BCDE", "CDE", "DE", "E"};
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expected, result);
    }
}