package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question078;

import org.junit.Test;

import java.util.List;

public class TestCase {

    @Test
    public void test001() {

        int[] nums = new int[] {1, 2, 3};

        Solution s = new Solution();

        for(List<Integer> c : s.subsets(nums)) {

            c.forEach(
                    System.out::print
            );
            System.out.println();
        }

    }
}
