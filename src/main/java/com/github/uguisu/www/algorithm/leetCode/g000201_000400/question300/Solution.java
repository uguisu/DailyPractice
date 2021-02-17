package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question300;

public class Solution {

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
}
