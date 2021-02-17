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

    /**
     * 滑动窗口法
     */
    public int maxSubArray_001(int[] nums) {
        int maxSub = nums[0], curSum = 0;

        for (int n : nums) {

            if (curSum < 0)
                // 窗口滑动
                curSum = 0;

            curSum += n;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }

    /**
     * Kadane算法
     */
    public int maxSubArray_002(int[] nums) {
        int max_so_far=nums[0];
        int curr_max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_max = Math.max(nums[i],curr_max+nums[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }

    /**
     * 分治法
     */
    public int maxSubArray_003(int[] nums) {
        return maxSubArrayDivideWithBorder(nums, 0, nums.length-1);
    }

    private int maxSubArrayDivideWithBorder(int[] nums, int start, int end) {
        if (start == end) {
            // 只有一个元素，也就是递归的结束情况
            return nums[start];
        }

        // 计算中间值
        int center = (start + end) / 2;
        int leftMax = maxSubArrayDivideWithBorder(nums, start, center); // 计算左侧子序列最大值
        int rightMax = maxSubArrayDivideWithBorder(nums, center + 1, end); // 计算右侧子序列最大值

        // 下面计算横跨两个子序列的最大值

        // 计算包含左侧子序列最后一个元素的子序列最大值
        int leftCrossMax = Integer.MIN_VALUE; // 初始化一个值
        int leftCrossSum = 0;
        for (int i = center ; i >= start ; i--) {
            leftCrossSum += nums[i];
            leftCrossMax = Math.max(leftCrossSum, leftCrossMax);
        }

        // 计算包含右侧子序列最后一个元素的子序列最大值
        int rightCrossMax = nums[center+1];
        int rightCrossSum = 0;
        for (int i = center + 1; i <= end ; i ++) {
            rightCrossSum += nums[i];
            rightCrossMax = Math.max(rightCrossSum, rightCrossMax);
        }

        // 计算跨中心的子序列的最大值
        int crossMax = leftCrossMax + rightCrossMax;

        // 比较三者，返回最大值
        return Math.max(crossMax, Math.max(leftMax, rightMax));
    }
}
