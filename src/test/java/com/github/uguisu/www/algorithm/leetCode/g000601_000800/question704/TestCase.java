package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question704;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {

        // input
        int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
        int target = 9;

        Solution s = new Solution();
        assertEquals(4, s.search(nums, target));

    }
}
