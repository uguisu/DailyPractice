package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question217;

import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        // verify
        if(null == nums || 0 == nums.length)
            return false;

        HashSet<Integer> wrkSet = new HashSet<>();

        for(int wrk : nums) {
            if(wrkSet.contains(wrk)) {
                return true;
            } else {
                wrkSet.add(wrk);
            }
        }

        // 最终没有找到
        return false;
    }
}
