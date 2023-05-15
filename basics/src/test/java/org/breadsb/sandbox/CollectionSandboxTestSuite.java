package org.breadsb.sandbox;

import org.junit.jupiter.api.Assertions;
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
        Collection<Integer> numbers = IntStream.range(0, 10).boxed().toList();
        List<Integer> list = new ArrayList<>(numbers);
        assertEquals(10, list.size());
    }
}
