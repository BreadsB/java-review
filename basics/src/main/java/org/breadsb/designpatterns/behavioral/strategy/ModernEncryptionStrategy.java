package org.breadsb.designpatterns.behavioral.strategy;

public class ModernEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encrypt(String text) {
        System.out.println("Encrypt data using modern encryption");
    }
}
