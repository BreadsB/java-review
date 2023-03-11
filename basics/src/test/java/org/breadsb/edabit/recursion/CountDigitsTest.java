package org.breadsb.edabit.recursion;

import org.junit.jupiter.api.Test;

public class CountDigitsTest {

    @Test
    void test1() {
        System.out.println(CountDigits.count3(2753));
        System.out.println(CountDigits.count3(27539));
        System.out.println(CountDigits.count3(100));
        System.out.println(CountDigits.count3(100000));
        System.out.println(CountDigits.count3(0));
        System.out.println(CountDigits.count3(-92563));
    }
}
