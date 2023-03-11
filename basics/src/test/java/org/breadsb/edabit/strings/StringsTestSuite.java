package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.BeerSong;
import org.breadsb.edabit.strings.Isogram;
import org.breadsb.edabit.strings.Raindrops;
import org.breadsb.edabit.strings.TwoFer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringsTestSuite {

    @Test
    void testTwoFer() {

        String result1 = TwoFer.twoFer("John");
        assertEquals("One for John, one for me", result1);
        int resultTwoFer = 25 % 5;
        System.out.println(resultTwoFer);
    }

    @Test
    void testRaindrops() {
        Raindrops raindrops = new Raindrops();
        assertEquals("Plong", raindrops.sound(28));
        assertEquals("PlingPlong", raindrops.sound(21));
        assertEquals("Plang", raindrops.sound(25));
        assertEquals("PlingPlang", raindrops.sound(30));
        assertEquals("34", raindrops.sound(34));
    }

    @Test
    void singBeerSong() {
        BeerSong beerSong = new BeerSong();
        beerSong.singSong(99);
    }

    @Test
    void testIsogram() {
        Isogram isogram = new Isogram();
        boolean isogramResult = isogram.check("isograms");
        assertFalse(isogramResult);
    }
}
