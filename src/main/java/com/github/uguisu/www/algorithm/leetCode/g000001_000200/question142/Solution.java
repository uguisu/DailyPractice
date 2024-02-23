package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question142;

public class Solution {

    public ListNode detectCycle(ListNode head) {

        // verify
        if(null == head)
            return null;
        if(null == head.next)
            return null;

        // init
        ListNode slow = head;
        ListNode faster = head;

        while(null != faster && null != faster.next) {

            slow = slow.next;
            faster = faster.next.next;


            if(slow == faster) {

                slow = head;
                // 最不好理解的一个地方
                while(null != slow) {
                    if(slow == faster) {
                        return slow;
                    }

                    slow = slow.next;
                    faster = faster.next;
                }
            }
        }

        return null;
    }
}
