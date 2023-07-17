package org.breadsb.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;

public class TemplatePatternTest {
    @Test
    void test() {
        Packing giftbox = new GiftBox();
        giftbox.pack();
    }
}
