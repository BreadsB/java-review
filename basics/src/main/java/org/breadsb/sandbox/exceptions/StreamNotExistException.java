package org.breadsb.sandbox.exceptions;

public class StreamNotExistException extends IllegalStateException {

    StreamNotExistException(String message) {
        super(message);
    }
}
