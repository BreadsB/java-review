package org.breadsb.sandbox;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringSandbox {

    private static Delimiter delimiter;
    public enum Delimiter {
        MINUS("-"),
        COMMA(","),
        DOT(".");

        private final String value;

        Delimiter(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

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

    String classString;

    public void checkingStringPool() {

        String localString = "hello";

        System.out.println(classString); // not initialized manually classString, will be automatically initialized as null
        System.out.println(localString); // localString must be initialized manually, otherwise will return error
    }

    public List<String> getTokens(String str, String delim) {

        List<String> tokens = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, delim);
        while (st.hasMoreElements()) {
            tokens.add(st.nextToken());
        }
        return tokens;
    }

    static public String joinTwoStringsUsingJoiner(String s1, String s2, Delimiter delim) {

        String prefix = "Joiner: [";
        String suffix = "]";
        StringJoiner joiner = switch (delim) {
            case MINUS -> new StringJoiner("-", prefix, suffix);
            case COMMA -> new StringJoiner(",", prefix, suffix);
            case DOT -> new StringJoiner(".", prefix, suffix);
        };

        joiner.add(s1).add(s2);
        return joiner.toString();
    }

    static public String secondJoiner(String s1, String s2, Delimiter delim) {
        String prefix = "Joiner: [";
        String suffix = "]";
        StringJoiner joiner = new StringJoiner(delim.getValue(), prefix, suffix);
        joiner.add(s1).add(s2);

        return joiner.toString();
    }

    static public void intAsHexBinary(int num) {

        String hexadecimal = Integer.toHexString(num);
        String binary = Integer.toBinaryString(num);
        String hex = String.format("0x%08X", num);

        System.out.println("{\nint/Decimal: " + num + "\nHexadecimal: " + hexadecimal.toUpperCase() + "\nBinary: " + binary + "\nHex2: " + hex + "\n}");
    }
}
