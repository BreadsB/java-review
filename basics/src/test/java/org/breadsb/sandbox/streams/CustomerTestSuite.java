package org.breadsb.sandbox.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.*;

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

    @Test
    void createListFromDoubleStreamAndRandom() {
        Random random = new Random();
        DoubleStream ds = random.doubles(5);
        List<Double> dl = ds.boxed().toList();
        assertEquals(5, dl.size());
    }

    @Test
    void createListFromStringStream() {
        IntStream stream = "abc".chars();
        Stream<Character> stream1 = "abcd".codePoints().mapToObj(c -> (char) c);
    }

    @Test
    void testSkipMethodInStream() {
        Stream<String> stream = Stream.of("aaa", "bbb", "ccc").skip(1);
        List<String> list = stream.toList();
        assertEquals("bbb", list.get(0));
        assertEquals("ccc", list.get(1));
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> list.get(2));
    }

    @Test
    void testOrderOfStreamExecution() {
//        https://www.baeldung.com/java-8-streams
        //GIVEN
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");

        //WHEN
        List<String> resultList1 = list.stream().skip(2).map(element -> element.toUpperCase()).collect(Collectors.toList());
        List<String> resultList2 = list.stream().map(element -> element.toUpperCase()).skip(1).map(element -> element.substring(1)).collect(Collectors.toList());

        //THEN
        List<String> expectedList1 = Arrays.asList("ABC3");
        List<String> expectedList2 = Arrays.asList("BC2", "BC3");
        Assertions.assertEquals(expectedList1, resultList1);
        Assertions.assertEquals(expectedList2, resultList2);
    }
}