package org.breadsb.sandbox;

import org.junit.jupiter.api.Test;

public class ExceptionSandboxTestSuite {

    @Test
    void testForceToThrowException() throws Exception {

        try {
            ExceptionSandbox.testThrowIOException();
        } catch (Throwable e) {
            System.out.println("Cause: " + e.getCause());
        }
    }

}
