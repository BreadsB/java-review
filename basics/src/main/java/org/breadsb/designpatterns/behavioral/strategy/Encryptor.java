package org.breadsb.designpatterns.behavioral.strategy;

public class Encryptor {
    private EncryptionStrategy strategy;
    private String text;
    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        strategy.encrypt(text);
    }

    public void setPlainText(String plainText) {
        text = plainText;
    }
}
