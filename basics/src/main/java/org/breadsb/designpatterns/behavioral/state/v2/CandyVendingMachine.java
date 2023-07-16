package org.breadsb.designpatterns.behavioral.state.v2;

public class CandyVendingMachine {
    private CandyVendingMachineState noCoinState;
    private CandyVendingMachineState noCandyState;
    private CandyVendingMachineState dispensedState;
    private CandyVendingMachineState containsCoinState;
    private CandyVendingMachineState actualState;
    private int candiesQuantity;

    public CandyVendingMachine(int candies) {
        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        actualState = noCoinState;
        candiesQuantity = candies;
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

    void refillCandies(int number) {
        candiesQuantity = number;
    }

    public int getCandiesQuantity() {
        return candiesQuantity;
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