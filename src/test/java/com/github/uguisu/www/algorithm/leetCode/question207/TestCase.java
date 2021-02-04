package com.github.uguisu.www.algorithm.leetCode.question207;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase {

    @Test
    public void test001() {

        // input
        int[][] prerequisites = new int[][] { {1, 0}, {2, 1}, {3, 1} };

        Solution s = new Solution();

        assertTrue(s.canFinish(4, prerequisites));
    }
}
