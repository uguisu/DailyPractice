package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question062;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();

        assertEquals(3, s.uniquePaths(3, 2));
    }

    @Test
    public void test002() {
        Solution s = new Solution();

        assertEquals(193536720, s.uniquePaths(23, 12));
    }
}
