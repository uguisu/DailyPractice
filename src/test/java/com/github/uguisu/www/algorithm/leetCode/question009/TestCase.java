package com.github.uguisu.www.algorithm.leetCode.question009;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();
        int input = 123;
        assertFalse(s.isPalindrome(input));
    }
    @Test
    public void test002() {
        Solution s = new Solution();
        int input = 121;
        assertTrue(s.isPalindrome(input));
    }

    @Test
    public void test003() {
        Solution s = new Solution();
        int input = 10;
        assertFalse(s.isPalindrome(input));
    }

    @Test
    public void test004() {
        Solution s = new Solution();
        int input = 1001;
        assertTrue(s.isPalindrome(input));
    }

    @Test
    public void test005() {
        Solution s = new Solution();
        int input = 123454321;
        assertTrue(s.isPalindrome(input));
    }
}
