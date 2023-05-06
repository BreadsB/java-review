package org.breadsb.sandbox.exceptions;

public class MyCustomUncheckedException extends RuntimeException {

    public MyCustomUncheckedException(String description, Throwable cause) {
        super(description, cause);
    }
}
