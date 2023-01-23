package org.breadsb.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PigLatinTestSuite {

    PigLatin pigLatin = new PigLatin();

    @Test
    void testVowels() {
        //GIVEN
        String input = "attic";

        //WHEN
        String result = pigLatin.rule1(input);

        //THEN
        assertEquals("atticay", result);
    }

    @Test
    public void testSecondRule() {

        //GIVEN
        String input1 = "dedair";
        String input2 = "chair";
        String input3 = "Deniro";

        //WHEN
        String result1 = pigLatin.rule2(input1);
        String result2 = pigLatin.rule2(input2);
        String result3 = pigLatin.rule2(input3);

        //THEN
        assertEquals("edairday", result1);
        assertEquals("airchay", result2);
        assertEquals("eniroday", result3);

    }

    @Test
    public void testThirdRule() {
        //GIVEN
        String input1 = "square";

        //WHEN
        String result = pigLatin.rule3(input1);

        //THEN
        assertEquals("aresquay", result);
    }

    @Test
    @DisplayName("Testing the fourth rule of PigLatin")
    public void testFourthRule() {
        //GIVEN
        String input1 = "rhythm";
        String input2 = "my";

        //WHEN
        String result1 = pigLatin.rule4(input1);
        String result2 = pigLatin.rule4(input2);

        //THEN
        assertEquals("ythmrhay", result1);
        assertEquals("ymay", result2);
    }

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
