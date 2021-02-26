package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question077;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean[] used;

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> rtn = new ArrayList<>();

        // init
        used = new boolean[n + 1];
        Arrays.fill(used, false);

        backTrack(1, n, k, new ArrayList<Integer>(), rtn);

        return rtn;
    }

    private void backTrack(int start, int end, int k, List<Integer> cur, List<List<Integer>> rtn) {
        // 退出条件
        if(k == cur.size()) {
            rtn.add(new ArrayList<>(cur));
            return;
        }

        for(int i = start; i <= end; i++) {

            if(!used[i]) {

                // pre-process
                used[i] = true;
                cur.add(i);

                // process
                backTrack(i + 1, end, k, cur, rtn);

                // rollback
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}
