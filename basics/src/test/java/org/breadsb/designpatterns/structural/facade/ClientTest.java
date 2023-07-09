package org.breadsb.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void mainTest() {
        Client client = new Client();
        client.facade = new OrderServiceFacadeImpl();
        client.orderProduct(5);
        boolean result = client.orderFulfilled;
        assertTrue(result);
    }
}