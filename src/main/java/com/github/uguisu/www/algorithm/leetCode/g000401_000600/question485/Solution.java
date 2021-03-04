package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question485;

public class Solution {

    /**
     * Runtime: 3 ms, faster than 16.81% of Java online submissions for Max Consecutive Ones.
     * Memory Usage: 41 MB, less than 23.39% of Java online submissions for Max Consecutive Ones.
     */
    public int findMaxConsecutiveOnes_001(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;
        if(1 == nums.length)
            return (1 == nums[0]) ? 1 : 0;

        // init
        int counter = (1 == nums[0]) ? 1 : 0;
        int rtn = counter;

        for(int i = 1; i < nums.length; i++) {


            if(1 == nums[i] && 0 == nums[i - 1]) {
                counter = 1;
            } else if(1 == nums[i] && nums[i - 1] == nums[i]) {
                counter++;
            } else {
                counter = 0;
            }

            rtn = Math.max(rtn, counter);
        }

        return rtn;
    }

    /**
     * Runtime: 2 ms, faster than 59.97% of Java online submissions for Max Consecutive Ones.
     * Memory Usage: 40.5 MB, less than 71.63% of Java online submissions for Max Consecutive Ones.
     */
    public int findMaxConsecutiveOnes_002(int[] nums) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;
        if(1 == nums.length)
            return (1 == nums[0]) ? 1 : 0;

        // init
        int counter = (1 == nums[0]) ? 1 : 0;
        int rtn = counter;

        for(int i = 1; i < nums.length; i++) {

            if(1 == nums[i]) {

                counter = (0 == nums[i - 1]) ? 1 : counter + 1;
                rtn = Math.max(rtn, counter);

            } else {
                counter = 0;
            }

        }

        return rtn;
    }

}
