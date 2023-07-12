package org.breadsb.designpatterns.behavioral.mediator.v1;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Component componentA = new ComponentA(mediator);
        Component componentB = new ComponentB(mediator);
        Component componentC = new ComponentC(mediator);
        Component componentD = new ComponentD(mediator);

        mediator.registerComponent(componentA);
        mediator.process();
        mediator.registerComponent(componentB);
        mediator.process();
        mediator.registerComponent(componentC);
        mediator.process();
        mediator.registerComponent(componentD);
        mediator.process();
    }
}
