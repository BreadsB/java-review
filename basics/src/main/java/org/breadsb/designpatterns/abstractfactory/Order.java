package org.breadsb.designpatterns.abstractfactory;

import org.breadsb.designpatterns.abstractfactory.factories.AbstractFactory;
import org.breadsb.designpatterns.abstractfactory.products.Product;

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
