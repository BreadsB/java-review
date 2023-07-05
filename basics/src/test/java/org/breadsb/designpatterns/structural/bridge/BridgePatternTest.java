package org.breadsb.designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

public class BridgePatternTest {

    @Test
    void test() {
        Windows windows = new Windows();
        DekstopComputer computer = new DekstopComputer(windows);
        computer.showLicence();
        OperationSystem macOS = new MacOS();
        Computer laptopComputer = new LaptopComputer(macOS);
        laptopComputer.showOperationSystem();
    }
}
