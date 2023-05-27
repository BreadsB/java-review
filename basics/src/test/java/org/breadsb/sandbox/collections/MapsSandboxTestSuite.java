package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsSandboxTestSuite {

    MapSandbox sandbox = new MapSandbox();

    @Test
    void createSingletonImmutableMap() {
        //GIVEN WHEN
        Map<Integer, String> map = sandbox.createSingletonMap();
        //THEN
        Assertions.assertEquals("Config", map.get(0));
    }

    @Test
    void modifySingletonMap() {
        //GIVEN WHEN
        Map<Integer, String> map = sandbox.createSingletonMap();
        //THEN
        Assertions.assertThrows(UnsupportedOperationException.class, ()-> map.put(5, "error"));
    }

    @Test
    void createMapUsingStream() {
        //GIVEN WHEN
        Map<String, Integer> map = Stream.of(
                new AbstractMap.SimpleEntry<>("first", 1),
                new AbstractMap.SimpleEntry<>("second", 2)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //THEN
        Assertions.assertEquals(1, map.get("first"));
        Assertions.assertEquals(2, map.get("second"));
    }
}
