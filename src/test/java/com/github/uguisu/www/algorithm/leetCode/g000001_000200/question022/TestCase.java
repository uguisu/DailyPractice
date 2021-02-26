package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question022;

import org.junit.Test;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();

        for(String c : s.generateParenthesis(3))
            System.out.println(c);
    }


    @Test
    public void test999() {
        String a = "({})";

        for(int i = 0; i <= a.length() / 2; i++) {
            System.out.println(a.substring(0, i) + " - " + a.substring(i));
        }
    }
}
