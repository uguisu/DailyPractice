package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question198;

public class Solution {

    public int rob(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        if(1 == nums.length)
            return nums[0];

        if(2 == nums.length)
            return (nums[0] > nums[1]) ? nums[0] : nums[1];

        // init
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = nums[1];

        int counter = Math.max(dp[1], dp[2]);
        for(int i = 3; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i - 1];
            counter = Math.max(counter, dp[i]);
        }

        return counter;
    }
}
