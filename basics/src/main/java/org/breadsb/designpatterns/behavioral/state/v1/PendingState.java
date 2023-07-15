package org.breadsb.designpatterns.behavioral.state.v1;

public class PendingState implements State {
    @Override
    public void process(Order order) {
        System.out.println("Processing order...");
        order.changeState(new ProcessingState());
    }

    @Override
    public void shipping(Order order) {
        System.out.println("Order cannot be shipped, because it has not been processed");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order cannot be delivered, because it has not been processed and shipped");
    }
}
