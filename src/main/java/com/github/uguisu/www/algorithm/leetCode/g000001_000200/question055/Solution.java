package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question055;

public class Solution {

    /**
     * DP 自己思考的DP解法
     * Runtime: 451 ms, faster than 19.95% of Java online submissions for Jump Game.
     * Memory Usage: 40.7 MB, less than 90.19% of Java online submissions for Jump Game.
     */
    public boolean canJump(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return false;
        if(1 == nums.length)
            return nums[0] >= 0;

        // dp
        // init
        int[] dp = new int[nums.length];
        dp[0] = (nums[0] > 0) ? 1 : 0;

        for(int i = 0; i < nums.length; i++) {

            for(int j = 1; j <= nums[i]; j++) {

                int target = i + j;

                if(target >= nums.length)
                    // 防止下标越界
                    break;

                dp[target] = Math.min(dp[target] + 1, dp[i]);
            }

        }

        return dp[nums.length - 1] > 0;
    }
}
