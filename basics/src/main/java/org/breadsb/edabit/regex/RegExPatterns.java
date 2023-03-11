package org.breadsb.edabit.regex;

public enum RegExPatterns {

    POSITION_ON_CHARACTER_CHANGE("(?<=(.))(?!\\1)"),
    SPLIT_BETWEEN_A_W("(?<=a)(?=w)");

    private String regex;

    RegExPatterns(String s) {
        this.regex = s;
    }

    public String getRegex() {
        return regex;
    }
}
