package org.breadsb.edabit.recursion;

//https://edabit.com/challenge/z5hQaDNPSSqP9bN5t

public class Example3 {

    public static int gcd(int a, int b) {
        if(a>b) {
            if (a%b==0) {
                return b;
            }
            return gcd(b, a%b);
        } else {
            if(b%a==0) {
                return a;
            }
            return gcd(b, b%a);
        }
    }
}
