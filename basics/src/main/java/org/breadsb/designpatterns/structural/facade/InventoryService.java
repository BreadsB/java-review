package org.breadsb.designpatterns.structural.facade;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        System.out.println("Checking product availability...");
        return true;
    }
}
