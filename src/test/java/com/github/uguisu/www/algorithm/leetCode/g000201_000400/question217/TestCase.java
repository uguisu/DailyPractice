package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question217;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {1, 2, 3, 1};

        Solution s = new Solution();

        assertTrue(s.containsDuplicate(nums));
    }
}
