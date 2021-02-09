package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question279;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();
        assertEquals(3, s.numSquares(12));
    }

    @Test
    public void test002() {
        Solution s = new Solution();
        assertEquals(2, s.numSquares(13));
    }
}
