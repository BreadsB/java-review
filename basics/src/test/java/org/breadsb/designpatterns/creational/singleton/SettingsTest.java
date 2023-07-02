package org.breadsb.designpatterns.creational.singleton;

import org.breadsb.designpatterns.creational.singleton.Settings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SettingsTest {

    @Test
    void checkIfThereIsOnlyOneInstanceOfSettingsClass() {
        Settings settings = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        settings.setBrightness(0.5);
        settings2.setBrightness(0.7);

        Assertions.assertEquals(0.7, settings.getBrightness());
        Assertions.assertEquals(0.7, settings2.getBrightness());
    }
}