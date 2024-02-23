package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question141;

public class Solution {

    public boolean hasCycle(ListNode head) {

        boolean rtn = false;

        // verify
        if(null == head)
            return false;
        if(null == head.next)
            return false;

        // init
        ListNode slow = head;
        ListNode faster = head.next.next;

        while(null != faster) {

            if(slow == faster) {
                rtn = true;
                break;
            }

            slow = slow.next;
            if(null != faster.next) {
                faster = faster.next.next;
            } else {
                // access to the last item
                rtn = false;
                break;
            }
        }

        return rtn;
    }
}
