package org.breadsb.algorithms;

import org.breadsb.edabit.algorithms.TicTacToeBlock;
import org.junit.jupiter.api.Test;

public class TicTacToeBlockTest {

    @Test
    void testOne() {
        System.out.println(TicTacToeBlock.blockPlayer(3, 5));
    }

    @Test
    void testTwo() {
        int a = TicTacToeBlock.sol3(0, 2);
    }
}
