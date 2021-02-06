package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question074;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase {

    @Test
    public void test001() {
        int[][] matrix = new int[][] { {1,3,5,7},{10,11,16,20},{23,30,34,60} };
        Solution s = new Solution();

        assertTrue(s.searchMatrix(matrix, 3));
    }
}
