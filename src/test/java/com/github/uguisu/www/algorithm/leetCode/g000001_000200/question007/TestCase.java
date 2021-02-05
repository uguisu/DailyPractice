package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();
        int input = 123;
        assertEquals(321, s.reverse(input));
    }

    @Test
    public void test002() {
        Solution s = new Solution();
        int input = -123;
        assertEquals(-321, s.reverse(input));
    }

    @Test
    public void test003() {
        Solution s = new Solution();
        int input = 120;
        assertEquals(21, s.reverse(input));
    }

    @Test
    public void test004() {
        Solution s = new Solution();
        int input = 0;
        assertEquals(0, s.reverse(input));
    }
    @Test
    public void test005() {
        Solution s = new Solution();
        int input = 1534236469;
        assertEquals(0, s.reverse(input));
    }

}
