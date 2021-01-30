package com.github.uguisu.www.algorithm.leetCode.question234;

class Solution {

    public boolean isPalindrome(ListNode head) {
        // verify
        if(null == head || null == head.next)
            return true;

        ListNode p1 = head;
        ListNode p2 = null;

        // find middle node
        ListNode mid = findMidNode(head);
        // revert
        p2 = revertNode(mid.next);

        boolean rtn = true;
        while(null != p1 && null != p2) {
            rtn = (p1.val == p2.val);

            if(!rtn)
                // not equal
                break;

            p1 = p1.next;
            p2 = p2.next;
        }

        return rtn;
    }

    /**
     * find middle node
     */
    private ListNode findMidNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // 最后一个条件是为了控制slow指针不会被错误的移动
        while(null != fast && null != fast.next && null != fast.next.next) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    /**
     * revert node
     */
    private ListNode revertNode(ListNode node) {

        ListNode backUpNode = null;
        ListNode preNode = null;

        while(null != node) {
            // backup next node
            backUpNode = node.next;
            // revert point
            node.next = preNode;
            preNode = node;
            // move to real next
            node = backUpNode;
        }

        return preNode;
    }
}