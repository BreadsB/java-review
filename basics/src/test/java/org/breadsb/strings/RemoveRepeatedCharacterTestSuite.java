package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RemoveRepeatedCharacterTestSuite {

    public static final String[] LIST_STRINGS = new String[] {"teshahset", "hello", "aaaaaaa", "WWE!!!", "call 911"};

    @ParameterizedTest
    @ValueSource(strings = {"teshahset", "hello", "aaaaaaa", "WWE!!!", "call 911"})
    void testOne(String s) {
        System.out.println(RemoveRepeatedCharacters.unrepeatedFirstMethod(s));
    }

    @ParameterizedTest
    @CsvSource(value = {"teshahset:tesha", "hello:helo", "aaaaaa:a", "WWE!!!:WE!", "call 911:cal 91"}, delimiter = ':')
    void testTwo(String input, String expected) {
        String actual = RemoveRepeatedCharacters.unrepeatedSecondMethod(input);
        Assertions.assertEquals(expected, actual);
    }
}
