package org.breadsb.designpatterns.behavioral.mediator.v1;

public class ComponentB implements Component {
    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void action() {
        System.out.println("This action was performed by Component B");
    }
}
