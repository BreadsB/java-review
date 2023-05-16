package org.breadsb.sandbox;

import org.breadsb.sandbox.exceptions.StreamNotExistException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CollectionSandbox {

    public static final void streamIsNotReusable() {
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

    public static List<Integer> reuseStreamUsingSupplier() {
        Supplier<IntStream> supplier = ()->IntStream.of(17, 20, 29, 7);
        List<Integer> list = new ArrayList<>();
        list.add(supplier.get().min().orElse(0));
        list.add(supplier.get().max().orElse(10));
        return list;
    }
}
