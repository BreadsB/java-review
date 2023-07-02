package org.breadsb.designpatterns.creational.factory.products;

public class Door implements Product {
    @Override
    public String getName() {
        return "Door";
    }

    @Override
    public double getPrice() {
        return 500.0;
    }
}
