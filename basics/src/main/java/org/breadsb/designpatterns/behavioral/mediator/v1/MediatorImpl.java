package org.breadsb.designpatterns.behavioral.mediator.v1;

public class MediatorImpl implements Mediator {

    Component component;

    @Override
    public void registerComponent(Component component) {
        this.component = component;
    }

    @Override
    public void process() {
        this.component.action();
    }
}