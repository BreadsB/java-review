package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class IOSandboxTestSuite {

    IOSandbox ioSandbox = Mockito.mock(IOSandbox.class);

    // How to virtually create a file? Use Mockito to only simulate a created file.

    @Test
    void testCreateNewFile() {
        String s = "CreatingNewTxtFileUsingJava";
        Mockito.when(ioSandbox.createNewTextFile(s)).thenReturn(true);
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