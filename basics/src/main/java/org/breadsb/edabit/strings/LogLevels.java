package org.breadsb.edabit.strings;

public class LogLevels {

    public static void main(String[] args) {
        System.out.println(reformat("[WARNING]:   Disk almost full\r\n"));
    }

    static String message(String text) {
        return text.split("]: ")[1]
                .trim();
    }

    static String logLevel(String text) {
        return text.substring(text.indexOf("[")+1, text.indexOf("]"))
                .toLowerCase();
    }

    static String reformat(String text) {
        String edited = text.substring(text.indexOf("[")+1, text.indexOf("]")).toLowerCase();
        String info = text.substring(text.indexOf(":")+1, text.length()-1).strip();
        return info + " (" + edited + ")";
    }
}
