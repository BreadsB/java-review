package org.breadsb.booleans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnalynsInfiltrationTestSuite {

    AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration(false, false, true, false);

    @Test
    @DisplayName("Annalyn is fast attacking the camp")
    void testAnnalynFastAttack() {
        //GIVEN
        //WHEN
        boolean result = annalynsInfiltration.fastAttack();

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Annalyn is spying the camp")
    void testAnnalynSpyOnCamp() {
        boolean result = annalynsInfiltration.spyGroup();

        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Annalyn is signaling the prisoner")
    void testAnnalynSignalsPrisoner() {
        boolean result = annalynsInfiltration.signalPrisoner();

        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Annalyn is freeing the prisoner")
    void testAnnalynFreePrisoner() {
        boolean result = annalynsInfiltration.freePrisoner();

        Assertions.assertTrue(result);
    }
}
