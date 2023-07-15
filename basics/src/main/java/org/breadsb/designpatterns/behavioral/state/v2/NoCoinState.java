package org.breadsb.designpatterns.behavioral.state.v2;

public class NoCoinState implements CandyVendingMachineState {

    CandyVendingMachine cvm;

    public NoCoinState(CandyVendingMachine candyVendingMachine) {
        cvm = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Inserting coin...");
        cvm.setState(cvm.getContainsCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inside");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inside");
    }

    @Override
    public String toString() {
        return "No Coin state";
    }
}
