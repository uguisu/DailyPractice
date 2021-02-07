package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question389;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        Solution s  = new Solution();

        assertEquals('e', s.findTheDifference("abcd", "abcde"));
    }
}
