package org.breadsb.designpatterns.creational.factory.products;

public class Chair implements Product {

    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public double getPrice() {
        return 1000.0;
    }
}
