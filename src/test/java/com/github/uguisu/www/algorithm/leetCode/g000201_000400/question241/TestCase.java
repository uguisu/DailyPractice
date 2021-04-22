package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question241;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    @Test
    public void test001() {

        String expression = "2-1-1";

        Solution s = new Solution();
        List<Integer> res = s.diffWaysToCompute(expression);

        Collections.sort(res);

        int[] target = {0, 2};

        for(int i = 0; i < res.size(); i++) {
            assertEquals(target[i], res.get(i).intValue());
        }
    }

    @Test
    public void test002() {

        String expression = "2*3-4*5";

        Solution s = new Solution();
        List<Integer> res = s.diffWaysToCompute(expression);

        Collections.sort(res);

        int[] target = {-34,-14,-10,-10,10};

        for(int i = 0; i < res.size(); i++) {
            assertEquals(target[i], res.get(i).intValue());
        }
    }
}
