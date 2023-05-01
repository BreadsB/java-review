package org.breadsb.sandbox;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

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
}
