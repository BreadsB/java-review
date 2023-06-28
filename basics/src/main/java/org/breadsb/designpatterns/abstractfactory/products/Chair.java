package org.breadsb.designpatterns.abstractfactory.products;

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
