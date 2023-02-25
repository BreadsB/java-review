package org.breadsb.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    class FindTheDifference {
//        https://edabit.com/challenge/JYaLkHy8cHgCPXAvy
        public static char findTheDifference(String s, String t) {
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
            return result;
        }
    }

    class RearrangeTheSentence {
//        https://edabit.com/challenge/FPemghc8ut9xfaMGo

        public static String rearrange(String s) {
            return "Done";
        }
    }

}
