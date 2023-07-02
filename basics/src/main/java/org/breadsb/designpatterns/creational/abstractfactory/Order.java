package org.breadsb.designpatterns.creational.abstractfactory;

import org.breadsb.designpatterns.creational.factory.factories.AbstractFactory;
import org.breadsb.designpatterns.creational.factory.products.Product;

public class Order {
    private final Product product;

    public Order(AbstractFactory factory) {
        this.product = factory.createProduct();
    }

    public String getProductName() {
        return product.getName();
    }

    public double getProductPrice() {
        return product.getPrice();
    }
}
