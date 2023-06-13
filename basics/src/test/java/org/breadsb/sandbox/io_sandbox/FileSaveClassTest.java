package org.breadsb.sandbox.io_sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FileSaveClassTest {
    List<String[]> list;
    FileSaveClass fileSaveClass;

    @BeforeEach
    void setUp() {
        fileSaveClass = new FileSaveClass();
        list = new ArrayList<>();
        list.add(new String[] { "Adam", "Smith", "40", "Waitress\nComment: Never left Canada" });
        list.add(new String[] { "David", "Brown", "27", "Baker\nComment: Hope one day he will win Powerball" });
        list.add(new String[] { "Anna", "Toeless", "21", "Nurse\nWant to go on a true adventure" });
    }

    @Test
    void givenListOfArrays_whenConvertingElementsToCSV_thenReturnCSVReadyFile() {
        List<String> converted = new ArrayList<>();
        converted = list.stream()
                .map(el -> fileSaveClass.convertToCSV(el))
                .collect(Collectors.toList());

        String expected = "David,Brown,27,Baker Comment: Hope one day he will win Powerball";
        Assertions.assertEquals(3, converted.size());
        Assertions.assertEquals(expected, converted.get(1));
    }

    @Test
    void givenString_whenEscapingSpecialCharacters_thenReturnSimpleString() {
        String given = "Some comments...\nNext line comments...\nQuote: \"Done, here\"";
        String result = fileSaveClass.escapeSpecialCharacters(given);
        String expected = "\"Some comments...\nNext line comments...\nQuote: \"Done, here\"\"";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void givenData_whenConvertToCSV_thenCreateOutputFile() throws IOException {
        File csvOutputFile = File.createTempFile("exampleCSVFile",".csv");
        PrintWriter printWriter = new PrintWriter(csvOutputFile);
        list.stream()
                .map(el -> fileSaveClass.convertToCSV(el))
                .forEach(el -> printWriter.println(el));
        printWriter.close();
        Assertions.assertTrue(csvOutputFile.exists());
    }
}