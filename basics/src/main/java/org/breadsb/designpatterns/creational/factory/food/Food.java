package org.breadsb.designpatterns.creational.factory.food;

public abstract class Food {
    protected int calories;

    public abstract void calculateCalories();

    public int getCalories() {
        return calories;
    }
}
