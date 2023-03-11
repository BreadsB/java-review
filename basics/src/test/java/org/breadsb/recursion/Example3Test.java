package org.breadsb.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Example3Test {

    @Test
    void test1() {
        Assertions.assertEquals(10, Example3.gcd(10,20));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, Example3.gcd(7,5));
        Assertions.assertEquals(1, Example3.gcd(5,7));
    }

    @Test
    void test3() {
        Assertions.assertEquals(12, Example3.gcd(60,36));
        Assertions.assertEquals(12, Example3.gcd(36,60));
    }
}
