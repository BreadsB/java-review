package org.breadsb.edabit.strings;

import java.util.Random;
import java.util.stream.Collectors;

public interface RandomThings {

    Random random = new Random();

    default String randomString(char start, char end, int length) {

        return random.ints(start, end)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
