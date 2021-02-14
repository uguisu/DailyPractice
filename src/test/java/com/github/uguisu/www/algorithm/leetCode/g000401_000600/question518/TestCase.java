package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question518;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {

        int[] coins = new int[] {1, 2, 5};

        Solution s = new Solution();

        assertEquals(4, s.change(5, coins));
    }
}
