package org.breadsb.designpatterns.behavioral.state.v2;

public class DispensedState implements CandyVendingMachineState {

    CandyVendingMachine cvm;

    public DispensedState(CandyVendingMachine cvm) {
        this.cvm = cvm;
    }

    @Override
    public void insertCoin() {
        System.out.println("Cant insert coin.");
    }

    @Override
    public void pressButton() {
        System.out.println("Cant press the button.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing...");
        cvm.setState(cvm.getNoCandyState());
    }

    @Override
    public String toString() {
        return "Dispensed State";
    }
}
