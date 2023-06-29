package org.breadsb.designpatterns.builder.v1;

public class ScrewdriverToolBuilder implements ToolBuilder {
    private Tool screwdriver;

    public ScrewdriverToolBuilder() {
        this.screwdriver = new Tool();
    }

    @Override
    public void specifyName() {
        screwdriver.setName("Screwdriver");
    }

    @Override
    public void specifyManufacturer() {
        screwdriver.setManufacturer("Philips");
    }

    @Override
    public void specifyPower() {
        screwdriver.setPower(50.0);
    }

    @Override
    public void specifyHasBattery() {
        screwdriver.setHasBattery(true);
    }

    @Override
    public Tool getTool() {
        return this.screwdriver;
    }
}
