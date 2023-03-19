package org.breadsb.mychallenges;

public class EvenOrOddChallenge {
//    Find the best method to check if number is odd or even

    public static void main(String[] args) {
    }

    public static boolean approach1(String n) {
        return Integer.parseInt(n)%2==0;
    }

    public static boolean approach2(String s) {
        return (Integer.parseInt(s) & 1) == 0;
    }
}
