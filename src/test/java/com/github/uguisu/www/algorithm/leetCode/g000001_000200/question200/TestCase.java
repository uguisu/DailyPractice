package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        char[][] grid = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        Solution s = new Solution();

        assertEquals(1, s.numIslands(grid));
    }
}
