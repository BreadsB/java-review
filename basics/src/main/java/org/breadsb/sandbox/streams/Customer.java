package org.breadsb.sandbox.streams;

import java.util.List;

public class Customer {

    private final int id;
    private String name;
    private double funds;

    public Customer(int id, String name, double funds) {
        this.id = id;
        this.name = name;
        this.funds = funds;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return this.funds;
    }

    public void addFunds(double funds) {
        this.funds += funds;
    }

    public void removeFunds(double fundsToRemove) {
        this.funds = (getFunds()>=fundsToRemove) ? getFunds()-fundsToRemove : getFunds();
    }
}
