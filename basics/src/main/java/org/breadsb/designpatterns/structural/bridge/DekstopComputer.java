package org.breadsb.designpatterns.structural.bridge;

public class DekstopComputer implements Computer {

    protected OperationSystem operationSystem;

    public DekstopComputer(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean hasAttachedMonitor() {
        return false;
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

    public void showLicence() {
        System.out.println(operationSystem.getLicenceNumber());
    }
}
