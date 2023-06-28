package org.breadsb.designpatterns.prototype;

import java.util.Objects;

public class Car implements CloneableCar {

    private Manufacturer manufacturer;
    private String modelName;
    private double engineCapacity;
    private int horsePower;
    private double price;

    public Car(Manufacturer manufacturer,
               String modelName,
               double engineCapacity,
               int horsePower,
               double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && horsePower == car.horsePower && Double.compare(car.price, price) == 0 && Objects.equals(manufacturer, car.manufacturer) && Objects.equals(modelName, car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, engineCapacity, horsePower, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer +
                ", modelName='" + modelName + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", price=" + price +
                '}';
    }

    @Override
    public Car cloneShallow() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Car cloneDeep() {
            return new Car(new Manufacturer(manufacturer.getName(), manufacturer.getCountry()),
                    modelName,
                    engineCapacity,
                    horsePower,
                    price);
    }
}