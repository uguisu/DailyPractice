/**
 * 128.Longest Consecutive Sequence
 * 
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity. 
 * 
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question128;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        
        // Verify input
        if(null == nums || nums.length == 0) return 0;
        if(1 == nums.length) return 1;

		Arrays.sort(nums);

        // Counter
        int intCount = 1;
        int intMax = 1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            // Skip same elements
            if(nums[i] == nums[i + 1]) {
                // !!! Allow duplicate elements in array
                //intMax = Math.max(intMax, intCount);
                //intCount = 1;
            } else if(nums[i] + 1 == nums[i + 1]) {
                intCount++;
            } else {
                intMax = Math.max(intMax, intCount);
                intCount = 1;
            }
        }
		return Math.max(intMax, intCount);
    }
}