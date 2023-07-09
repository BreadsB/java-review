package org.breadsb.designpatterns.structural.facade;

public class Client {

    OrderServiceFacade facade;
    boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("Order fulfilled? " + orderFulfilled);
    }
}