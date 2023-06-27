package org.breadsb.designpatterns.factory;

abstract class Food {
    protected int calories;
    protected double carbs;
    protected double fat;
    protected double protein;

    public void calculateCalories() {
        calories = (int) (carbs*4 + fat*9 + protein*4);
    }

    Food(double carbs, double fat, double protein) {
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }
}
