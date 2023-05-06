package org.breadsb.sandbox;

import org.junit.jupiter.api.Test;

public class ExceptionSandboxTestSuite {

    @Test
    void testForceToThrowException() throws Exception {
        ExceptionSandbox.testThrowIOException();
    }
}
