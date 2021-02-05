package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question704;

public class Solution {

    public int search(int[] nums, int target) {
        // verify
        if(null == nums || 0 == nums.length)
            return -1;

        int lp = 0;
        int rp = nums.length - 1;
        int mid = (rp + lp) / 2;

        while(rp - lp > 1) {
            if (target == nums[mid])
                return mid;
            if (nums[mid] < target)
                lp = mid;
            if (target < nums[mid])
                rp = mid;
            mid = (rp + lp) / 2;
        }

        if (target == nums[lp])
            return lp;
        if (target == nums[rp])
            return rp;

        return -1;
    }
}
