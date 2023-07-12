package org.breadsb.designpatterns.behavioral.mediator.v1;

public interface Mediator {

    void registerComponent(Component component);
    void process();
}
