package org.breadsb.edabit.recursion;

//https://edabit.com/challenge/99k6HcWYvvbZirkDW
//https://edabit.com/challenge/Ly8iQqDfaouRLgKNb

public class PalindromeRecursion {

    public static boolean isPalindrome(String s) {
        if(s.length()>1 && (s.charAt(0)==s.charAt(s.length()-1))) {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        if (s.length()==1) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String s) {
        return s.length() == 1 || (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome2(s.substring(1, s.length() - 1)));
    }

    public static boolean isPalindrome3(String s) {
        return  s.length()==1 ? true :
                s.charAt(0)==s.charAt(s.length()-1) ?
                        isPalindrome(s.substring(1,s.length()-1)) :
                        false;
    }
}
