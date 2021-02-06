package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question074;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        // skip verify

        if(1 == matrix.length)
            // 只有一个维度
            return findTarget(matrix[0], target);

        int lp = 0;
        int rp = matrix.length - 1;
        int mid = (lp + rp) / 2;

        while(rp - lp > 1) {
            if(target == matrix[mid][0])
                return true;
            if(matrix[mid][0] < target) {
                lp = mid;
            } else {
                rp = mid;
            }

            mid = (lp + rp) / 2;
        }

        // 检查边界上的点
        if (target == matrix[lp][0])
            return true;
        if (target == matrix[rp][0])
            return true;

        // 处在分界线上的点判断规则： 上一行的最后一个元素，下一行的第一个元素
        if (target <= matrix[lp][matrix[lp].length - 1]) {
            return findTarget(matrix[lp], target);
        } else {
            return findTarget(matrix[rp], target);
        }
    }

    private boolean findTarget(int[] nums, int target) {
        // verify
        if(null == nums || 0 == nums.length)
            return false;

        int lp = 0;
        int rp = nums.length - 1;
        int mid = (lp + rp) / 2;

        while(rp - lp > 1) {
            if (target == nums[mid])
                return true;
            if (nums[mid] < target) {
                lp = mid;
            } else {
                rp = mid;
            }
            mid = (lp + rp) / 2;
        }

        // 检查边界上的点
        if (target == nums[lp])
            return true;
        if (target == nums[rp])
            return true;

        return false;
    }

}
