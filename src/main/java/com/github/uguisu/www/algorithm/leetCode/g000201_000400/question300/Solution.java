package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question300;

import java.util.Arrays;

public class Solution {

    /**
     * 普通解法
     */
    public int lengthOfLIS(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        // init
        int[] dp = new int[nums.length];
        dp[0] = 1;

        int maxLength = 1;

        for(int i = 1; i < nums.length; i++) {
            int maxval = 0;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }

            dp[i] = maxval + 1;
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    /**
     * 另外一种思路
     */
    // Dynamic Programming with Binary Search
    // Time complexity : O(nlogn). Binary search takes nlogn time and it is called n times.
    // Space complexity : O(n). dp array of size n is used.
    public int lengthOfLIS_001(int[] nums) {
        // dp keeps some of the visited element in a sorted list, and its size is lengthOfLIS so far.
        // It always keeps the our best chance to build a LIS in the future.
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            // If not found, change i to new insertion point index.
            if (i < 0) {
                i = -(i+1);
            }
            // If num is the biggest, we should add it into the end of dp.
            // If num is not the biggest, we should keep it in dp and replace the previous num in
            // this position. Because even if num can't build longer LIS directly, it can help
            // build a smaller dp, and we will have the best chance to build a LIS in the future.
            // All elements before this position will be the best(smallest) LIS sor far.
            dp[i] = num;
            if (i == len){
                len++;
            }
        }
        // dp doesn't keep LIS, and only keep the lengthOfLIS.
        return len;
    }
}
