package org.breadsb.designpatterns.creational.builder.v2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToolBuilderTestSuite {

    @Test
    void createNewToolUsingInnerToolBuilder() {
        Tool screwDriver = new Tool.ToolBuilder("Cordless Screwdriver", "Makita").makeCordless().build();
        Assertions.assertEquals("Makita", screwDriver.getManufacturer());
    }
}
