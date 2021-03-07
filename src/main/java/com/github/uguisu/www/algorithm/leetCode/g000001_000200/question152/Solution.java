package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question152;

import java.util.Arrays;

public class Solution {

    /**
     * 这个才是合格的答案
     * Runtime: 1 ms, faster than 93.81% of Java online submissions for Maximum Product Subarray.
     * Memory Usage: 38.4 MB, less than 97.68% of Java online submissions for Maximum Product Subarray.
     */
    public int maxProduct(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        // init
        int max = Integer.MIN_VALUE;
        int localMax = 1;
        int localMin = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                // 在遍历到负数的时候，局部最小值和局部最大值需要做交换，
                // 从而解决负数导致的“颠倒”问题。
                int tmp = localMax;
                localMax = localMin;
                localMin = tmp;
            }

            localMax = Math.max(localMax * nums[i], nums[i]);
            localMin = Math.min(localMin * nums[i], nums[i]);

            max = Math.max(max, localMax);
        }

        return max;
    }


    /**
     * 我之前的做法。提交了很多次都不能通过，就其原因是把问题搞得太零碎了。
     */
    public int maxProduct_001(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;
        if(1 == nums.length)
            return nums[0];

        // init
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = nums[0];

        // nagative counter
        int nCounter = (nums[0] < 0)? nums[0] : Integer.MAX_VALUE;
        // positive counter
        int pCounter = (nums[0] > 0)? nums[0] : Integer.MIN_VALUE;

        int wrk = nums[0];
        for(int i = 1; i < len; i++) {

            wrk *= nums[i];

            if(wrk > 0) {
                pCounter = Math.max(pCounter, wrk);
                dp[i] = Math.max(dp[i - 1], pCounter);
            }
            if(wrk < 0) {
                nCounter = Math.min(nCounter, wrk);
                dp[i] = dp[i - 1];
            }
            if(wrk == 0) {
                dp[i] = Math.max(dp[i - 1], nums[i]);
                // rollback counter
                nCounter = Integer.MAX_VALUE;
                pCounter = Integer.MIN_VALUE;
                wrk = nums[i];
            }

            // 第i位的数字，可以认为是 nums[i] * 1
            dp[i] = Math.max(dp[i], nums[i]);
        }

        return dp[len - 1];
    }
}
