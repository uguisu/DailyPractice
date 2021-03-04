package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question047;

import org.junit.Test;

import java.util.List;

public class TestCase {

    @Test
    public void test001() {

        int[] nums = new int[] {1, 1, 2};

        Solution s = new Solution();

        for(List<Integer> in : s.permuteUnique(nums)) {

            in.forEach(
                    System.out::print
            );

            System.out.println();
        }

    }
}
