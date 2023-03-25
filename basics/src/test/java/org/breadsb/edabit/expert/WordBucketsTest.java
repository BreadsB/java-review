package org.breadsb.edabit.expert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WordBucketsTest {

    @Test
    void test1() {
        assertArrayEquals(new String[]{"she sells", "sea shells", "by the sea"}, WordBuckets.bucketize("she sells sea shells by the sea", 10));
        assertArrayEquals(new String[]{"the", "mouse", "jumped", "over", "the", "cheese"}, WordBuckets.bucketize("the mouse jumped over the cheese", 7));
        assertArrayEquals(new String[]{"fairy dust coated", "the air"}, WordBuckets.bucketize("fairy dust coated the air", 20));
        assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, WordBuckets.bucketize("a b c d e", 2));
        assertArrayEquals(new String[]{}, WordBuckets.bucketize("ab bc cd", 1));
        assertArrayEquals(new String[]{"do the", "hokey", "pokey"}, WordBuckets.bucketize("do the hokey pokey", 6));
        assertArrayEquals(new String[]{"do the hokey", "pokey"}, WordBuckets.bucketize("do the hokey pokey", 12));
        assertArrayEquals(new String[]{"rich", "magnificent", "trees dotted", "the", "landscape"}, WordBuckets.bucketize("rich magnificent trees dotted the landscape", 12));
    }
}
