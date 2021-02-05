package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question210;

import org.junit.Test;

public class TestCase {

    @Test
    public void test001() {

        // input
        int[][] prerequisites = new int[][] { {1, 0}, {2, 1}, {3, 1} };

        Solution s = new Solution();

        System.out.println(s.findOrder(4, prerequisites));
    }
}
