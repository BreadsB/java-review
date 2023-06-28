package org.breadsb.designpatterns.abstractfactory.factories;

import org.breadsb.designpatterns.abstractfactory.products.Product;

public interface AbstractFactory {
    Product createProduct();
}
