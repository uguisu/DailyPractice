package com.github.uguisu.www.algorithm.leetCode.question901;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    private StockSpanner stockSpanner;

    @Before
    public void before() {
        stockSpanner = new StockSpanner();
    }

    @Test
    public void test001() {
        int val = stockSpanner.next(100);
        assertEquals(1, val);
    }

    @Test
    public void test002() {
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] result = {1, 1, 1, 2, 1, 4, 6};

        for(int i = 0; i < input.length; i++) {
            assertEquals(result[i], stockSpanner.next(input[i]));
        }
    }
}
