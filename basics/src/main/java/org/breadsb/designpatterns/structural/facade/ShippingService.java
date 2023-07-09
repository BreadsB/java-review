package org.breadsb.designpatterns.structural.facade;

public class ShippingService {
    public static boolean shipProduct(Product product) {
        System.out.println("Sending request to courier");
        System.out.println("Check product: " + product.name + "can be send");
        return true;
    }

    public static boolean checkShipmentAvailability(Product product) {
        System.out.println("Checking whether shipment can be made...");
        System.out.println("Confirmation - product can be shipped");
        return true;
    }
}
