package org.breadsb.learning_collections;

public class OverloadingMethods {

    private static int fuel = 300;
    private int electricity = 300;

    public class Generator {

        private int power = 1000;

        public String generate() {
            return "Generator generates: "+ power +"MJ";
        }
    }

    public class HighEndGenerator extends Generator {

        private int power = 5000;

        @Override
        public String generate() {
            return "High-end generator generates: " + power + "MJ, while normal generator generates: " + super.power + "MJ";
        }
    }

    public static class LowEndGenerator {
        public String inform() {
            return "Fuel left: " + fuel + ", static inner class cannot access non static field -> electricity ";
        }
    }

    public static void main(String[] args) {
//        Generator generator = new Generator();
    }
}
