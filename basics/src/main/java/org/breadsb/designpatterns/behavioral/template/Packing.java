package org.breadsb.designpatterns.behavioral.template;

public abstract class Packing {
    public void pack() {
        prepareItems();
        wrapItems();
        labelPackage();
    }

    public abstract void prepareItems();
    public abstract void wrapItems();
    public abstract void labelPackage();
}