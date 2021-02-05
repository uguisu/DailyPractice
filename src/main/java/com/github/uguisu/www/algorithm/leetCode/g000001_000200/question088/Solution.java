/**
 * 88. Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 
 * 思路：正向循环，开辟新空间存储中间结果。
 * 思路：反向循环，倒序便利，找最大的值放到数组末端。
 * 这个题目说的不太清楚，它里面有两个假设：
 * 1) 数组均是升序排列
 * 2) 数组1的length一定是m+n
 * 3) 表示数组1中，有效元素的个数，而不是数组的长度。（这一点坑人啊）
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question088;

import java.util.Arrays;

public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = { 2, 4, 0};
        int[] nums2 = { 1 };

        Solution s = new Solution();
        s.merge(nums1, 2, nums2, 1);

        Arrays.stream(nums1).forEach(System.out::println);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // NOTICE: You should assume that "nums1.length = m + n", so "m !=  nums1.length"
        
        // varify
        if (0 == n) {
            return;
        }
        if (0 == m && 0 != n) {
            for (int wrk = 0; wrk < nums2.length; wrk++) {
                nums1[wrk] = nums2[wrk];
            }
        }

        int p1, p2, pW;
        p1 = 0;
        p2 = 0;
        pW = 0;

        int[] wrk = new int[m + n];

        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                wrk[pW] = nums1[p1];
                p1++;
            } else {
                wrk[pW] = nums2[p2];
                p2++;
            }
            pW++;
        }

        for (; p1 < m; p1++) {
            wrk[pW] = nums1[p1];
            pW++;
        }
        for (; p2 < n; p2++) {
            wrk[pW] = nums2[p2];
            pW++;
        }

        // TODO: why following settings can not change 'nums1', but for loop could.
        // nums1 = wrk;
        for (int i = 0; i < wrk.length; i++) {
            nums1[i] = wrk[i];
        }

    }
    
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        
        // NOTICE: You should assume that "nums1.length = m + n", so "m !=  nums1.length"
        
        // varify
        if(0 == n) {
            return;
        }
        if(0 == m && 0 != n) {
            for(int wrk = 0; wrk < nums2.length; wrk++) {
                nums1[wrk] = nums2[wrk];
            }
        }
        
        int p1, p2, pW;
        p1 = m - 1;
        p2 = n - 1;
        pW = m + n - 1;
        
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[pW--] = nums1[p1--];
            } else {
                nums1[pW--] = nums2[p2--];
            }
        }
        
        while(p2 >= 0) {
            nums1[pW--] = nums2[p2--];
        }
    }
}
