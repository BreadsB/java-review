package org.breadsb;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.breadsb.Addons.Strings.convertStringToByteArray;

public class AddonsTest {

    Addons addons = new Addons();

    @Test
    void test1() {
        convertStringToByteArray("Completly new String");
    }

    @Test
    void test2() {
        System.out.println(Arrays.toString(Addons.Numbers.arrayFromInt(1350)));
    }

    @Test
    void testSignum() {
        Addons.Numbers.signum();
    }

    @Test
    void test3() {
        String s = "trzy.txt";
        String ss = s.substring(s.lastIndexOf("."));
        System.out.println(ss);
    }

    @Test
    void generateRandomNumbers() {
        System.out.println(Addons.generateRandomLicenceNumbers(6, 5));
    }
}