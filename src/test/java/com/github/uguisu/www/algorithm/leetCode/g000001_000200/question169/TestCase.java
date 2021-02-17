package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {3, 2, 3};

        Solution s = new Solution();

        assertEquals(3, s.majorityElement(nums));
    }

    @Test
    public void test002() {
        int[] nums = new int[] {2, 3, 3};

        Solution s = new Solution();

        assertEquals(3, s.majorityElement(nums));
    }
}
