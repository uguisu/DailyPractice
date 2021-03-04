package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question046;

import org.junit.Test;

import java.util.List;

public class TestCase {

    @Test
    public void test001() {
        int[] nums = new int[] {1, 2, 3};

        Solution s = new Solution();

        List<List<Integer>> rtn = s.permute(nums);

        for(List<Integer> in : rtn) {

            in.forEach(
                    System.out::print
            );

            System.out.println();
        }
    }
}
