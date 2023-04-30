package org.breadsb.interface_inheritance;

public class Circle extends Addon implements Shape {

    String parameter = "Circle parameter";

    Circle() {
        printParameter();
        super.printParameter();
    }

    public String getName() {
        return "Circle";
    }

    @Override
    public void printParameter() {
        System.out.println(parameter);
    }

}
