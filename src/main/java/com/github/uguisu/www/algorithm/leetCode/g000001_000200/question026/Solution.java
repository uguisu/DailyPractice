package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question026;

// 思路：双指针，从左向右依次移动。一个用来甄别重复，一个记录当前写入位置
class Solution {
    public int removeDuplicates(int[] nums) {
        // verify
        if(null == nums || 0 == nums.length)
            return 0;
        if(1 == nums.length)
            return 1;

        // at least two elements
        int left = 0;
        int right = 0;
        int tmp = 0;
        while(right < nums.length) {

            if(right + 1 == nums.length) {
                // right now point to the last element
                nums[left] = nums[right];
                break;
            }

            if(nums[right] != nums[right + 1]) {
                // next
                nums[left] = nums[right];
                left++;
                right++;
            } else {
                // find duplicate
                int j = right;
                boolean isFind = false;
                for(; j < nums.length; j++) {
                    if(nums[right] == nums[j]) {
                        // next
                    } else {
                        isFind = true;
                        break;
                    }
                }
                if(isFind) {
                    nums[left] = nums[right];
                    right = j;
                    left++;
                } else {
                    // point to last one
                    right = nums.length - 1;
                }

            }
        }
        return left + 1;
    }
}
