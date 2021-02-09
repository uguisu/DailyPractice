package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question070;

public class Solution {

    public int climbStairs(int n) {
        // verify
        if(0 == n)
            return 0;
        if(1 == n)
            return 1;
        if(2 == n)
            return 2;

        int[] cache = new int[n + 1];

        // dp init
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;

        for(int i = 3; i <= n; i ++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }

}
