package org.breadsb.edabit.strings;

public class Raindrops {

    public String sound(int i) {
        String result = "";

        if (i % 3 == 0) {
            result = result.concat("Pling");
            System.out.println("Got it");
        }
        if (i % 5 == 0) {
            result = result.concat("Plang");
            System.out.println("Got it");
        }
        if (i % 7 == 0) {
            result = result.concat("Plong");
            System.out.println("Got it");
        }
        if (i%3!=0 && i%5!=0 && i%7!=0) {
            result = String.valueOf(i);
        }
        return result;
    }
}