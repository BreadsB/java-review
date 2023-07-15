package org.breadsb.designpatterns.behavioral.state.v2;

public class ContainsCoinState implements CandyVendingMachineState {

    CandyVendingMachine machine;

    public ContainsCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("Pressing the button");
        machine.setState(machine.getDispensedState());
    }

    @Override
    public void dispense() {
        System.out.println("Press the button");
    }

    @Override
    public String toString() {
        return "Contains Coin State";
    }
}
