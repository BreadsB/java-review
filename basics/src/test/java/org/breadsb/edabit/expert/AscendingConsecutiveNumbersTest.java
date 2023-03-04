package org.breadsb.edabit.expert;

import org.junit.jupiter.api.Test;

import static org.breadsb.edabit.expert.AscendingConsecutiveNumbers.*;
import static org.junit.jupiter.api.Assertions.*;

class AscendingConsecutiveNumbersTest {

    @Test
    void testOne() {
        assertTrue(ascending("256257"));
        assertTrue(ascending("444445"));
        assertTrue(ascending("1234567"));
        assertTrue(ascending("123412351236"));
        assertTrue(ascending("57585960616263"));
        assertTrue(ascending("500001500002500003"));
        assertFalse(ascending("35236237238"));
        assertFalse(ascending("90090190290"));
    }
}