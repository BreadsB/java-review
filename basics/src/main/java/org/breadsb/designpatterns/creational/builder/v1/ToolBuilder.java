package org.breadsb.designpatterns.creational.builder.v1;

public interface ToolBuilder {

    void specifyName();
    void specifyManufacturer();
    void specifyPower();
    void specifyHasBattery();
    Tool getTool();
}
