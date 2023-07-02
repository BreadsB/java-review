package org.breadsb.designpatterns.creational.factory.products;

public class Window implements Product {
    @Override
    public String getName() {
        return "Window";
    }

    @Override
    public double getPrice() {
        return 720.0;
    }
}
