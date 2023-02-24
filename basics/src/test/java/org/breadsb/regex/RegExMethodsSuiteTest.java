package org.breadsb.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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

        //GIVEN
        String input2 = "aaabbwwwcccyyy550?";

        //WHEN
        String[] result = input2.split(RegExPatterns.POSITION_ON_CHARACTER_CHANGE.getRegex());

        //THEN
        String[] expected = new String[] {"aaa", "bb", "www", "ccc", "yyy", "55", "0", "?"};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    @Disabled
    void testSplitWithoutConsuming3() {
        //split on letter and mark change, but not at digit change.
        //GIVEN
        String input2 = "aaabbwwwcccyyy550?";

        //WHEN
        String[] result = input2.split("(?<=([a-zA-Z]))(?!\\1)");

        //THEN
        String[] expected = new String[] {"aaa", "bb", "www", "ccc", "yyy", "550", "?"};
        Assertions.assertArrayEquals(expected, result);
    }

    @Disabled
    @Test
    void testSplitStringTillEnd() {

        //GIVEN
        String input2 = "ABCDE";

        //WHEN
        String[] result = input2.split("(?=(\\w+))");

        //THEN
        String[] expected = new String[] {"ABCDE", "BCDE", "CDE", "DE", "E"};
        Assertions.assertArrayEquals(expected, result);
    }
}