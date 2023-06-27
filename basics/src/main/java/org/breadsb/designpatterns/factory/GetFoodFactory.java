package org.breadsb.designpatterns.factory;

public class GetFoodFactory {

    public Food getFood(String food) {
        if (food.equalsIgnoreCase("orange")) {
            return new Orange();
        }
        if (food.equalsIgnoreCase("carrot")) {
            return new Carrot();
        }
        if (food.equalsIgnoreCase("greenapple")) {
            return new GreenApple();
        }
        return null;
    }
}
