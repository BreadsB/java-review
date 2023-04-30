package org.breadsb.interface_inheritance;

import org.junit.jupiter.api.Test;

public class OverloadingOverridingTestSuite {

    @Test
    void testMethodOverriding() {
        Circle circle = new Circle();
    }

    @Test
    void testMethodOverloading() {
        Square square = new Square();
        System.out.println(square.showMessage("Hello"));
        System.out.println(square.showMessage("Hello", "World"));
        System.out.println(square.showMessage(2));
    }


}
