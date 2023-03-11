package org.breadsb.edabit.ifconditionals;

import org.breadsb.edabit.ifconditionals.BlackJack;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BlackJackTestSuite {

    Random random = new Random();

    @Test
    void testBeginning() {
        BlackJack blackJack = new BlackJack();

        blackJack.addCardOnPlayersHand();
        blackJack.addCardOnPlayersHand();

        System.out.println(blackJack.getPlayerHand());
        System.out.println(blackJack.getPlayerScore());
    }
}