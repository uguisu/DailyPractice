package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question077;

import org.junit.Test;

import java.util.List;

public class TestCase {

    @Test
    public void test001() {
        Solution s = new Solution();

        List<List<Integer>> rtn = s.combine(4, 2);

        for(List<Integer> c : rtn) {
            c.forEach(
                    System.out::print
            );

            System.out.println();
        }
    }
}
