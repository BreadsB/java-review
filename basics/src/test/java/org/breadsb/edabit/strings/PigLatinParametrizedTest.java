package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.PigLatin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigLatinParametrizedTest {

    PigLatin pigLatin = new PigLatin();

    @ParameterizedTest
    @CsvSource({"Adam,Adamay", "chair,airchay", "square,aresquay", "quit,itquay"})
    void testAllRules(String input, String expected) {
        String result = pigLatin.allRules( input);
        assertEquals(expected, result);
    }
}
