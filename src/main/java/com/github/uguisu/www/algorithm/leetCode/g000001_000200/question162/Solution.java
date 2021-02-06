package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question162;

public class Solution {

    public int findPeakElement(int[] nums) {

        // verify
        if(1 == nums.length)
            return 0;
        if(2 == nums.length)
            return (nums[0] > nums[1]) ? 0 : 1;

        int lp = 0;
        int rp = 1;

        // 寻找峰值，一定是上升的
        while(nums[rp] - nums[lp] >= 0) {
            lp++;
            rp++;

            if(rp >= nums.length)
                // arrive teh last element
                break;
        }

        return lp;
    }
}
