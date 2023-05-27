package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

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
}
