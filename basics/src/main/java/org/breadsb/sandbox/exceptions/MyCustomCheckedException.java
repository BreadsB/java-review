package org.breadsb.sandbox.exceptions;

public class MyCustomCheckedException extends Exception {

    public MyCustomCheckedException(String description, Throwable cause) {
        super(description, cause);
    }

}
