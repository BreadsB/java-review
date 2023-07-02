package org.breadsb.designpatterns.creational.factory.food;

import org.breadsb.designpatterns.creational.factory.food.Food;
import org.breadsb.designpatterns.creational.factory.food.GetFoodFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FoodFactoryTestSuite {

    GetFoodFactory gff;

    @BeforeEach
    void setUp() {
        gff = new GetFoodFactory();
    }

    @Test
    void testFoodFactory() {
        Food orange = gff.getFood("orange");
        orange.calculateCalories();
        Assertions.assertEquals(75, orange.getCalories());
    }

    @Test
    void addFoodToList() {
        List<Food> foodList = new ArrayList<>();
        Food carrot = gff.getFood("carrot");
        Food apple = gff.getFood("apple");

        foodList.add(carrot);
        foodList.add(apple);

        Assertions.assertEquals(2, foodList.size());
    }
}
