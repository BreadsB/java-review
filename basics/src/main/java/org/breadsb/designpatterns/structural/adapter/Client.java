package org.breadsb.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        MP3Player adaptee = new MP3Player();
        AdvancedPlayer adapter = new AdvancedPlayer(adaptee);
        System.out.println(adapter.playVideo());
        System.out.println(adapter.playMusic());
    }
}
