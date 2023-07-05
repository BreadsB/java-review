package org.breadsb.designpatterns.structural.bridge;

public interface Computer {

    boolean hasAttachedMonitor();
    boolean hasBuildInKeyBoard();
    boolean hasTouchPad();
    boolean extensionsAvailable();
    void showOperationSystem();
}
