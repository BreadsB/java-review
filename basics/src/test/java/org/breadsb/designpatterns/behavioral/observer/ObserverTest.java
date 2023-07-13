package org.breadsb.designpatterns.behavioral.observer;


import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void test() {
        Product product = new Product("Apple", 2.0);
        DiscountMonitoringSystem dms = new DiscountMonitoringSystem(product);
        UserInterface ui1 = new UserInterface("User12123534");
        UserInterface ui2 = new UserInterface("User13523455");
        UserInterface ui3 = new UserInterface("User08438551");
        dms.registerObserver(ui1);
        dms.registerObserver(ui2);
        dms.registerObserver(ui3);
        dms.changePrice(5.0);
        dms.removeObserver(ui1);
        dms.removeObserver(ui2);
        dms.changePrice(4.0);
    }
}