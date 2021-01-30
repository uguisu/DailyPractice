package com.github.uguisu.www.algorithm.leetCode.question234;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestCase {

    @Test
    public void test001() {
        ListNode p = new ListNode(1);
        ListNode n = new ListNode(2);
        ListNode head = p;
        p.next = n;

        Solution s = new Solution();

        assertFalse(s.isPalindrome(head));
    }
}
