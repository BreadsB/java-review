package org.breadsb.learning_collections;

class First {
    protected String status;

    public First() {
        this.status = "First status";
        System.out.println("Created first");
    }

    public void getStatus() {
        System.out.println(status);
    }

    public String retrieveInfo() {
        return "Info from first";
    }
}

class Second extends First {
    private String status;
    public Second() {
        this.status = "Second status";
        System.out.println("Created second");
    }

    public void getStatus() {
        System.out.println(this.status);
    }

    public void getSuperStatus() {
        System.out.println(super.status);
    }

    public String retrieveInfo() {
        return "Info from second";
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        First a1 = new First();
        First a2 = new Second();
    }
}