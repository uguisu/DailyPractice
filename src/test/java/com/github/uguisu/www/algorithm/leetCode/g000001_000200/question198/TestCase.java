package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question198;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {1, 2, 3, 1};

        Solution s = new Solution();

        assertEquals(4, s.rob(nums));
    }

    @Test
    public void test002() {
        int[] nums = new int[] {2, 7, 9, 3, 1};

        Solution s = new Solution();

        assertEquals(12, s.rob(nums));
    }
}
