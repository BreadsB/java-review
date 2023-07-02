package org.breadsb.designpatterns.creational.factory.factories;

import org.breadsb.designpatterns.creational.factory.products.Door;
import org.breadsb.designpatterns.creational.factory.products.Product;

public class DoorFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Door();
    }
}
