package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question062;

import java.util.HashMap;

public class Solution {

    // 以下程序可以解决问题，但是速度太慢
    /*
    // key: m_n; val: path
    HashMap<String, Integer> cache = new HashMap<>();

    public int uniquePaths(int m, int n) {

        // System.out.println(String.format("m = %d, n = %d", m, n));

        if(1 == m && 1 == n)
            // 只有一个格子
            return 1;

        if ((1 == m && 2 == n) || (2 == m && 1 == n)) {
            cache.put(String.format("%d_%d", m, n), 1);
            return 1;
        }

        int pathCount = 0;

        if(1 < m) {
            // 只有在 m 方向上进行了查找，才可以进入递归
            int find_m = m - 1;
            pathCount += cache.getOrDefault(String.format("%d_%d", find_m, n), uniquePaths(find_m, n));
        }

        if(1 < n) {
            // 只有在 n 方向上进行了查找，才可以进入递归
            int find_n = n - 1;
            pathCount += cache.getOrDefault(String.format("%d_%d", m, find_n), uniquePaths(m, find_n));
        }

        cache.put(String.format("%d_%d", m, n), pathCount);

        return pathCount;
    }
    */


    public int uniquePaths(int m, int n) {

        if(1 == m && 1 == n)
            // 只有一个格子
            return 1;

        int[][] cache = new int[m][n];

        // 初始化，这个至关重要
        for(int wm = 0; wm < m; wm++)
            cache[wm][0] = 1;
        for(int wn = 0; wn < n; wn++)
            cache[0][wn] = 1;

        for(int wm = 1; wm < m; wm++) {
            for(int wn = 1; wn < n; wn ++) {
                cache[wm][wn] = cache[wm - 1][wn] + cache[wm][wn - 1];
            }
        }

        return cache[m - 1][n - 1];
    }

}
