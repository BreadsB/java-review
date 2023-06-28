package org.breadsb.designpatterns.abstractfactory.factories;

import org.breadsb.designpatterns.abstractfactory.products.Door;
import org.breadsb.designpatterns.abstractfactory.products.Product;

public class DoorFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Door();
    }
}
