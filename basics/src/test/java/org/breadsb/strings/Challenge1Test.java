package org.breadsb.strings;

import org.breadsb.edabit.strings.Challenge1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Challenge1Test {

    @Test
    void test1() {
        Assertions.assertFalse(Challenge1.checkEnding("samurai", "zi"));
        Assertions.assertTrue(Challenge1.checkEnding("feminine", "nine"));
        Assertions.assertFalse(Challenge1.checkEnding("convention", "tio"));
        Assertions.assertTrue(Challenge1.checkEnding("abc", "bc"));
        Assertions.assertFalse(Challenge1.checkEnding("a", "romeo"));
        Assertions.assertFalse(Challenge1.checkEnding("", "romeo"));
        Assertions.assertTrue(Challenge1.checkEnding("   a ", "a "));
    }
}
