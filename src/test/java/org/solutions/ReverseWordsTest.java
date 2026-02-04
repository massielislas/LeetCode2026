package org.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    private ReverseWords reverseWords;

    @BeforeEach
    void setUp() {
        reverseWords = new ReverseWords();
    }

    @Test
    void testReverseWords_reversesWordOrder() {
        String input = "the sky is blue";
        String expected = "blue is sky the";

        assertEquals(expected, reverseWords.reverseWords(input));
    }
}
