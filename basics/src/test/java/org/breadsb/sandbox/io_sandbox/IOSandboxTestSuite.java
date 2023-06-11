package org.breadsb.sandbox.io_sandbox;

import org.breadsb.sandbox.io_sandbox.IOSandbox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOSandboxTestSuite {

    IOSandbox mockIOSandbox = Mockito.mock(IOSandbox.class);
    IOSandbox ioSandbox = new IOSandbox();
    // How to virtually create a file? Use Mockito to only simulate a created file.

    @Test
    void testCreateNewFile() throws IOException {
        String s = "IOFile";
        ioSandbox.createNewTextFile(s);
        Mockito.when(mockIOSandbox.createNewTextFile(s)).thenReturn(true);
        boolean created = mockIOSandbox.createNewTextFile(s);
        Assertions.assertTrue(created);
    }

    @Test
    void testForceExceptionOnCreatingNewFile() {
        String fileName = "IOFile";
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
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        Assertions.assertTrue(file.exists());
    }

    @Test
    void readFromAFile() throws IOException {
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder result = new StringBuilder();
        try {
            String tempTryString;
            while ((tempTryString = br.readLine()) != null) {
                result.append(tempTryString).append("\n");
            }
        } catch (IOException | NullPointerException e) {
            System.out.println(e.getCause().getMessage());
        }
        System.out.println(result);
    }

    @Test
    void moveFileToTestDirectory() {
//        Mockito for a File
        Path file = Paths.get("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        Path targetFile = Paths.get("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        try {
            Files.move(file, targetFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Test
    void moveFileToMainDirectory() {
        Path file = Paths.get("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        Path targetFile = Paths.get("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        try {
            Files.move(file, targetFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Test
    void renameToMethod() {
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isMoved = file.renameTo(new File("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt"));
        Assertions.assertTrue(isMoved);
        File file2 = new File("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isMoved2 = file2.renameTo(new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt"));
        Assertions.assertTrue(isMoved2);
    }

    @Test
    void renameFile() {
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isRenamed = file.renameTo(new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile2.txt"));
        Assertions.assertTrue(isRenamed);
    }

    @Test
    void deleteAFile() {
        IOSandbox ios = new IOSandbox();
        boolean result = ios.deleteFile();
        Assertions.assertTrue(result);
    }

    @Test
    void deleteAFileUsingJDK7() {
        IOSandbox ios = new IOSandbox();
        boolean result = ios.deleteFileJDK7();
        Assertions.assertTrue(result);
    }
}