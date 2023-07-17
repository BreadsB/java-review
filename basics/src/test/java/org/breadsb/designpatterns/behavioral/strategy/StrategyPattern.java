package org.breadsb.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyPattern {
    @Test
    void test() {
        EncryptionStrategy modernStrategy = new ModernEncryptionStrategy();
        Encryptor encryptor = new Encryptor(modernStrategy);
        encryptor.setPlainText("Yeeeeez");
        encryptor.encrypt();
    }
}