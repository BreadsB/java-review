package org.breadsb.sandbox.io_sandbox;

import org.breadsb.sandbox.exceptions.BlankNameException;

import java.io.*;
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
            Path filePath = Path.of("src/main/java/org/breadsb/sandbox/io_sandbox/"+name + ".txt");
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

    void consoleClass() {
        Console console = System.console();
        String input = console.readLine("Tell me your story: \n");
        char[] password = console.readPassword("Password: ");
    }

    public static void main(String[] args) {
        File file = new File("basics/src/main/java/org/breadsb/sandbox/io_sandbox/IOFile.txt");
        System.out.println(file.exists());
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            bw.write(input);
            bw.close();
        } catch (NullPointerException | IOException e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
}