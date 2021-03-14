package com.github.uguisu.www.algorithm.leetCode.g000801_001000.question933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Runtime: 19 ms, faster than 61.55% of Java online submissions for Number of Recent Calls.
 * Memory Usage: 47.5 MB, less than 56.25% of Java online submissions for Number of Recent Calls.
 */
public class RecentCounter {

    private Queue<Integer> range = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {

        range.add(t);

        while(null != range.peek() && range.peek() < t - 3000)
            range.poll();

        return range.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */