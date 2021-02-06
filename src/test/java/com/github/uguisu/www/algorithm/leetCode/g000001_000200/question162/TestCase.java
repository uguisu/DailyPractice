package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question162;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {1, 2, 3, 1};

        Solution s = new Solution();
        int rtn = s.findPeakElement(nums);
        assertEquals(2, rtn);
    }
}
