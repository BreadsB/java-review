package org.breadsb.designpatterns.structural.bridge;

public class Linux implements OperationSystem {
    @Override
    public String getLicenceNumber() {
        return "PNQA6-9XROD-N8D2Y-EASC7-NDNXD-FIVZ3";
    }

    @Override
    public boolean isLicencePaid() {
        return false;
    }

    @Override
    public String getLastVersion() {
        return "55.123";
    }
}
