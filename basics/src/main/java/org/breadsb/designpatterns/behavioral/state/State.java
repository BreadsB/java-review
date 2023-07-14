package org.breadsb.designpatterns.behavioral.state;

public interface State {
    void process(Order order);
    void shipping(Order order);
    void deliver(Order order);
}
