package org.breadsb.designpatterns.behavioral.state;

public class ProcessingState implements State {
    @Override
    public void process(Order order) {
        System.out.println("Order has already been processed.");
    }

    @Override
    public void shipping(Order order) {
        System.out.println("Preparing the shipping...");
        order.changeState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order cannot be delivered, because it has not been shipped");
    }
}
