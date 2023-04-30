package org.breadsb.interface_inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Interface_InheritaceTestSuite {

    @Test
    void testInheritance() {
        Shape circle = new Circle();
        Shape square = new Square();
        List<Shape> shapeList = new ArrayList<Shape>();

        shapeList.add(circle);
        shapeList.add(square);

        for (Shape shape : shapeList) {
            System.out.println(shape.getName());
        }
    }
}
