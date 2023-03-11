package org.breadsb.recursion;

import org.breadsb.edabit.recursion.Example1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    void testOne() {
        int a = Example1.length("shipment");
        assertEquals(8, Example1.length("shipment"));
    }
}