package org.breadsb.sandbox.io_sandbox;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.io.*;
import java.net.URI;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class IOSandboxTestSuite {

    IOSandbox mockIOSandbox = Mockito.mock(IOSandbox.class);
    IOSandbox ioSandbox = new IOSandbox();
    // How to virtually create a file? Use Mockito to only simulate a created file.

    @Test
    void createAFileAndCheckIfExists() throws IOException {
        URI uriPath = Path.of("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt").toUri();
        File file = new File(uriPath);
        file.createNewFile();
        Assertions.assertTrue(file.exists());

        // CLEAN
        file.delete();
    }

    @Test
    @Disabled
    void testCreateNewFileUsingMockito() throws IOException {
        String s = "IOFile";
        ioSandbox.createNewTextFile(s);
        Mockito.when(mockIOSandbox.createNewTextFile(s)).thenReturn(true);
        boolean created = mockIOSandbox.createNewTextFile(s);
        Assertions.assertTrue(created);
    }

    @Test
    @Disabled
    void testForceExceptionOnCreatingNewFile() {
        String fileName = "IOFile";
        boolean result = ioSandbox.createNewTextFile(fileName);
        Assertions.assertFalse(result);
//        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()-> {
//            ioSandbox.createNewTextFile(fileName);
//        }, "Name not blank expected");
    }

    @Test
    @Disabled
    void testTryCreateNewFileWhileExists() {
        String s = "CreatingNewTxtFileUsingJava";
        boolean result = ioSandbox.createNewTextFile(s);
        Assertions.assertFalse(result);
    }

    @Test
    @Disabled
    void testCreateNewFileWithEmptyName() throws IOException {
        String s = "";
        boolean fileCreated = ioSandbox.createNewTextFile(s);
        Assertions.assertFalse(fileCreated);
    }

    @Nested
    class MIMETypeCheck {
        @Test
        void checkMimeType() {
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
        void checkMimeTypeUsingGuess() {
            File file = new File("image.png");
            String mimeType = URLConnection.guessContentTypeFromName(file.getName());
            Assertions.assertEquals("image/png", mimeType);
        }

        @Test
        void checkMimeTypeUsingURLConnection() throws IOException {
            File file = new File("product.png");
            URLConnection connection = file.toURI().toURL().openConnection();
            String mimeType = connection.getContentType();

            Assertions.assertEquals("image/png", mimeType);
        }
    }

    @Test
    void readFromAFile() throws IOException {
        File file = new File("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        file.createNewFile();

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder result = new StringBuilder();
        try {
            String tempTryString;
            while ((tempTryString = br.readLine()) != null) {
                result.append(tempTryString).append("\n");
            }
        } catch (IOException | NullPointerException e) {
            System.out.println("No file or no text inside");
        }
        System.out.println(result);
        br.close();
        file.delete();
    }

    @Nested
    class movingFiles {

        boolean isMoved, isCreated;
        static final Path INIT_PATH = Paths.get("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        static final Path TARGET_PATH = Path.of("src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        File file;

        @BeforeEach
        void setUp() {
            isCreated = false;
            isMoved = false;
            file = new File(INIT_PATH.toUri());

            try {
                isCreated = file.createNewFile();
            } catch (IOException e) {
                System.out.println("ERROR --> Cannot create a File --> " + e.getCause());
            }
        }

        @AfterEach
        void cleanAfterTest() {
            file = new File(TARGET_PATH.toUri());
            file.delete();
        }

        @Test
        void moveAFileUsingJDK7() {
            try {
                Files.move(file.toPath(), TARGET_PATH);
                isMoved = true;
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            Assertions.assertTrue(isMoved);
        }

        @Test
        void moveAFileUsing_RenameTo() {
            boolean isMoved = file.renameTo(TARGET_PATH.toFile());
            Assertions.assertTrue(isMoved);
        }

        @Test
        void renameFile() {
            boolean isRenamed = file.renameTo(new File(TARGET_PATH.toUri()));
            Assertions.assertTrue(isRenamed);
        }
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
    void writeTextToFileUsing_FileChannel() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("createdFile.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        byte[] string = "//000//".getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(string.length);
        byteBuffer.put(string);
        byteBuffer.flip();
        randomAccessFile.seek(12);
        channel.write(byteBuffer);
        randomAccessFile.close();
        channel.close();

        RandomAccessFile raf = new RandomAccessFile("createdFile.txt", "r");
        raf.readLine();
        raf.close();
    }

    @Test
    void readLargeLifeEfficiently() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("createdFile.txt"); Scanner scanner = new Scanner(fileInputStream, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            }
            if (scanner.ioException() != null) throw scanner.ioException();
        }
    }

    @Test
    void readLargeFileUsing_SeekableByteChannel() {
        try (SeekableByteChannel sbc = java.nio.file.Files.newByteChannel(Paths.get("createdFile.txt"), StandardOpenOption.READ)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
            while (sbc.read(byteBuffer) > 0) {
                byteBuffer.flip();
                System.out.println(new String(byteBuffer.array()));
                byteBuffer.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}