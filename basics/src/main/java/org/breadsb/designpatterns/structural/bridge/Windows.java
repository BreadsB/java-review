package org.breadsb.designpatterns.structural.bridge;

public class Windows implements OperationSystem {
    @Override
    public String getLicenceNumber() {
        return "ETR5J-VPZW0-YGZBD-18VJT-NKSH4-IY6Y0";
    }

    @Override
    public boolean isLicencePaid() {
        return true;
    }

    @Override
    public String getLastVersion() {
        return "11.6";
    }
}
