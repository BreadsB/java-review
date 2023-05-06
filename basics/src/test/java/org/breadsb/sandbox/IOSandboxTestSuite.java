package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class IOSandboxTestSuite {

    IOSandbox ioSandbox = new IOSandbox();

    // How to virtually create a file? Use Mockito to only simulate a created file.

    @Test
    void testCreateNewFile() {
        String s = "CreatingNewTxtFileUsingJava";
        boolean created = ioSandbox.createNewTextFile(s);
        Assertions.assertTrue(created);
    }

    @Test
    void testTryCreateNewFileWhileExists() {
        String s = "CreatingNewTxtFileUsingJava";
        boolean result = ioSandbox.createNewTextFile(s);
        Assertions.assertFalse(result);
    }
}