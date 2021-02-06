package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question035;

public class Solution {

    public int searchInsert(int[] nums, int target) {

        // verify
        if (null == nums || 0 == nums.length)
            return 0;

        int lp = 0;
        int rp = nums.length - 1;
        int mid = (lp + rp) / 2;

        // check min&max
        if (target < nums[0])
            return 0;
        if (nums[rp] < target)
            return nums.length;

        while (rp - lp > 1) {
            if (target == nums[mid])
                return mid;
            if (nums[mid] < target) {
                lp = mid;
            } else {
                rp = mid;
            }
            mid = (lp + rp) / 2;
        }

        // 检查边界上的点
        if (target == nums[lp])
            return lp;
        if (target == nums[rp])
            return rp;

        // 输入数组中，没有target这个数
        return lp + 1;
    }
}
