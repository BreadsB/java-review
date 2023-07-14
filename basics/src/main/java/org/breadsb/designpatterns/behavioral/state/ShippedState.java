package org.breadsb.designpatterns.behavioral.state;

public class ShippedState implements State {
    @Override
    public void process(Order order) {
        System.out.println("Order has already been processed");
    }

    @Override
    public void shipping(Order order) {
        System.out.println("Order has already been shipped");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Delivering order in progress...");
        order.changeState(new DeliveredState());
    }
}
