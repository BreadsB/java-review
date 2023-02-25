package org.breadsb.strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://edabit.com/challenge/De5e8kdsCFmKvc6w8
public class LongestAlternatingSubstring {

    public static String longestSubstring(String s) {
        long time1 = System.nanoTime();
        String[] splited = s.split("");
        StringBuilder sb = new StringBuilder().append(splited[0]);
        boolean isEven = Integer.parseInt(splited[0])%2==0;
        String longest = "";

        for (int i=1; i<s.length(); i++) {
            if((isEven==(Integer.parseInt(splited[i])%2==0)) || i==(s.length()-1)) {
                if (sb.length()>1) {
                    if(sb.length()>longest.length()) {
                        longest = sb.toString();
                    }
                }
                sb.setLength(0);
            }
            sb.append(splited[i]);
            isEven = Integer.parseInt(splited[i])%2==0;
        }

        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        return longest;
    }

    public static String solution2(String s) {
        long time1 = System.nanoTime();
        String[] splited = s.split("");
        StringBuilder sb = new StringBuilder().append(splited[0]);
        StringBuilder longest = new StringBuilder();
        boolean actualEven, previousEven;

        for(int i=1; i<s.length(); i++) {
            actualEven = Integer.parseInt(splited[i])%2==0;
            previousEven = Integer.parseInt(splited[i-1])%2==0;

            if (actualEven==previousEven) {
                if (sb.length()>1 && sb.length()>longest.length()) {
                    longest.setLength(0);
                    longest.append(sb);
                }
                sb.setLength(0);
            }
            sb.append(splited[i]);
        }

        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        return longest.toString();
    }
}