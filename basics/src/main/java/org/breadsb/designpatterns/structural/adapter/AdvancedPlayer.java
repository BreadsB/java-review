package org.breadsb.designpatterns.structural.adapter;

public class AdvancedPlayer implements VideoInterface {
    private MP3Player adaptee;

    public AdvancedPlayer(MP3Player adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String playVideo() {
        return "Playing video";
    }

    public String playMusic() {
        return adaptee.playMp3();
    }
}
