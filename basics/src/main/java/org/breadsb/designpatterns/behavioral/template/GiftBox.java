package org.breadsb.designpatterns.behavioral.template;

public class GiftBox extends Packing {
    @Override
    public void prepareItems() {
        System.out.println("Preparing gifts for packing");
    }

    @Override
    public void wrapItems() {
        System.out.println("Wrapping all gifts");
    }

    @Override
    public void labelPackage() {
        System.out.println("Labelling gift box");
    }
}