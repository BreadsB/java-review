package org.breadsb.sandbox.io_sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        boolean created = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt").createNewFile();
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
    void renameToMethod() throws IOException {
        boolean isCreated = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt").createNewFile();

        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isMoved = file.renameTo(new File("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt"));
        Assertions.assertTrue(isMoved);

        File fileAtNewPosition = new File("src/test/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isMovedBack = fileAtNewPosition.renameTo(new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt"));
        Assertions.assertTrue(isMovedBack);

        boolean isDeleted = file.delete();
    }

    @Test
    void renameFile() throws IOException {
        boolean created = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt").createNewFile();
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        boolean isRenamed = file.renameTo(new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile2.txt"));
        Assertions.assertTrue(isRenamed);

        //CLEAN
        boolean isDeleted = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile2.txt").delete();
        Assertions.assertTrue(isDeleted);
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

    @Test
    void test() {
        Path path = new File("image.png").toPath();
        String mimeType = null;
        try {
            mimeType = Files.probeContentType(path);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Assertions.assertEquals("image/png", mimeType);
    }

    @Test
    void checkMimeTypeUsingURLConnection() throws IOException {
        File file = new File("product.png");
        URLConnection connection = file.toURI().toURL().openConnection();
        String mimeType = connection.getContentType();

        Assertions.assertEquals("image/png", mimeType);
    }

    @Test
    void checkMimeTypeUsingGuess() {
        File file = new File("image.png");
        String mimeType = URLConnection.guessContentTypeFromName(file.getName());
        Assertions.assertEquals("image/png", mimeType);
    }
}