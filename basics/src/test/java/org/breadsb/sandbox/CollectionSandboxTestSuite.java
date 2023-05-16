package org.breadsb.sandbox;

import org.breadsb.sandbox.exceptions.StreamNotExistException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    void testCollectingAndThen() {

    }
}