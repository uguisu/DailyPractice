package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question053;

public class Solution {

    /**
     * DP方法
     */
    public int maxSubArray(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        // init
        int arrayLength = nums.length;
        int[] dp = new int[arrayLength];
        dp[0] = nums[0];

        /*
        dp[i-1]表示的是以i-1为结尾的最大子序和，若dp[i-1]小于0，则dp[i]加上前面的任意长度的序列和都会小于不加前面的序列（即自己本身一个元素是以自己为结尾的最大自序和）。
        举个例子：如 -2，1，-3，4 数组
            dp[0] = -2
            dp[1] = 1 因为前一个dp[0]=-2<0，即（-2，1）子序和为-1，一个元素（1）子序和为1
            dp[2] = dp[1] + nums[2] = 1 + (-3) = -2
            dp[3] = 4 因为dp[2]<0；
        */
        int maxVal = dp[0];

        for(int i = 1; i < arrayLength; i++) {

            if(dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }

            maxVal = Math.max(maxVal, dp[i]);
        }

        return maxVal;
    }
}
