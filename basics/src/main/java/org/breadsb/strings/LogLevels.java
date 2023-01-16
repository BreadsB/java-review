package org.breadsb.strings;

public class LogLevels {

    public static void main(String[] args) {
//        System.out.println(message("[ERROR]: Invalid operation"));
//        System.out.println(message("[WARNING]:   Disk almost full\r\n"));
//        System.out.println(logLevel("Invalid operation [ERROR]:"));
//        System.out.println(logLevel("[ERROR]: Invalid operation"));
//        System.out.println(reformat("[INFO]: Operation completed)"));
//        System.out.println(reformat("[ERROR]: Invalid operation"));
        System.out.println(reformat("[WARNING]:   Disk almost full\r\n"));
//        System.out.println(reformat("   Disk almost full\r\n [WARNING]:"));
    }

    static String message(String text) {
/*        StringBuilder sb = new StringBuilder(text);
        sb.delete(0, sb.indexOf(":")+1);
        return sb.toString().strip();*/

        // split string on two arrays at "]: " and pick second item of the array, then trim it.
        return text.split("]: ")[1]
                .trim();
    }

    static String logLevel(String text) {
        return text.substring(text.indexOf("[")+1, text.indexOf("]"))
                .toLowerCase();
//        return text.split("]: ")[0]
//                .substring(1)
//                .toLowerCase();
    }

    static String reformat(String text) {
        String edited = text.substring(text.indexOf("[")+1, text.indexOf("]")).toLowerCase();
        String info = text.substring(text.indexOf(":")+1, text.length()-1).strip();
        return info + " (" + edited + ")";
    }
}
