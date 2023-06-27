package org.breadsb.designpatterns.factory;

abstract class Food {
    protected int calories;

    abstract void calculateCalories();

    public int getCalories() {
        return calories;
    }
}
