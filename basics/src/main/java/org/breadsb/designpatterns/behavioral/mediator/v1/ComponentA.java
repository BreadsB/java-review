package org.breadsb.designpatterns.behavioral.mediator.v1;

public class ComponentA implements Component {
    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void action() {
        System.out.println("Action done by Component A");
    }
}
