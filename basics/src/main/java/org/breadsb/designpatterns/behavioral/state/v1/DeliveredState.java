package org.breadsb.designpatterns.behavioral.state.v1;

public class DeliveredState implements State {
    @Override
    public void process(Order order) {
        System.out.println("Order has already been processed. Current order status = " + order.getCurrentState());
    }

    @Override
    public void shipping(Order order) {
        System.out.println("Order has already been shipped. Current order status = " + order.getCurrentState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order has already been delivered Current order status = " + order.getCurrentState());
        order = null;
    }
}
