package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question008;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        String input = "42";
        Solution s = new Solution();
        assertEquals(42, s.myAtoi(input));
    }
    @Test
    public void test002() {
        String input = "   -42";
        Solution s = new Solution();
        assertEquals(-42, s.myAtoi(input));
    }
    @Test
    public void test003() {
        String input = "4193 with words";
        Solution s = new Solution();
        assertEquals(4193, s.myAtoi(input));
    }
    @Test
    public void test004() {
        String input = "words and 987";
        Solution s = new Solution();
        assertEquals(0, s.myAtoi(input));
    }
    @Test
    public void test005() {
        String input = "-91283472332";
        Solution s = new Solution();
        assertEquals(-2147483648, s.myAtoi(input));
    }
    @Test
    public void test006() {
        String input = "  0000000000012345678";
        Solution s = new Solution();
        assertEquals(12345678, s.myAtoi(input));
    }
    @Test
    public void test007() {
        String input = "2147483646";
        Solution s = new Solution();
        assertEquals(2147483646, s.myAtoi(input));
    }
    @Test
    public void test008() {
        String input = "21474836460";
        Solution s = new Solution();
        assertEquals(2147483647, s.myAtoi(input));
    }
    @Test
    public void test009() {
        String input = "00000-42a1234";
        Solution s = new Solution();
        assertEquals(0, s.myAtoi(input));
    }

    @Test
    public void tmp() {
        char ch = '9';
        System.out.println((int)ch);

        System.out.println((Integer.MAX_VALUE + 2) / 10);
        System.out.println("     akjdfbaid     ".trim());
    }
}
