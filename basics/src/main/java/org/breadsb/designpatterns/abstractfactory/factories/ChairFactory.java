package org.breadsb.designpatterns.abstractfactory.factories;

import org.breadsb.designpatterns.abstractfactory.products.Chair;
import org.breadsb.designpatterns.abstractfactory.products.Product;

public class ChairFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Chair();
    }
}
