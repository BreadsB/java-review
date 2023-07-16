package org.breadsb.designpatterns.behavioral.state.v2;

import org.junit.jupiter.api.Test;

public class CandyVendingTest {

    @Test
    void testOne() {
        CandyVendingMachine cvm = new CandyVendingMachine(1);
        cvm.insertCoin();
        cvm.pressButton();
    }
}