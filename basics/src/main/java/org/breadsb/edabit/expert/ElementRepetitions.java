package org.breadsb.edabit.expert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://edabit.com/challenge/Sj2kws46RQfxdv6Wj
//https://www.baeldung.com/java-groupingby-count
//https://stackoverflow.com/questions/30451284/counting-elements-of-a-stream

public class ElementRepetitions {
    public static Map<Object, Integer> countRepititions(Object[] e) {
        Stream<Object> stream = Arrays.stream(e);
        Map<Object, Integer> map = stream.collect(Collectors.groupingBy(n->n, Collectors.summingInt(s->1)));

        List<Map.Entry<Object, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        Map<Object, Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<Object, Integer> element : list) {
            linkedMap.put(element.getKey(), element.getValue());
        }

        return linkedMap;
    }
}
