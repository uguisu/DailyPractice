/**
 * 2. Add Two Numbers
 * 
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * [思路] 两个链表相加，注意一下进位问题；控制好生成新节点的时机
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question002;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l1Head = l1;
		ListNode l2 = new ListNode(9);
		ListNode l2Head = l2;
		l2.next = new ListNode(9);
		l2 = l2.next;
		
		Solution s  = new Solution();
		ListNode rtn = s.addTwoNumbers(l1Head, l2Head);
		
		while(null != rtn) {
			System.out.print (rtn.val);
			rtn = rtn.next;
			if(null != rtn) {
				System.out.print(", ");
			}
		}
	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	

        // check
        if(null == l1 && null == l2) {
            return new ListNode(0);
        }
        
        ListNode dummy = new ListNode(0);
        // declare return variable, and keep the header
        ListNode rtn = dummy;
        
        // int plus
        int intForPlus = 0;
        
        while(null != l1 && null != l2) {
            
            // Calculate
            dummy.val = (l1.val + l2.val + intForPlus) % 10;
            intForPlus = (l1.val + l2.val + intForPlus) / 10;
            
            // go next
            if(null != l1.next && null != l2.next) {
                dummy.next = new ListNode(0);
                dummy = dummy.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        
        while(null != l1) {
            
            dummy.next = new ListNode(0);
            dummy = dummy.next;

            // Calculate
            dummy.val = (l1.val + intForPlus) % 10;
            intForPlus = (l1.val + intForPlus) / 10;
            
            l1 = l1.next;
        }

    	while(null != l2) {

            dummy.next = new ListNode(0);
            dummy = dummy.next;

            // Calculate
            dummy.val = (l2.val + intForPlus) % 10;
            intForPlus = (l2.val + intForPlus) / 10;
            
            // go next
            l2 = l2.next;
        }
        
    	// 不能使用下面的方法编程函数的形式，因为dummy的对象引用有问题。
        // intForPlus = calRemain(l1, dummy, intForPlus);
        // intForPlus = calRemain(l2, dummy, intForPlus);
        
        // add last one
        if(0 < intForPlus) {
            dummy.next = new ListNode(0);
            dummy = dummy.next;
            dummy.val = intForPlus;
            dummy.next = null;
        }
    	
    	return rtn;
    }
    
    /**
     * Leetcode上面的标准答案
     */
    public ListNode addTwoNumbers_LeetCode(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    
    /**
     * Calculate remained ListNode
     * @return intForPlus
     */
//    private int calRemain(ListNode lx, ListNode dummy, int intForPlus) {
//        while(null != lx) {
//            
//            dummy.next = new ListNode(0);
//            dummy = dummy.next;
//
//            // Calculate
//            dummy.val = (lx.val + intForPlus) % 10;
//            intForPlus = (lx.val + intForPlus) / 10;
//            
//            lx = lx.next;
//        }
//        
//        return intForPlus;
//    }
}
