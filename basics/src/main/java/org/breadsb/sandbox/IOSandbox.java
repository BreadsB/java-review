package org.breadsb.sandbox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOSandbox {

    boolean createNewTextFile(String name) {
        try {
            Path filePath = Path.of(name + ".txt");
            Files.createFile(filePath);
            return true;
        } catch (IOException e) {
            return false;
        } finally {
            System.out.println("Finishing the process");
        }
    }
}
