package org.breadsb.sandbox.collections;

import java.util.Collections;
import java.util.Map;

public class MapSandbox {


    /** Create singleton immutable map
     * Very useful when you need configuration settings, constant lookup table or caching some results.
     * Use it also with Testing and Mockito, Providing default values or returning single value
     * */
    public Map<Integer,String> createSingletonMap() {
        return Collections.singletonMap(0, "Config");
    }
}
