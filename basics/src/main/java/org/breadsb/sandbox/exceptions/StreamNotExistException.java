package org.breadsb.sandbox.exceptions;

public class StreamNotExistException extends IllegalStateException {

    public StreamNotExistException(String message, Exception e) {
        super(message, e);
        System.out.println("Exception caught: " + e.getLocalizedMessage());
    }
}
