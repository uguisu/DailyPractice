package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question027;

public class Solution {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
     * Memory Usage: 37.6 MB, less than 67.80% of Java online submissions for Remove Element.
     */
    public int removeElement(int[] nums, int val) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        int i = 0;
        int right = nums.length - 1;
        int tmp = 0;
        while(i < nums.length && i <= right) {

            if(val == nums[i]) {
                // 发现目标值, 将当前i所对应的元素换到队尾
                tmp = nums[i];
                nums[i] = nums[right];
                nums[right] = tmp;

                right--;
            } else {
                i++;
            }
        }

        return i;
    }

}
