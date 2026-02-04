package org.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {

    private MergeStringsAlternately mergeStringsAlternately;

    @BeforeEach
    void setUp() {
        mergeStringsAlternately = new MergeStringsAlternately();
    }

    @Test
    void testMergeAlternately_mergesEqualLengthStrings() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";

        assertEquals(expected, mergeStringsAlternately.mergeAlternately(word1, word2));
    }
}
