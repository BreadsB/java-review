package org.breadsb.designpatterns.structural.facade;

public class PaymentService {
    public static boolean makePayment() {
        System.out.println("Connecting with bank");
        System.out.println("Checking account balance");
        System.out.println("Accepting payment");
        return true;
    }
}
