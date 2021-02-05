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

    public ListNode removeElements(ListNode head, int val) {

        // last one
        if(null == head) return null;

        head.next = removeElements(head.next, val);

        return (head.val == val) ? head.next : head;
    }
}
