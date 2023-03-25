package org.breadsb.edabit.expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://edabit.com/challenge/3FAMXz4wAYGqpCtDR
public class WordBuckets {

    public static String[] bucketize(String phrase, int n) {
        phrase = phrase.trim();
        String[] s = phrase.split("\\s+");

        List<String> buckets = new ArrayList<>();
        List<String> temporaryBucket = new ArrayList<>();

        for (String word : s) {
            int length = String.join(" ", temporaryBucket).length();
            if (length + word.length() < n) {
                temporaryBucket.add(word);
            } else {
                if (!temporaryBucket.isEmpty()) {
                    buckets.add(String.join(" ", temporaryBucket));
                    temporaryBucket.clear();
                    temporaryBucket.add(word);
                }
            }
        }

        if (!temporaryBucket.isEmpty()) {
            buckets.add(String.join(" ", temporaryBucket));
        }
        return buckets.toArray(new String[0]);
    }
}
