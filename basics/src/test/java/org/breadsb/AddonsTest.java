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
}
