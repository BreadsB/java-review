package org.breadsb.designpatterns.structural.bridge;

public interface OperationSystem {
    String getLicenceNumber();
    boolean isLicencePaid();
    String getLastVersion();

    default String getOperationSystem() {
        return this.getClass().getSimpleName();
    }
}
