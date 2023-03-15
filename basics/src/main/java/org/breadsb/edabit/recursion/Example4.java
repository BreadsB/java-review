package org.breadsb.edabit.recursion;


//https://edabit.com/challenge/EhX7SGqPTyxQc4pb2
public class Example4 {

//    My solution
//    Need to use another method named as "Helper" where I can pass String
//    There i am able to use recurrence and avoid error while setting first = 0
//    and last = 8
    public static int closingInSum(long num) {
        String s = String.valueOf(num);
        return closingInSumHelper(s);
    }

//    Fancy tip - convert char to int using ASCII
//    int one = s.charAt(0) - '0';

    private static int closingInSumHelper(String s) {

        if (s.length()>1) {
            String first = String.valueOf(s.charAt(0));
            String last = s.substring(s.length()-1);
            int sum = Integer.parseInt(first + last);
            s = s.substring(1, s.length()-1);
            return sum + closingInSumHelper(s);
        } else if (s.length()==1) {
            return Integer.parseInt(String.valueOf(s.charAt(0)));
        } else {
            return 0;
        }
    }
}
