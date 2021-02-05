package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question743;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void case001() {

        int[][] times = {{2, 1, 1}, {2,3,1}, {3,4,1}};

        assertEquals(2, solution.networkDelayTime(times, 4, 2));
    }

    @Test
    public void case002() {

        int[][] times = {{1, 2, 1}, {2, 1, 3}};

        assertEquals(3, solution.networkDelayTime(times, 2, 2));
    }

    @Test
    public void case003() {

        int[][] times = {{1, 2, 1}, {2, 3, 2}, {1, 3, 4}};

        assertEquals(3, solution.networkDelayTime(times, 3, 1));
    }
}
