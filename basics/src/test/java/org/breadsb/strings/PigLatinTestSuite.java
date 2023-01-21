package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PigLatinTestSuite {

    PigLatin pigLatin = new PigLatin();

    @Test
    void testVowels() {
        //GIVEN
        String input = "attic";

        //WHEN
        String result = pigLatin.rule1(input);

        //THEN
        Assertions.assertEquals("atticay", result);
    }

    @Test
    public void testSecondRule() {

        //GIVEN
        String input1 = "dedair";
        String input2 = "chair";
        String input3 = "Deniro";

        //WHEN
        String result1 = pigLatin.rule2("dedair");
        String result2 = pigLatin.rule2("chair");
        String result3 = pigLatin.rule2("Deniro");

        //THEN
        Assertions.assertEquals("airdeday", result1);
        Assertions.assertEquals("airchay", result2);
        Assertions.assertEquals("eniroday", result3);

    }

    @Test
    public void testThirdRule() {
        //GIVEN
        String input1 = "square";

        //WHEN
        String result = pigLatin.rule3(input1);

        //THEN
        Assertions.assertEquals("aresquay", result);
    }
}
