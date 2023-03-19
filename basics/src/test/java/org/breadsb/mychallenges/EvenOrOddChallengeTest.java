package org.breadsb.mychallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.breadsb.mychallenges.EvenOrOddChallenge.*;

class EvenOrOddChallengeTest {


    @Test
    void testIfStringIsEven() {
        String s = "1";
        assertFalse(approach1(s));
    }

    @Test
    void testIfStringIsEvenSecondApproach() {
        String s = "5";
        assertFalse(approach2(s));
    }
}