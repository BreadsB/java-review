package org.breadsb.edabit.strings;

// https://edabit.com/challenge/QwGgDuvWtFmDTeRHw

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddTwoStringNumbers {

    public static String addStrNums(String num1, String num2) {

        long time1 = System.nanoTime();
        BigInteger convertedNum1, convertedNum2;
        String result;

        if(num1.isBlank()) {
            num1="0";
        }

        if(num2.isBlank()) {
            num2="0";
        }

        if(num1.matches("[0-9]+") && num2.matches("[0-9]+")){
            convertedNum1 = new BigInteger(num1);
            convertedNum2 = new BigInteger(num2);
            result = String.valueOf(convertedNum1.add(convertedNum2));
        } else {
            result = "-1";
        }

        long time2 = System.nanoTime();
        System.out.println("Method with simple if: "+(time2-time1));
        return result;
    }

    public static String addStrNumsMethodTwo(String num1, String num2) {

        long time1 = System.nanoTime();
        List<String> list = new ArrayList<String>(List.of(num1, num2));
        List<BigInteger> listConverted = new ArrayList<>();
        BigInteger sum;

        list.stream()
                .forEach(i-> {
                    if (i.isBlank()) {
                        i="0";
                    }
                    if (i.matches("\\d+")) {
                        listConverted.add(new BigInteger(i));
                    } else {
                        listConverted.add(new BigInteger(String.valueOf(-1)));
                    }
                });

        if (listConverted.contains(BigInteger.valueOf(-1))) {
            sum = BigInteger.valueOf(-1);
        } else {
            sum = listConverted.stream().reduce(BigInteger.valueOf(0), BigInteger::add);
        }

        long time2 = System.nanoTime();
        System.out.println("Method with list and streams: " + (time2 - time1));
        return String.valueOf(sum);
    }
}
