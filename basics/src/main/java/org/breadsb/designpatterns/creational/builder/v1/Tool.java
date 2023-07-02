package org.breadsb.designpatterns.creational.builder.v1;

public class Tool {

    private String name;
    private String manufacturer;
    private double power;
    private boolean hasBattery;

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    @Override
    public String toString() {
        return "Tool: " + name +
                "\nManufacturer: " + manufacturer +
                "\nPower: " + power +
                "\nCordless: " + hasBattery;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPower() {
        return power;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }
}
