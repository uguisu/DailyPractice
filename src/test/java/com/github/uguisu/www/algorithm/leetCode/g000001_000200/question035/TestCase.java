package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question035;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    @Test
    public void tets001() {
        // input
        int[] in = new int[] {1,3,5,6};

        Solution s = new Solution();

        assertEquals(2, s.searchInsert(in, 5));
    }
}
