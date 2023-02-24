package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterviewQuestion1Test {

    @Test
    public void testCountLetters() {

        //GIVEN
        String s = "aaawwwa";

        //WHEN
        String result = InterviewQuestion1.countLetters(s);

        //THEN
        String expected = "3a3w1a";
        Assertions.assertEquals(expected, result);
    }
}
