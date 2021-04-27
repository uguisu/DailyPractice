package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question141;

import java.util.HashSet;

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
        ListNode faster = head;
        HashSet<ListNode> path = new HashSet<>();

        while(true) {

            if(path.contains(faster)) {
                // find cycle
                rtn = true;
                break;
            }
            path.add(faster);

            slow = slow.next;
            if(null != faster.next && null != faster.next.next) {
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
