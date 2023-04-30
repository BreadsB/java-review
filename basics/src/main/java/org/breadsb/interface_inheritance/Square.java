package org.breadsb.interface_inheritance;

public class Square extends Addon implements Shape {

    public String getName() {
        return "Square";
    }

    public String showMessage(String s) {
        return "My message is: " + s;
    }

    public String showMessage(String s1, String s2) {
        return "My message is: " + s1 + ", with addition: " + s2;
    }

    public String showMessage(int s) {
        return "My message was viewed: " + s + " times";
    }
}
