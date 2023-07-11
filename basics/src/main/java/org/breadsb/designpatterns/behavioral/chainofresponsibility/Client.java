package org.breadsb.designpatterns.behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new BaseHandler();
        Handler h2 = new MidHandler();
        h1.setNext(h2);

        h1.handle(1200);
    }
}
