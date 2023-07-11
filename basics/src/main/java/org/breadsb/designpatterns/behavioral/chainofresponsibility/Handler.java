package org.breadsb.designpatterns.behavioral.chainofresponsibility;

public interface Handler {

    void setNext(Handler handler);
    void handle(int value);
}
