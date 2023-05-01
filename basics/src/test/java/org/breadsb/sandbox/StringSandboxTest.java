package org.breadsb.sandbox;

import org.junit.jupiter.api.Test;

class StringSandboxTest {

    @Test
    void test1() {
        String s = StringSandbox.decoding("The façade pattern is a software design pattern.", "US-ASCII");
        System.out.println(s);
    }

    @Test
    void testConvertingStringToBinary() {
        String s = StringSandbox.convertToBinary("Hello friend", "US-ASCII");
        System.out.println(s);
    }
}