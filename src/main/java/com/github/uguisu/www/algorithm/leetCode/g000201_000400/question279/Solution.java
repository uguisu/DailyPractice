package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question279;

import java.util.Arrays;

public class Solution {

    public int numSquares(int n) {

        // verify
        if(0 == n)
            return 0;

        int[] cache = new int[n + 1];

        // dp init
//        for(int i = 0; i < cache.length; i++)
//            cache[i] = Integer.MAX_VALUE;
        Arrays.fill(cache, Integer.MAX_VALUE);

        cache[0] = 0;

        for(int i = 1; i < cache.length; i++) {
            for(int j = 1; i - j * j >= 0; j++) {
                cache[i] = Math.min(cache[i], cache[i - j * j] + 1);
            }
        }

        return cache[n];
    }
}
