package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;
import java.util.Scanner;

public class IOSandboxTestSuite {

    IOSandbox mockIOSandbox = Mockito.mock(IOSandbox.class);
    IOSandbox ioSandbox = new IOSandbox();
    // How to virtually create a file? Use Mockito to only simulate a created file.

    @Test
    void testCreateNewFile() throws IOException {
        String s = "CreatingNewTxtFileUsingJava";
        Mockito.when(mockIOSandbox.createNewTextFile(s)).thenReturn(true);
        boolean created = mockIOSandbox.createNewTextFile(s);
        Assertions.assertTrue(created);
    }

    @Test
    void testForceExceptionOnCreatingNewFile() {
        String fileName = " ";
        boolean result = ioSandbox.createNewTextFile(fileName);
        Assertions.assertFalse(result);
//        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()-> {
//            ioSandbox.createNewTextFile(fileName);
//        }, "Name not blank expected");
    }

    @Test
    void testTryCreateNewFileWhileExists() {
        String s = "CreatingNewTxtFileUsingJava";
        boolean result = ioSandbox.createNewTextFile(s);
        Assertions.assertFalse(result);
    }

    @Test
    void testCreateNewFileWithEmptyName() throws IOException {
        String s = "";
        boolean fileCreated = ioSandbox.createNewTextFile(s);
        Assertions.assertFalse(fileCreated);
    }

    private String readFromFile(InputStream inputstream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }

    @Test
    void checkIfFileExists() {
        File file = new File("E:\\IntelliJ_Projects\\java-review\\basics\\myFile.txt");
        Assertions.assertTrue(file.exists());
    }
}