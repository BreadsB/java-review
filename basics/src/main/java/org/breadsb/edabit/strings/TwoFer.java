package org.breadsb.edabit.strings;

public class TwoFer {

    static String twoFer(String name) {
            if (name.isEmpty()) {
                return "One for you, one for me";
            } else {
                return String.format("One for %s, one for me", name);
            }
    }
}