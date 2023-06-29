package org.breadsb.designpatterns.builder.v1;

public class ToolBuildExecutor {
    private ToolBuilder toolBuilder;

    public ToolBuildExecutor(ToolBuilder toolBuilder) {
        this.toolBuilder = toolBuilder;
    }

    public Tool produceTool() {
        this.toolBuilder.specifyName();
        this.toolBuilder.specifyManufacturer();
        this.toolBuilder.specifyPower();
        this.toolBuilder.specifyHasBattery();
        return this.toolBuilder.getTool();
    }
}