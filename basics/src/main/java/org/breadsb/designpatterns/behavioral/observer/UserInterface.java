package org.breadsb.designpatterns.behavioral.observer;

public class UserInterface implements Observer {

    private String name;

    public UserInterface(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(name + " - Product: " + product.getName() + " price has changed from: X" + " to "  + product.getPrice());
    }
}