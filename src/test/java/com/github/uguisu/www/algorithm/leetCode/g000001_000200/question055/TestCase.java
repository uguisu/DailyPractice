package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question055;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {2,3,1,1,4};
        Solution s = new Solution();

        assertTrue(s.canJump(nums));
    }
}
