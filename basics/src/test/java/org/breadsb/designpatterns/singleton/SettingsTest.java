package org.breadsb.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SettingsTest {

    @Test
    void testSettings() {
        Settings settings = Settings.getInstance();
        settings.setBrightness(0.5);
        Assertions.assertEquals(0.5, settings.getBrightness());
    }
}