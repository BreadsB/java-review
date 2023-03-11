package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.PigLatin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PigLatinTestSuite {

    PigLatin pigLatin = new PigLatin();

    @Test
    void testCheckVowels() {
        //GIVEN
        String givenVar = "a";
        String givenVar2 = "b";

        //WHEN
        boolean resultVar = pigLatin.checkVowels(givenVar);
        boolean resultVar2 = pigLatin.checkVowels(givenVar2);

        //THEN
        assertTrue(resultVar);
        assertFalse(resultVar2);
    }
}
