package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question053;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        Solution s = new Solution();

        assertEquals(6, s.maxSubArray(nums));
    }
}
