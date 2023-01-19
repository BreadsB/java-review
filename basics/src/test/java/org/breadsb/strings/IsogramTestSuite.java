package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsogramTestSuite {

    @Test
    void testIsogram() {
        Isogram isogram = new Isogram();
        boolean result = isogram.check("isograms");
        Assertions.assertFalse(result);
    }
}