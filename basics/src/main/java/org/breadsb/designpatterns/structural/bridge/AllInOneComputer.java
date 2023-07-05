package org.breadsb.designpatterns.structural.bridge;

public class AllInOneComputer implements Computer {

    protected OperationSystem operationSystem;

    public AllInOneComputer(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean hasAttachedMonitor() {
        return true;
    }

    @Override
    public boolean hasBuildInKeyBoard() {
        return false;
    }

    @Override
    public boolean hasTouchPad() {
        return false;
    }

    @Override
    public boolean extensionsAvailable() {
        return true;
    }

    @Override
    public void showOperationSystem() {
        System.out.println(operationSystem.getOperationSystem());
    }
}
