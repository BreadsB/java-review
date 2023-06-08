package org.breadsb.sandbox.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {

    @Test
    void createStreamFromCollection() {
        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> stream = collection.stream();
        assertNotNull(stream);
    }

    @Test
    void createEmptyStream() {
        Stream<String> stream = Stream.empty();
        assertNotNull(stream);
    }

    @Test
    void createStreamOfArray() {
        String[] arrayString = new String[] {"a", "b", "c"};
        Stream<String> stringStream = Arrays.stream(arrayString);
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        assertNotNull(stringStream);
        assertNotNull(integerStream);
    }

    @Test
    void createStreamUsingBuilder() {
        Stream<String> stream = Stream.<String>builder().add("a").add("b").add("c").build();
        assertNotNull(stream);
    }

    @Test
    void createStreamUsingGenerator() {
        Stream<String> stream = Stream.generate(()->"element").limit(10);
        List<String> list = stream.toList();
        assertEquals(10, list.size());
    }

    @Test
    void createIteratedStream() {
        Stream<Integer> streamInteger = Stream.iterate(10, integer -> integer + 3).limit(5);
        List<Integer> list = streamInteger.toList();
        assertEquals(5, list.size());
        assertEquals(13, list.get(1));
    }

    @Test
    void createListFromLongStream() {
        LongStream longStream = LongStream.rangeClosed(1,5);
        List<Long> list = longStream.boxed().toList();
        assertEquals(5, list.size());
    }
}
