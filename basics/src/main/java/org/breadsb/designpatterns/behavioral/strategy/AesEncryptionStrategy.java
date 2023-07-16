package org.breadsb.designpatterns.behavioral.strategy;

public class AesEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encrypt(String text) {
        System.out.println("Encrypt data using: " + text);
    }
}
