package org.breadsb.designpatterns.creational.factory.factories;

import org.breadsb.designpatterns.creational.factory.products.Product;

public interface AbstractFactory {
    Product createProduct();
}
