package org.breadsb.sandbox;

import org.breadsb.sandbox.exceptions.StreamNotExistException;

import java.util.stream.LongStream;

public class CollectionSandbox {

    public static void streamIsNotReusable() {
        try {
            LongStream ls = LongStream.of(1L, 2L, 3L);
            System.out.println(ls.min());
            System.out.println(ls.max());
        } catch (IllegalStateException e) {
            throw new StreamNotExistException("Stream was already closed", e);
        } finally {
            System.out.println("Closing process");
        }
    }
}
