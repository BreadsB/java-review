package org.breadsb.sandbox;

import org.breadsb.sandbox.exceptions.BlankNameException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Scanner;

public class IOSandbox {

//    Create new txt file in java-review/basics/src/
//    What if there's blank file name as input?
//    What if file already exists?

    boolean createNewTextFile(String name) {
        try {
            System.out.println("Starting process of creating a File.");
            checkNameNotBlank(name);
            Path filePath = Path.of(name + ".txt");
            Files.createFile(filePath);
            System.out.println("Process finished.");
            return true;
        } catch (IOException | BlankNameException e) {
            System.out.println("Catched an Exception: " + e.getCause() + "\nException message: \"" + e.getMessage() + "\"");
            return false;
        }
    }

    private static void checkNameNotBlank(String name) throws BlankNameException {
        if (name.isBlank()) {
            throw new BlankNameException("file name is blank!");
        }
    }

    public static void main(String[] args) {
    }

    void readUsingScanner() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("User name: " + name + ", age: " + age + ", height: " + height + "cm");
    }

    void readInputFromConsoleUsingBuffer() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}