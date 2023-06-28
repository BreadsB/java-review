package org.breadsb.designpatterns.abstractfactory;

import org.breadsb.designpatterns.abstractfactory.factories.AbstractFactory;
import org.breadsb.designpatterns.abstractfactory.factories.ChairFactory;
import org.breadsb.designpatterns.abstractfactory.factories.DoorFactory;
import org.breadsb.designpatterns.abstractfactory.factories.WindowFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTestSuite {

    @Test
    void createNewChair() {
        AbstractFactory chairFactory = new ChairFactory();
        Order order = new Order(chairFactory);
        Assertions.assertTrue("chair".equalsIgnoreCase(order.getProductName()));
    }

    @Test
    void createNewWindow() {
        AbstractFactory windowFactory = new WindowFactory();
        Order order = new Order(windowFactory);
        Assertions.assertTrue("window".equalsIgnoreCase(order.getProductName()));
    }

    @Test
    void createNewDoor() {
        AbstractFactory doorFactory = new DoorFactory();
        Order order = new Order(doorFactory);
        Assertions.assertTrue("door".equalsIgnoreCase(order.getProductName()));
    }
}
