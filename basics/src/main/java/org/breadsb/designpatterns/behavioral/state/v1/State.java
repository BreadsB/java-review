package org.breadsb.designpatterns.behavioral.state.v1;

public interface State {
    void process(Order order);
    void shipping(Order order);
    void deliver(Order order);
}
