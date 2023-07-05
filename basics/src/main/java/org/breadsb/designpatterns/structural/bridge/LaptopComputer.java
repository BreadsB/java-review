package org.breadsb.designpatterns.structural.bridge;

public class LaptopComputer implements Computer {

    protected OperationSystem operationSystem;

    public LaptopComputer(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean hasAttachedMonitor() {
        return true;
    }

    @Override
    public boolean hasBuildInKeyBoard() {
        return true;
    }

    @Override
    public boolean hasTouchPad() {
        return true;
    }

    @Override
    public boolean extensionsAvailable() {
        return false;
    }

    @Override
    public void showOperationSystem() {
        System.out.println(operationSystem.getOperationSystem());
    }
}
