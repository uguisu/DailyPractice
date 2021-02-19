package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question215;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {3,2,1,5,6,4};

        Solution s = new Solution();

        assertEquals(5, s.findKthLargest(nums, 2));
    }

    @Test
    public void test002() {
        int[] nums = new int[] {3,2,3,1,2,4,5,5,6};

        Solution s = new Solution();

        assertEquals(4, s.findKthLargest(nums, 4));
    }
}
