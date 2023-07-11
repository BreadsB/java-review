package org.breadsb.designpatterns.behavioral.chainofresponsibility;

public class BaseHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(int value) {
        if (value>500) {
            nextHandler.handle(value);
        } else {
            System.out.println("Signing contract by Base");
        }
    }
}
