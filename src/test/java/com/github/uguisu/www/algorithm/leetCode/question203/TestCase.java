package com.github.uguisu.www.algorithm.leetCode.question203;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestCase {

    @Test
    public void test001() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        Solution s = new Solution();

        ListNode rtn = s.removeElements(l1, 6);

        while(rtn != null) {
            System.out.println(rtn.val);
            rtn = rtn.next;
        }
    }

    @Test
    public void test002() {
        ListNode l1 = new ListNode(1);

        l1.next = null;

        Solution s = new Solution();

        ListNode rtn = s.removeElements(l1, 1);

        assertTrue(rtn == null);
    }

    @Test
    public void test003() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);

        l1.next = l2;
        l2.next = null;

        Solution s = new Solution();

        ListNode rtn = s.removeElements(l1, 1);

        assertTrue(rtn == null);
    }
}
