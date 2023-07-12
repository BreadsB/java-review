package org.breadsb.designpatterns.behavioral.mediator.v1;

public class ComponentD implements Component {
    private Mediator mediator;

    public ComponentD(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void action() {
        System.out.println("This component was performed by Component D");
    }
}
