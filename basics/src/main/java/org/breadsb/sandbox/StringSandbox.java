package org.breadsb.sandbox;

import java.io.*;
import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringSandbox {

    static String decoding(String input, String encoding) {

        String s = "";

        try {
            s = new BufferedReader(
                    new InputStreamReader(
                            new ByteArrayInputStream(input.getBytes()),
                            Charset.forName(encoding)
                    )
            ).readLine();
        } catch (IOException e) {
            s = "Error IOException";
        }
        return s;
    }

    static String convertToBinary(String input, String encoding) {

        String s = "";
        byte[] encodedInput = Charset.forName(encoding)
                .encode(input)
                .array();
        s = IntStream.range(0, encodedInput.length)
                .map(i -> encodedInput[i])
                .mapToObj(e -> Integer.toBinaryString(e ^255))
                .map(e -> String.format("%1$" + Byte.SIZE + "s", e).replace(" ", "0"))
                .collect(Collectors.joining(" "));

        return s;
    }
}
