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

    // 20240303
    public int removeElement2(int[] nums, int val) {
        // verify
        if(null == nums || 0 == nums.length) return 0;

        // case: [1], target = 1
        if(1 == nums.length) {
            if(val == nums[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        // find the index of not target value, reverse order
        int pLast = - 1;
        for(int i = nums.length - 1; 0 <= i; i-- ) {
            if(val != nums[i]) {
                // find it
                pLast = i;
                break;
            }
        }

        // case: [3, 3], target = 3
        if(-1 == pLast) {
            // pLast do not changed
            return 0;
        }

        int tmp = 0;
        int i = 0;
        while(i < pLast) {
            if(val == nums[i]) {
                // find target value, change to last
                tmp = nums[i];
                nums[i] = nums[pLast];
                nums[pLast] = tmp;

                // move lasr point
                pLast--;

                while(i < pLast) {
                    if(val != nums[pLast]) {
                        // find it
                        break;
                    } else {
                        pLast--;
                    }
                }
            }

            i++;
        }

        return pLast + 1;
    }

}
