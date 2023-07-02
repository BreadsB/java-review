package org.breadsb.designpatterns.creational.prototype;

import org.breadsb.designpatterns.creational.prototype.Car;
import org.breadsb.designpatterns.creational.prototype.Manufacturer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypePatternTestSuite {

    @Test
    void testPrototypePattern() {
        Manufacturer manufacturer1 = new Manufacturer("Audi", "Germany");
        Car car1 = new Car(manufacturer1, "Audi A4", 2500, 204, 50000);
        Car car2 = car1.cloneDeep();
        Car car3 = car1.cloneShallow();

        manufacturer1.setName("Ford");

        Assertions.assertEquals(car1.getManufacturer().getName(), car3.getManufacturer().getName());
        Assertions.assertNotEquals(car1.getManufacturer().getName(), car2.getManufacturer().getName());
    }
}
