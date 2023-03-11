package org.breadsb.edabit.strings;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    public String cleanNumber(String phoneNumber) {

        List<String> numbers = new ArrayList<>(List.of(phoneNumber.trim().split("\\s|\\D|\\b1")));
        String convertedNumber = makeStringFromArrayList(numbers);

        System.out.println(convertedNumber);
        return convertedNumber.toString();
    }

    private String makeStringFromArrayList(List<String> aL) {

        StringBuilder sb = new StringBuilder();

        for (String element : aL) {
            if (!(element.equals(""))) {
                sb.append(element);
            }
        }
        return sb.toString();
    }
}
