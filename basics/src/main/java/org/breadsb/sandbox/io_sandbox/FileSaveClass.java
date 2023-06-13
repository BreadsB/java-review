package org.breadsb.sandbox.io_sandbox;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSaveClass {

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public String escapeSpecialCharacters(String text) {
        String escapedText = text.replaceAll("\\R", " ");
        if (text.contains(",") || text.contains("\"") || text.contains("'")) {
            text.replace("\"", "\"\"");
            escapedText = "\"" + text + "\"";
        }
        return escapedText;
    }
}
