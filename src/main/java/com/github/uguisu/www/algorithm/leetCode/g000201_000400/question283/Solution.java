package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question283;

public class Solution {

    /**
     * 双指针，从前向后
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
     * Memory Usage: 38.9 MB, less than 97.25% of Java online submissions for Move Zeroes.
     */
    public void moveZeroes(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return;

        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length) {

            if(0 == nums[i]) {
                // 发现目标

                while(j < nums.length && 0 == nums[j]) {
                    j++;
                }

                if(j < nums.length) {
                    // j还没有找到队尾
                    nums[i] = nums[j];
                    // 将迁移过的对象设成0，避免后续nums[i]的取值
                    nums[j] = 0;
                } else {
                    // j已经到达了队尾
                    break;
                }
            }

            i++;
            j++;
        }

        // 最后剩下的全都补零
        while(i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    /**
     * 从后往前移动
     * Runtime: 5 ms, faster than 9.06% of Java online submissions for Move Zeroes.
     * Memory Usage: 39.2 MB, less than 63.81% of Java online submissions for Move Zeroes.
     */
    public void moveZeroes_001(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return;

        int actualLength = nums.length;

        for(int i = nums.length - 1; i >= 0; i--) {

            if(0 == nums[i]) {
                // 发现目标

                for(int j = i; j < actualLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[actualLength - 1] = 0;
                actualLength--;
            }

        }
    }
}
