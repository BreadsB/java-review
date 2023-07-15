package org.breadsb.designpatterns.behavioral.state;

import org.breadsb.designpatterns.behavioral.state.v1.Order;
import org.junit.jupiter.api.Test;

public class StateDesignPatternTestSuite {

    @Test
    void globalStateDesignPatternTest() {
        Order order = new Order();
        order.getCurrentState();
        order.process();
        order.getCurrentState();
        order.deliver();
        order.ship();
        order.deliver();
        order = null;
    }
}
