package org.breadsb.sandbox.exceptions;

public class BlankNameException extends Exception {

    private static String descriptionChanger(String description) {
        StringBuilder sb = new StringBuilder();
        sb.append("BlankNameException: ");
        sb.append(description);
        return sb.toString().toUpperCase();
    }

    public BlankNameException(String description, Throwable cause) {
        super(descriptionChanger(description), cause);
    }

    public BlankNameException(String description) {
        super(descriptionChanger(description));
    }
}