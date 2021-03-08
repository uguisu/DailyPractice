/**
 * 203. Remove Linked List Elements
 *
 * Remove all elements from a linked list of integers that have value _val_.
 *
 * Example:
 *     Input:  1->2->6->3->4->5->6, val = 6
 *     Output: 1->2->3->4->5
 */
package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question203;

public class Solution {

    /**
     * 2021年重新编写
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
     * Memory Usage: 39.7 MB, less than 87.65% of Java online submissions for Remove Linked List Elements.
     */
    public ListNode removeElements(ListNode head, int val) {

        // verify
        if(null == head)
            return null;

        ListNode rtn = null;
        ListNode breakPoint = null;

        // find valid header
        while(null != head && val == head.val) {
            head = head.next;
        }

        rtn = head;
        breakPoint = head;

        if(null != head)
            head = head.next;

        while(null != head) {

            if(val != head.val) {
                // valid Node
                breakPoint.next = head;
                breakPoint = head;
            }

            head = head.next;
        }

        // the last Node
        if(null != breakPoint && breakPoint.next != null && val == breakPoint.next.val)
            breakPoint.next = null;

        return rtn;
    }

    /**
     * Runtime: 1 ms, faster than 78.37% of Java online submissions for Remove Linked List Elements.
     * Memory Usage: 41 MB, less than 18.37% of Java online submissions for Remove Linked List Elements.
     */
    public ListNode removeElements_2018(ListNode head, int val) {

        // last one
        if(null == head) return null;

        head.next = removeElements(head.next, val);

        return (head.val == val) ? head.next : head;
    }
}
