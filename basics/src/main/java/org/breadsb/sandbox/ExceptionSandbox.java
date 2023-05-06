package org.breadsb.sandbox;

import java.io.IOException;

public class ExceptionSandbox {

    public static void testThrowIOException() throws Exception {
        IOException ioe = new IOException();
        Exception e = new Exception();
        e.initCause(ioe);

        throw e;
    }
}
