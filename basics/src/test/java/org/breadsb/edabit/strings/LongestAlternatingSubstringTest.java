package org.breadsb.edabit.strings;

import org.breadsb.edabit.strings.LongestAlternatingSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestAlternatingSubstringTest {

    @Test
    void testOne() {
//        GIVEN
        String s1 = "225424272163254474441338664823";
        String s2 = "594127169973391692147228678476";
        String s3 = "721449827599186159274227324466";

//        WHEN
        String result = LongestAlternatingSubstring.longestSubstring(s1);
        String result2 = LongestAlternatingSubstring.solution2(s2);
        String result3 = LongestAlternatingSubstring.longestSubstring(s3);

//        THEN
        String expected1 = "272163254";
        String expected2 = "16921472";
        String expected3 = "7214";
        Assertions.assertEquals(result, expected1);
        Assertions.assertEquals(result2, expected2);
        Assertions.assertEquals(result3, expected3);
    }
}
