package org.breadsb.sandbox.streams;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StreamApiUnitTest {

    private long[] counter = new long[]{0};
    List<String> list;

    private void increaseCounter() {
        counter[0]++;
    }

    @Test
    public void checkOrder_whenChangeQuantityOfMethodCalls_thenCorrect() {
        list = Arrays.asList("abc1", "abc2", "abc3");
        counter[0] = 0;

        long sizeFirst = list.stream()
                .skip(2)
                .map(element -> {
                    increaseCounter();
                    counter[0] = 1;
                    return element;
                })
                .count();

        Assertions.assertEquals(0, counter[0]);
        Assertions.assertEquals(1, sizeFirst);

        counter[0] = 0;
        long sizeSecond = list.stream()
                .takeWhile(element -> element.length() < 4)
                .map(element -> {
                    increaseCounter();
                    return element;
                })
                .skip(2)
                .count();

        Assertions.assertEquals(0, counter[0]);
        Assertions.assertEquals(1, sizeSecond);
    }

    @Test
    void test2() {
        counter = new long[]{0};
        increaseCounter();
        increaseCounter();
        increaseCounter();
        Assertions.assertEquals(3, counter[0]);
        counter[0]++;
        Assertions.assertEquals(4, counter[0]);
        counter[0] += 1;
        Assertions.assertEquals(5, counter[0]);
    }
}
