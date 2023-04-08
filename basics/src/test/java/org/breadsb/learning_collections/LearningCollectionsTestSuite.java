package org.breadsb.learning_collections;

import org.junit.jupiter.api.Test;

public class LearningCollectionsTestSuite {

    @Test
    void testNonStaticNestedClass() {
        OverloadingMethods overloadingMethods = new OverloadingMethods();
        OverloadingMethods.Generator generator = overloadingMethods.new Generator();
        OverloadingMethods.HighEndGenerator highEndGenerator = overloadingMethods.new HighEndGenerator();

        System.out.println(generator.generate());
        System.out.println(highEndGenerator.generate());
    }

    @Test
    void testWattageAbstractClass() {
        WattageAbstract wattageAbstract = new WattageAbstract();
        WattageAbstract.CordlessScrewdriver cordlessScrewdriver = wattageAbstract.new CordlessScrewdriver(50);
        System.out.println("Actual battery life: " + cordlessScrewdriver.getBatteryStatus());
        cordlessScrewdriver.use();
        System.out.println("Actual battery life: " + cordlessScrewdriver.getBatteryStatus());
        cordlessScrewdriver.use();
        System.out.println("Actual battery life: " + cordlessScrewdriver.getBatteryStatus());
        cordlessScrewdriver.loadBattery();
        System.out.println("Actual battery life: " + cordlessScrewdriver.getBatteryStatus());
    }
}
