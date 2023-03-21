package org.breadsb.edabit.arrays;

//https://edabit.com/challenge/7fHsizQrTLXsPWMyH

import java.util.Arrays;
import java.util.List;

public class WarOfNumbers {
    public static int warOfNumbers(int[]numbers){
        List<Integer> odds = Arrays.stream(numbers).boxed().filter(a-> (a&1)==0).toList();
        int sumOdds = odds.stream().reduce(0, Integer::sum);
        List<Integer> even = Arrays.stream(numbers).boxed().filter(a-> (a&1)!=0).toList();
        int sumEven = even.stream().reduce(0, Integer::sum);

        if (sumOdds>sumEven) {
            return sumOdds-sumEven;
        } else {
            return sumEven-sumOdds;
        }
    }
}
