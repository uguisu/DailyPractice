package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> rtn = new ArrayList<>();

        // verify
        if(null == nums || 0 == nums.length)
            return rtn;

        // init
        int arrayLength = nums.length;
        used = new boolean[arrayLength];
        Arrays.fill(used, false);

        // sort 相同的数字放在一起
        Arrays.sort(nums);

        backTrack(arrayLength, new ArrayList<Integer>(), rtn, nums);

        return rtn;
    }


    private void backTrack(int end, List<Integer> cur, List<List<Integer>> rtn, int[] nums) {

        // 退出条件
        if(cur.size() == nums.length) {
            rtn.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < end; i++) {

            // 注意：这个判断是剪枝算法的重点，其他的都和46题相同
            if(0 < i && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            if(!used[i]) {
                // pre
                used[i] = true;
                cur.add(nums[i]);

                // backTrack(nextI, end, cur, rtn, nums);
                backTrack(end, cur, rtn, nums);

                // rollback
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }

}
