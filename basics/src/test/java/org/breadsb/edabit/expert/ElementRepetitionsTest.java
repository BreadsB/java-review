package org.breadsb.edabit.expert;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.breadsb.edabit.expert.ElementRepetitions.*;
import static org.junit.jupiter.api.Assertions.*;

class ElementRepetitionsTest {

    static class CompareMaps {
        public static boolean equals(Map<Object, Integer> a, Map<Object, Integer> b) {
            int[] x = a.values().stream().mapToInt(Integer::intValue).toArray(),
                    y = b.values().stream().mapToInt(Integer::intValue).toArray();
            Object[] k = a.keySet().stream().toArray(),
                    l = b.keySet().stream().toArray();
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i] || !k[i].toString().equals(l[i].toString())) return false;
            }
            return true;
        }
    }

    @Test
    void testOne() {
        //GIVEN
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put('E', 3);
        hashMap.put('D', 1);
        hashMap.put('P', 1);
        hashMap.put('X', 1);
        hashMap.put('A', 1);
        hashMap.put('V', 1);
        hashMap.put('I', 1);
        hashMap.put('R', 1);

        Object[] obj = new Object[] {'D', 'E', 'E', 'P', 'X', 'A', 'V', 'I', 'E', 'R'};
        //WHEN
        System.out.println(countRepititions(obj));
        //THEN
    }
}