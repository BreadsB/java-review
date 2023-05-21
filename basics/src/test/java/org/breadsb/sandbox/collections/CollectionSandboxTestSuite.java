package org.breadsb.sandbox.collections;

import org.breadsb.sandbox.collections.CollectionSandbox;
import org.breadsb.sandbox.collections.User;
import org.breadsb.sandbox.exceptions.StreamNotExistException;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionSandboxTestSuite {

    @Test
    void testCreateFixedArraylist() {
//        Create fixed size arrayList
        List<Integer> integerList = new ArrayList<>(10);
        for(int i=0; i<11; i++) {
            integerList.add(i);
        }
        assertEquals(11, integerList.size());
    }

    @Test
    void testAddIntStreamToList() {
//        Add IntStream to List
        Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>(numbers);
        assertEquals(10, list.size());
    }

    @Test
    void testCreateListWithIntStream() {
        List<Integer> list = new ArrayList<>(
                IntStream.rangeClosed(4,10).boxed().collect(Collectors.toList())
        );
        assertEquals(7, list.size());
    }

    @Test
    void testStreamIsNotReusable() {
        assertThrows(StreamNotExistException.class, () -> {
           CollectionSandbox.streamIsNotReusable();
        });
    }

    @Test
    void testReuseStreamUsingSupplier() {
        Collection<Integer> intStream = IntStream.of(7, 29).boxed().collect(Collectors.toList());
        List<Integer> expected = new ArrayList<Integer>(intStream);
        assertEquals(expected, CollectionSandbox.reuseStreamUsingSupplier());
    }

    @Test
    void testCollectingAndThen() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(5, 9, 11));
        List<Integer> list = CollectionSandbox.creatingUnmodifiableList();
        assertEquals(expected, list);
    }

    @Test
    void testCompareUsers() {
        User user1 = new User("James", "Cameron", 47.3);
        User user2 = new User("Ron", "Highway", 17.8, 352.14);

        assertEquals(-1, user1.compareTo(user2));
    }
}