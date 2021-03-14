package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question206;

public class Solution {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
     * Memory Usage: 38.5 MB, less than 93.17% of Java online submissions for Reverse Linked List.
     */
    public ListNode reverseList(ListNode head) {

        // verify
        if(null == head || null == head.next)
            return head;

        // 至少有两个元素


        ListNode preNode = null;
        ListNode nextNode = null;

        while(null != head) {

            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;

        }

        return preNode;
    }
}
