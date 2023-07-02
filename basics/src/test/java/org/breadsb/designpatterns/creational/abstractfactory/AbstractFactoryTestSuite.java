package org.breadsb.designpatterns.creational.abstractfactory.abstractfactory;

import org.breadsb.designpatterns.creational.abstractfactory.Order;
import org.breadsb.designpatterns.creational.factory.factories.AbstractFactory;
import org.breadsb.designpatterns.creational.factory.factories.ChairFactory;
import org.breadsb.designpatterns.creational.factory.factories.DoorFactory;
import org.breadsb.designpatterns.creational.factory.factories.WindowFactory;
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
