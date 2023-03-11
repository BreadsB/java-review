package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumberTestSuite {

    PhoneNumber phoneNumber = new PhoneNumber();

    @Test
    void cleanPhoneNumber1() {
        //GIVEN
        String number = "+1 (613)-995-0253";

        //WHEN
        String cleanedNumber = phoneNumber.cleanNumber(number);

        //THEN
        String expectedNumber = "6139950253";
        Assertions.assertEquals(cleanedNumber, expectedNumber);
    }

    @Test
    void cleanPhoneNumber2() {
        //GIVEN
        String number = "613-995-0253";

        //WHEN
        String cleanedNumber = phoneNumber.cleanNumber(number);

        //THEN
        String expectedNumber = "6139950253";
        Assertions.assertEquals(cleanedNumber, expectedNumber);
    }

    @Test
    void cleanPhoneNumber3() {
        //GIVEN
        String number = "1 613 995 0253";

        //WHEN
        String cleanedNumber = phoneNumber.cleanNumber(number);

        //THEN
        String expectedNumber = "6139950253";
        Assertions.assertEquals(cleanedNumber, expectedNumber);
    }

    @Test
    void cleanPhoneNumber4() {
        //GIVEN
        String number = "613.995.0253";

        //WHEN
        String cleanedNumber = phoneNumber.cleanNumber(number);

        //THEN
        String expectedNumber = "6139950253";
        Assertions.assertEquals(cleanedNumber, expectedNumber);
    }
}
