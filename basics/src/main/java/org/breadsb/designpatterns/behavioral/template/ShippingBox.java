package org.breadsb.designpatterns.behavioral.template;

public class ShippingBox extends Packing {
    @Override
    public void prepareItems() {
        System.out.println("Preparing parcel box");
    }

    @Override
    public void wrapItems() {
        System.out.println("Wrapping items for parcel...");
    }

    @Override
    public void labelPackage() {
        System.out.println("Labeling parcel box");
    }
}
