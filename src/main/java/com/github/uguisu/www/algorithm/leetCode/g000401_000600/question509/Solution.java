package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question509;

import java.util.HashMap;

public class Solution {

    /*
    此方法可以解决问题，但是比官方给出的办法来讲要慢很多
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
    */

    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return memoize(N);
    }

    public int memoize(int N) {
        int[] cache = new int[N + 1];
        cache[1] = 1;

        for (int i = 2; i <= N; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[N];
    }
}
