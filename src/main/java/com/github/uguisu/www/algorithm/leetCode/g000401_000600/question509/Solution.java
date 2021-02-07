package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question509;

import java.util.HashMap;

public class Solution {

    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {

        if(0 == n) {
            cache.put(0, 0);
            return 0;
        }
        if(1 == n) {
            cache.put(1, 1);
            return 1;
        }

        Integer n_1 = cache.get(n - 1);
        n_1 = (null == n_1) ? fib(n - 1) : n_1;

        Integer n_2 = cache.get(n - 2);
        n_2 = (null == n_2) ? fib(n - 2) : n_2;

        int rtn = n_1 + n_2;

        // cache
        cache.put(n, rtn);

        return rtn;
    }

}
