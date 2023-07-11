package org.breadsb.designpatterns.behavioral.chainofresponsibility;

public class MidHandler extends BaseHandler {

    public void handle(int value) {
        if (value > 1000) {
            System.out.println("Processing value of " + value);
        } else {
            super.handle(value);
        }
    }
}