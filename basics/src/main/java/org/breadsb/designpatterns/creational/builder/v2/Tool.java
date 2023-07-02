package org.breadsb.designpatterns.creational.builder.builder.v2;

public class Tool {

    private String name;
    private String manufacturer;

    private boolean isCordless;

    private Tool(ToolBuilder toolBuilder) {
        this.name = toolBuilder.name;
        this.manufacturer = toolBuilder.manufacturer;
        this.isCordless = toolBuilder.isCordless;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isCordless() {
        return isCordless;
    }

    public static class ToolBuilder {

        private String name;
        private String manufacturer;
        private boolean isCordless;

        public ToolBuilder(String name, String manufacturer) {
            this.name = name;
            this.manufacturer = manufacturer;
            this.isCordless = false;
        }

        public ToolBuilder makeCordless() {
            isCordless = true;
            return this;
        }

        public Tool build() {
            return new Tool(this);
        }
    }
}
