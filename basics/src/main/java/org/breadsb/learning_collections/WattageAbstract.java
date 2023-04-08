package org.breadsb.learning_collections;

public class WattageAbstract {

    abstract class ElectricTool {

        protected int batteryStatus;
        protected int wattUsage;

        public ElectricTool(int wattUsage) {
            this.batteryStatus = 100;
            this.wattUsage = wattUsage;
        }

        protected abstract void use();

        public void loadBattery() {
            this.batteryStatus = 100;
            System.out.println("Battery has been loaded to full");
        }

        public int getBatteryStatus() {
            return batteryStatus;
        }

        public int getWattUsage() {
            return this.wattUsage;
        }
    }

    public class CordlessScrewdriver extends ElectricTool {

        public CordlessScrewdriver(int wattUsage) {
            super(wattUsage);
        }

        @Override
        protected void use() {
            batteryStatus-=wattUsage;
            System.out.println(getClass().getSimpleName() + " has used electricity.");
        }
    }
}
