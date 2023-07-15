package org.breadsb.designpatterns.behavioral.state.v2;

public class CandyVendingMachine {
    CandyVendingMachineState noCoinState;
    CandyVendingMachineState noCandyState;
    CandyVendingMachineState dispensedState;
    CandyVendingMachineState containsCoinState;
    CandyVendingMachineState actualState;

    public CandyVendingMachine() {
        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        actualState = noCoinState;
    }

    void insertCoin() {
        actualState.insertCoin();
    }

    void pressButton() {
        actualState.pressButton();
        actualState.dispense();
    }

    CandyVendingMachineState getState() {
        return actualState;
    }

    void setState(CandyVendingMachineState cvms) {
        actualState = cvms;
    }

    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }

    public CandyVendingMachineState getDispensedState() {
        return dispensedState;
    }

    public CandyVendingMachineState getContainsCoinState() {
        return containsCoinState;
    }

    public CandyVendingMachineState getActualState() {
        return actualState;
    }

    @Override
    public String toString() {
        return "Actual Candy Vending Machine state: " + actualState;
    }
}