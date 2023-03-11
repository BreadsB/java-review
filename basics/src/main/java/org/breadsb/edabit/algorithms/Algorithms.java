package org.breadsb.edabit.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithms {

    class FindTheDifference {
//        https://edabit.com/challenge/JYaLkHy8cHgCPXAvy
        public static char findTheDifference(String s, String t) {
            long time1 = System.nanoTime();
            List<String> one = new ArrayList<>(List.of(s.split("")));
            one.add("");
            List<String> two = new ArrayList<>(List.of(t.split("")));
            char result = 0;

            for (int i=0; i<two.size(); i++) {
                if (!two.get(i).equals(one.get(i))) {
                    result = two.get(i).charAt(0);
                    break;
                }
            }
            long time2 = System.nanoTime();
            System.out.println(time2-time1);
            return result;
        }

        public static char findTheDifference2(String s, String t) {
            for (String a : s.split("")) {
                t=t.replaceFirst(a,"");
            }
            return t.charAt(0);
        }

        public static char findTheDifference3(String s, String t) {
            List<String> listOne = new ArrayList<>();
            String[] splitedOne = s.split("");
            for (String element : splitedOne) {
                listOne.add(element);
            }
            List<String> listTwo = new ArrayList<>();
            String[] splitedTwo = t.split("");
            for (String element : splitedTwo) {
                listTwo.add(element);
            }
            Collections.sort(listOne);
            Collections.sort(listTwo);
            char result = 0;

            for (int i=0; i<listOne.size(); i++) {
                if (!listTwo.get(i).equals(listOne.get(i))) {
                    result = listTwo.get(i).charAt(0);
                    break;
                }
            }
            if (result==0) {
                result = listTwo.get(listTwo.size()-1).charAt(0);
            }
            return result;
        }
    }
}
