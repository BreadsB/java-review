package org.breadsb.designpatterns.abstractfactory.products;

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
