package org.breadsb.designpatterns.behavioral.state;

import java.util.List;

//Context class
public class Order {
    private State state;
    private List<String> productList;

    public Order() {
        state = new PendingState();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void process() {
        state.process(this);
    }

    public void ship() {
        state.shipping(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public State getCurrentState() {
        System.out.println(state.toString());
        return state;
    }
}