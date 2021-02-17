package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question300;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test0001() {
        int[] nums = new int[] {10,9,2,5,3,7,101,18};
        Solution s = new Solution();

        assertEquals(4, s.lengthOfLIS(nums));
    }
}
