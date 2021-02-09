package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question221;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {

        char[][] nums = new char[][] {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        Solution s = new Solution();

        assertEquals(4, s.maximalSquare(nums));
    }
}
