package org.breadsb.learning_collections;

import java.lang.reflect.Constructor;

public class ConstructorChaining {

//    Init block, executed before constructor
    {
        System.out.println("Hello, this is init block");
    }

    private String s;

    ConstructorChaining() {
        this.s = "default";
    }

    ConstructorChaining(String text) {
        this.s = text;
    }

    protected String getText() {
        return s;
    }

    public static void main(String[] args) {
        ConstructorChaining c_Ch1 = new ConstructorChaining();
        System.out.println(c_Ch1.getText());
        ConstructorChaining c_Ch2 = new ConstructorChaining("Text sample");
        System.out.println(c_Ch2.getText());
    }
}
