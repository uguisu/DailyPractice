package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question496;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] nums1 = new int[] {4, 1, 2};
        int[] nums2 = new int[] {1, 3, 4, 2};

        Solution s = new Solution();
        int[] rtn = s.nextGreaterElement(nums1, nums2);

        assertEquals(3, rtn.length);
        assertEquals(-1, rtn[0]);
        assertEquals(3, rtn[1]);
        assertEquals(-1, rtn[2]);
    }
}
