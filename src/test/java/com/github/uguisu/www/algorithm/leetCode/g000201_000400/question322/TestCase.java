package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question322;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        int[] coins = new int[] {1, 2, 5};
        Solution s = new Solution();

        assertEquals(3, s.coinChange(coins, 11));
    }

    @Test
    public void test002() {
        int[] coins = new int[] {2};
        Solution s = new Solution();

        assertEquals(-1, s.coinChange(coins, 3));
    }
}
