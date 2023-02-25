package org.breadsb.strings;

// https://edabit.com/challenge/QwGgDuvWtFmDTeRHw

import java.util.ArrayList;
import java.util.List;

public class AddTwoStringNumbers {



    public static String addStrNums(String num1, String num2) {
        long time1 = System.nanoTime();
        int convertedNum1, convertedNum2;
        String result;

        if(num1.isBlank()) {
            num1="0";
        }

        if(num2.isBlank()) {
            num2="0";
        }

        if(num1.matches("\\d") && num2.matches("\\d")){
            convertedNum1 = Integer.parseInt(num1);
            convertedNum2 = Integer.parseInt(num2);
            result = String.valueOf(convertedNum1+convertedNum2);
        } else {
            result = "-1";
        }

        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        return result;
    }

    public static String addStrNumsMethodTwo(String num1, String num2) {
        long time1 = System.nanoTime();

        List<String> list = new ArrayList<String>(List.of(num1, num2));
        List<Integer> listConverted = new ArrayList<>();
        int sum;
        list.stream()
                .forEach(i-> {
                    if (i.isBlank()) {
                        i="0";
                    }
                    if (i.matches("\\d")) {
                        listConverted.add(Integer.parseInt(i));
                    } else {
                        listConverted.add(-1);
                    }
                });

        if (listConverted.contains(-1)) {
            sum = -1;
        } else {
            sum = listConverted.stream().reduce(0, Integer::sum);
        }

        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        return String.valueOf(sum);
    }
}
