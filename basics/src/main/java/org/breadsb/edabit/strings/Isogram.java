package org.breadsb.edabit.strings;

public class Isogram {

    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        return word.chars().distinct().count() == word.length();
    }
}
