package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsTestSuite {

    @Test
    void testTwoFer() {

        String result1 = TwoFer.twoFer("John");
        Assertions.assertEquals("One for John, one for me", result1);
        int result = 25 % 5;
        System.out.println(result);
    }

    @Test
    void testRaindrops() {
        Raindrops raindrops = new Raindrops();
        Assertions.assertEquals("Plong", raindrops.sound(28));
        Assertions.assertEquals("PlingPlong", raindrops.sound(21));
        Assertions.assertEquals("Plang", raindrops.sound(25));
        Assertions.assertEquals("PlingPlang", raindrops.sound(30));
        Assertions.assertEquals("34", raindrops.sound(34));
    }

    @Test
    void singBeerSong() {
        BeerSong beerSong = new BeerSong();
        beerSong.singSong(99);
    }
}
