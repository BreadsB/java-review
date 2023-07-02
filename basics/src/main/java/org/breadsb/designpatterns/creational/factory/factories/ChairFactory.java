package org.breadsb.designpatterns.creational.factory.factories;

import org.breadsb.designpatterns.creational.factory.products.Chair;
import org.breadsb.designpatterns.creational.factory.products.Product;

public class ChairFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Chair();
    }
}
