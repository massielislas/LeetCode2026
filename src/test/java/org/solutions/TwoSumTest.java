package org.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void testTwoSum_returnsCorrectIndices() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}
