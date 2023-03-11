package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class WordCountTest {

    WordCount wc = new WordCount();

    @Test
    void testLowerCase() {
        //GIVEN
        String word = "\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled.";

        //WHEN
        Map<String, Integer> result = wc.countWords(word);

        //THEN
        Assertions.assertEquals(10, result.size());
        Assertions.assertEquals(2, result.get("the"));
    }

    @Test
    void testCountWords() {
        //GIVEN
        String word = "\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled.";

        //WHEN
        Map<String, Integer> result = wc.countWords(word);

        //THEN
        Assertions.assertEquals(10, result.size());
        Assertions.assertEquals(2, result.get("the"));
    }
}