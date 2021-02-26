package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> rtn = new ArrayList<>();

        // verify
        if(null == nums || 0 == nums.length)
            return rtn;

        // init used array
        used = new boolean[nums.length];
        Arrays.fill(used, false);

        backTrack(new ArrayList<Integer>(), nums, rtn);

        return rtn;
    }

    private void backTrack(List<Integer> cur, int[] nums, List<List<Integer>> rtn) {

        // 退出条件
        if(nums.length == cur.size()) {
            // 注意！不能直接 rtn.add()
            rtn.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            if(!used[i]) {

                // pre-call
                used[i] = true;
                cur.add(nums[i]);

                backTrack(cur, nums, rtn);

                // roll back changes
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}
