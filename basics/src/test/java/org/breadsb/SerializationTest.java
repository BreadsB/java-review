package org.breadsb;

import org.breadsb.learning_collections.Chains;
import org.junit.jupiter.api.Test;

import java.io.*;

public class SerializationTest {

    @Test
    void test1() throws IOException {
        Chains chain1 = new Chains("Hey", "Hi", 5, true);
        File myFile = new File("myFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(myFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(chain1); // writing object to myFile.txt
        objectOutputStream.flush(); // empties output stream, all data buffered in that stream will be sent to target output device/file
        objectOutputStream.close(); // closing output stream

        String absoluteFilePath = myFile.getAbsolutePath();
        System.out.println(absoluteFilePath);
    }
}
