package org.breadsb.designpatterns.behavioral.state.v2;

public class NoCandyState implements CandyVendingMachineState {

    CandyVendingMachine cvm;

    public NoCandyState(CandyVendingMachine cvm) {
        this.cvm = cvm;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candies available");
    }

    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }

    @Override
    public void dispense() {
        System.out.println("No candies available");
    }

    @Override
    public String toString() {
        return "No Cady State";
    }
}
