package org.breadsb.designpatterns.structural.bridge;

public class MacOS implements OperationSystem {
    @Override
    public String getLicenceNumber() {
        return "TYD84-0K8IS-MDS7K-9ULZT-O3IRM-Z5V9V";
    }

    @Override
    public boolean isLicencePaid() {
        return true;
    }

    @Override
    public String getLastVersion() {
        return "14.5.3";
    }
}
