package org.breadsb.learning_collections;

import com.sun.net.httpserver.Filter;

public class Chains {

    String attribute1;
    String attribute2;
    int attribute3;
    boolean attribute4;

    public Chains(String inputAttribute1,
                  String inputAttribute2,
                  int inputAttribute3,
                  boolean inputAttribute4) {
        this.attribute1 = inputAttribute1;
        this.attribute2 = inputAttribute2;
        this.attribute3 = inputAttribute3;
        this.attribute4 = inputAttribute4;
    }

    public Chains() {
        this("Default1", "Default2", 0, false);
        System.out.println("Object created without parameters in constructor");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "-{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3=" + attribute3 +
                ", attribute4=" + attribute4 +
                '}';
    }

    public static void main(String[] args) {
        Chains chains = new Chains();
        System.out.println(chains);
        Chains chains2 = new Chains("Sample1", "Sample2", 1, true);
        System.out.println(chains2);
    }
}
