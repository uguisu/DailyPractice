package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean[] used;

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> rtn = new ArrayList<>();
        rtn.add(new ArrayList<Integer>());

        // verify
        if(null == nums || 0 == nums.length)
            return rtn;

        int arrayLen = nums.length;

        // init
        used = new boolean[arrayLen];
        Arrays.fill(used, false);

        for(int k = 1; k <= arrayLen; k++) {
            backTrack(0, arrayLen - 1, k, new ArrayList<Integer>(), rtn, nums);
        }


        return rtn;
    }

    private void backTrack(int start, int end, int k, List<Integer> cur, List<List<Integer>> rtn, int[] nums) {

        // 退出条件
        if(cur.size() == k) {
            rtn.add(new ArrayList<>(cur));
            return;
        }


        for(int i = start; i <= end; i++) {

            if(!used[i]) {
                // pre
                cur.add(nums[i]);
                used[i] = true;

                backTrack(i + 1, end, k, cur, rtn, nums);

                // rollback
                cur.remove(cur.size() - 1);
                used[i] = false;
            }
        }
    }

}
