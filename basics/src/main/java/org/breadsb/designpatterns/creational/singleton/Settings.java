package org.breadsb.designpatterns.creational.singleton;

public class Settings {
    private static Settings instance = new Settings();
    private double brightness = 1;
    private double contrast = 1;
    private double saturation = 1;
    private double hue = 1;

    private Settings() {
    }

    public static Settings getInstance() {
        return instance;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public double getContrast() {
        return contrast;
    }

    public void setContrast(double contrast) {
        this.contrast = contrast;
    }

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public double getHue() {
        return hue;
    }

    public void setHue(double hue) {
        this.hue = hue;
    }
}