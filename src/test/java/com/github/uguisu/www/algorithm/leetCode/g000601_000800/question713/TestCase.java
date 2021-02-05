package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question713;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test001() {

        int[] data = {10, 5, 2, 6};
        int K = 100;

        int res = solution.numSubarrayProductLessThanK(data, K);

        assertEquals(8, res);
    }

    @Test
    public void test002() {

        int[] data = {2, 3, 4};
        int K = 24;

        int res = solution.numSubarrayProductLessThanK(data, K);

        assertEquals(5, res);
    }

    @Test
    public void test003() {

        int[] data =
                {19,27,9,9,5,18,30,27,22,13,30,1,27,21,6,30,8,7,29,19,14,5,33,9,33,23,5,28,28,3,19,
                17,32,27,33,7,1,11,22,9,1,27,3,5,31,20,30,28,25,7,1,1,5,31,15,33,9,29,10,16,17,26,23,
                13,20,11,9,16,29,20,29,20,2,29,6,19,4,28,5,19,1,23,5,12,2,19,21,3,6,20,26,20,22,16,1,
                21,26,8,30,33,19,19,2,14,22,3,17,30,24,19,17,32,32,23,31,11,22,29,21,7,17,26,13,5,4,33,
                31,5,19,14,10,12,28,7,1,33,11,16,4,21,14,15,16,30,14,26,25,28,10,5,10,23,26,7,28,25,14,
                14,21,22,10,4,18,24,21,30,22,3,14,6,13,21,2,17,26,14,31,24,26,26,10,13,19,23,11,18,21,
                4,3,28,26,1,11,6,6,25,14,27,32,10,23,11,14,5,27,11,8,31,1,12,32,31,13,17,1,23,9,33,2,
                11,29,14,6,29,29,10,2,31,12,10,13,5,1,19,33,14,22,4,11,14,26,22,22,21,3,2,1,17,8,28,
                30,11,6,13,4,31,11,18,12,6,18,4,4,21,6,28,22,33,12,2,8,20,16,25,19,7,25,18,26,27,25,
                23,14,30,16,3,10,26,27,32,17,30,17,9,19,2,5,15,21,25,31,16,19,13,8,20,28,9,6,14,32,
                6,3,30,23,20,24,18,19,8,32,6,1,24,16,22,11,24,11,12,25,30,28,14,26,23,14,21,22,29,
                30,17,5,8,28,5,5,16,31,33,33,2,4,18,8,22,30,1,15,30,24,32,31,20,13,27,18,26,16,25,
                15,22,15,26,17,30,21,14,12,1,29,14,20,30,17,16,20,21,27,17,25,10,20,15,4,13,29,26,22,22,
                27,6,3,28,15,14,18,12,33,23,23,6,8,21,26,22,4,21,21,25,32,2,1,32,3,14,12,25,14,7,3,33,7,
                10,22,8,14,17,12,16,16,9,31,10,10,9,28,11,7,9,15,8,18,26,11,11,8,24,10,23,33,13,20,23,26,
                27,9,1,24,17,23,1,9,11,9,31,10,22,29,16,17,11,28,20,8,33,25,32,20,23,11,6,28,14,15,33,32,
                20,30,6,14,1,33,13,17,5,23,21,18,2,20,18,5,30,8,29,10,10,30,27,9,20,28,27,9,2,14,22,25,15,
                31,22,6,30,27,17,24,8,22,16,20,10,21,2,5,23,13,25,32,8,12,26,33,19,31,7,20,3,33,31,23,9,24,
                33,27,26,11,8,19,2,16,22,12,3,10,8,6,6,19,27,2,10,21,6,17,2,28,9,22,26,5,32,18,3,4,9,3,7,25,
                16,28,29,26,25,25,27,13,33,22,28,26,7,33,30,21,9,7,3,15,10,2,25,30,33,30,29,19,16,23,26,18,
                25,29,6,31,7,29,25,32,6,24,32,22,31,29,13,12,7,14,22,32,16,21,29,17,3,23,13,3,22,7,15,12,12,
                26,14,14,7,2,6,28,9,28,3,6,9,16,31,14,33,33,7,20,18,3,2,5,5,9,17,5,25,12,32,23,1,32,12,10,33,
                6,9,29,19,22,18,3,7,4,33,6,2,20,26,16,25,33,6,6,30,18,10,2,22,31,15,32,3,28,5,29,5,15,13,23,
                3,19,25,3,17,10,1,27,33,15,14,5,15,16,20,25,29,28,15,7,15,28,23,14,13,7,4,9,20,13,12,16,10,9,
                9,7,4,5,25,8,22,9,5,14,32,3,12,31,28,13,30,14,5,14,22,9,13,3,3,3,8,2,25,26,20,22,31,32,22,25,
                3,3,24,29,15,12,5,18,25,29,16,17,31,14,17,11,9,15,20,6,23,24,31,27,31,33,14,24,15,10,16,5,26,
                22,18,29,9,7,23,27,4,10,8,3,24,26,19,26,33,24,33,25,33,7,32,26,11,29,21,10,6,21,24,21,17,26,17
                ,2,17,16,28,2,4,8,23,13,4,12,24,12,29,29,32,10,15,18,19,23,11,3,24,10,33,16,14,11,21,16,1,14,
                13,3,7,24,24,3,3,26,13,29,8,8,13,32,31,6,20,11,23,33,27,27,16,23,33,2,5,29,21,14,20,28,1,13,15,
                18,7,1,13,25,32,16,33,2,32,3,25,13,18,27,33,31,15,7,25,11,26,3,32,2,7,17,9,32,29,19,15,8,27,25,
                5,33,11,7,33,12,14,28,15,6,19,19,22,24,1,5,33,10,30,27,26,16,33,23,3,27,21,8,18,3,19,1,15,10,1,
                5,3,19,6,13,13,24,7,24,19,13,2,6,28,13,22,13,3,18,24,1,25,3,19,20,15,6,28,27,15,1,24,28,9,25,32,
                21,20,26,28,1,6,22,2,33,13,21,13,27,5,30,13,15,15,11,21,18,16,24,20,8,25,17,10,30,27,4,29,28,25,
                19,5,16,15,28,31,24,18,20,17,14,28,21,29,17,3,1,6,29,11,16,11,4,32,8,14,4,33,27,20,4,8,11,1,1,13,
                23,26,11,2,28,21,19,21,10,13,1,20,2,27,20,32,18,11,6,18,24,1,13,24,19,14,32,2,15,29,21,30,14,12,
                24,9,4,22,26,32,20,29,12,27,27,5,12,24,15,9,29,27,14,8,29,2,2,18,8,23,25,24,11,19,2,28,28,9,18,
                12,25,29,1,1,28,29,31,15,15,21,11,12,33,5,10,27,4,28,27,14,6,28,29,17,28,27,32,3,9,15,27,30,13,32,
                25,8,7,19,5,3,4,11,25,27,24,4,30,2,9,31,2,33,12,18,14,9,9,33,13,12,17,19,29,27,21,1,16,32,22,23,9,
                30,13,30,27,20,13,25,32,10,26,11,5,6,19,29,11,19,11,22,20,15,9,30,13,14,24,29,23,7,20,31,19,18,32,
                29,16,12,32,27,8,8,16,17,14,33,8,20,24,6,19,29,23,4,11,14,11,13,25,5,31,1,22,14,2,25,28,31,5,20,13,
                30,4,16,1,13,4,13,19,16,28,30,31,26,1,1,15,30,32,15,10,2,18,24,23,26,10,7,19,20,24,30,7,25,8,12,28,
                5,3,33,13,18,15,30,16,18,28,18,29,31,7,3,30,29,26,24,26,15,26,25,17,17,22,9,14,8,27,4,28,6,22,31,23,
                3,30,22,14,20,23,2,6,15,18,17,10,25,9,8,17,32,12,4,7,2,19,19,21,1,9,6,5,5,3,11,9,20,32,14,17,33,23,30,
                31,29,30,7,11,21,10,31,3,1,15,13,10,4,11,21,24,14,22,9,3,29,21,25,12,13,1,17,19,11,6,10,22,22,31,31,
                16,22,27,6,26,32,4,21,29,20,15,28,5,14,25,19,14,3,25,5,8,19,26,17,1,18,28,6,18,23,6,28,3,22,14,10,22,
                16,7,26,16,29,14,33,33,2,24,23,6,28,25,27,4,23,7,13,28,21,30,11,3,10,14,33,18,25,10,33,28,15,12,6,6,
                31,27,21,27,22,29,12,2,7,33,9,32,18,10,14,20,6,2,10,22,15,24,6,13,19,31,23,15,25,6,31,25,3,29,17,5,33,
                12,25,24,30,26,18,33,17,25,27,4,12,11,10,7,10,18,18,29,23,11,21,8,33,3,19,8,19,33,29,28,10,12,17,14,20,
                24,10,29,9,24,11,7,32,1,3,20,3,21,11,11,28,30,6,4,1,9,6,1,24,4,33,22,29,23,14,19,27,23,31,21,16,9,10,4,
                22,7,25,11,12,28,19,6,17,19,10,26,29,6,19,12,23,14,7,22,12,16,2,26,32,25,33,28,3,29,20,14,19,25,3,28,24,
                8,11,30,1,27,24,15,10,18,10,27,26,21,15,20,33,7,10,7,23,20,24,23,23,32,16,25,9,23,32,15,17,28,30,32,6,19,
                33,6,10,26,28,7,2,29,24,32,10,9,19,24,3,31,5,8,13,2,31,16,17,14,9,6,5,10,11,30,11,16,23,10,4,20,16,30,31,
                1,26,20,10,2,31,16,26,30,18,27,16,4,12,1,31,24,23,33,16,21,8,17,2,9,4,14,26,2,12,1,19,19,10,9,5,8,23,30,
                33,26,6,23,26,31,2,9,26,31,6,1,22,4,8,30,16,21,18,7,31,23,33,3,5,14,26,25,12,1,20,4,23,33,18,29,13,29,20,
                23,22,3,10,2,23,33,27,24,14,11,3,14,3,9,20,30,15,18,13,30,15,1,3,31,15,28,31,18,30,16,19,11,29,26,15,29,23,
                13,27,2,22,3,15,3,20,14,23,1,23,3,21,11,6,23,27,7,7,2,10,33,18,16,29,1,5,4,25,1,9,1,27,8,18,13,32,6,13,17,
                28,19,13,29,30,12,15,4,3,1,17,8,24,24,23,9,25,26,25,19,22,11,15,29,18,1,16,30,32,24,21,9,2,3,22,20,16,18,1,
                5,27,26,21,28,15,3,24,11,6,4,10,15,9,11,31,1,26,2,21,24,20,18,12,23,10,32,24,25,11,14,27,29,17,10,27,5,19,21,
                1,28,19,4,18,13,2,18,18,33,4,30,23,6,21,10,8,16,12,14,32,25,18,32,2,11,4,18,28,22,30,26,7,12,6,29,11,1,23,21,
                16,1,23,16,32,32,27,17,2,3,12,10,23,2,7,8,13,11,11,27,1,26,4,2,6,21,27,21,23,23,17,25,2,28,26,3,20,11,24,2,2,
                3,9,32,19,33,17,10,32,29,3,30,8,21,3,21,10,8,31,26,9,24,17,5,5,1,2,25,10,27,2,21,8,19,9,9,17,32,29,16,1,26,11,
                24,11,13,26,12,15,21,28,20,14,21,25,31,2,6,25,19,28,27,18,18,1,24,15,18,17,22,11,20,10,21,1,20,12,30,33,26,25,
                2,1,10,10,10,18,15,9,3,8,22,5,20,16,30,33,15,30,24,3,32,25,32,26,23,26,18,25,7,17,10,30,4,10,24,28,3,24,20,9,25,
                11,28,28,11,1,20,10,13,28,12,10,26,15,23,18,27,26,33,13,4,9,31,30,27,12,4,18,9,1,11,22,19,9,5,4,32,25,8,9,15,11,
                9,27,16,3,14,7,9,1,3,15,1,4,5,13,9,33,23,1,13,20,13,5,21,22,9,26,10,18,12,4,6,17,21,19,19,22,24,27,1,3,24,12,12,
                31,9,31,12,23,5,15,23,27,27,17,10,32,4,16,10,26,22,24,4,31,12,3,32,2,18,30,14,17,20,13,13,7,33,28,30,17,17,10,13,
                31,5,19,1,18,32,11,28,15,10,22,8,15,31,26,29,32,6,11,31,28,24,4,8,33,16,11,6,22,26,12,29,8,19,13,9,1,21,25,16,27,
                22,16,17,23,27,2,20,19,24,9,25,7,19,9,23,13,14,3,15,12,27,18,11,12,21,8,12,25,16,23,12,9,8,18,5,24,24,18,13,28,
                32,13,1,9,13,5,11,6,32,5,27,20,18,31,27,21,26,2,13,4,26,21,11,15,21,27,33,4,29,5,26,2,20,2,8,6,4,24,31,2,32,3,19,
                22,23,25,33,23,6,27,15,24,14,33,8,2,8,19,32,25,27,15,11,8,2,11,19,2,9,5,10,1,32,33,14,6,14,1,4,4,33,33,4,31,30,5,
                30,18,1,13,15,13,3,8,25,17,28,13,28,23,26,9,26,10,24,23,33,29,22,29,19,27,14,12,29,28,28,1,31,27,30,4,24,1,15,13,
                1,30,33,11,3,30,18,18,10,22,31,16,33,23,27,30,12,22,18,23,29,27,11,10,14,16,13,21,8,12,6,8,9,28,15,2,28,18,5,19,14,
                13,5,16,31,32,4,30,15,19,8,5,18,18,32,9,19,21,17,24,1,24,32,23,13,11,20,15,16,3,18,20,16,8,8,5,5,33,17,32,10,17,23,
                28,28,26,21,1,20,18,21,17,32,16,21,19,31,29,4,8,11,28,10,22,17,6,29,2,12,17,20,24,5,9,4,8,24,25,20,17,25,28,32,31,1,
                31,10,18,11,20,3,29,10,6,16,2,33,32,15,23,29,25,8,22,18,22,9,16,16,12,27,1,12,11,29,19,6,31,15,25,24,1,33,27,21,6,13,
                24,9,26,2,17,11,2,29,17,23,6,15,18,15,20,6,22,19,26,21,22,32,18,27,19,7,22,30,31,5,8,9,32,30,33,1,14,4,19,6,1,14,28,
                15,29,14,10,26,9,32,29,15,2,24,32,31,29,19,10,15,20,18,10,4,11,32,25,8,22,4,12,1,32,8,1,1,22,28,3,13,22,7,12,16,17,
                30,13,32,4,4,20,33,12,3,6,3,30,10,11,15,16,2,17,15,26,18,7,13,9,12,21,28,25,5,2,15,24,31,9,16,22,1,10,20,5,27,20,12,
                33,25,17,8,22,6,23,13,30,25,20,3,5,9,33,5,4,1,30,1,3,29,2,16,8,23,9,25,8,9,7,6,8,13,14,25,27,15,10,23,33,19,23,1,18,
                29,8,11,16,15,29,23,33,17,10,20,9,6,18,23,11,12,31,28,30,14,32,18,25,14,28,25,16,26,22,6,27,4,23,18,7,22,29,33,30,28,
                10,29,21,13,16,15,4,1,25,23,1,17,13,33,11,13,20,7,20,15,15,8,14,28,17,7,25,11,19,32,27,29,14,2,25,10,28,16,10,13,9,8,
                27,21,8,18,3,2,11,8,29,23,19,22,31,32,4,31,12,12,11,28,33,10,22,8,4,33,16,11,2,28,8,17,19,32,31,12,23,30,22,3,31,11,28,
                3,5,13,13,13,14,15,5,21,29,28,32,29,2,5,19,14,12,15,8,16,19,27,18,23,18,11,8,29,17,14,6,4,11,33,28,7,22,29,11,19,6,13,
                5,11,17,13,31,6,15,10,15,13,17,22,8,1,9,16,27,14,21,7,18,17,3,10,14,31,19,14,2,10,21,17,31,3,8,7,1,23,24,25,33,8,25,13,
                29,30,17,27,8,14,23,18,10,17,17,29,32,25,25,16,19,25,32,8,2,6,10,29,14,26,23,32,26,14,5,26,18,10,19,2,2,4,28,33,7,1,11,
                25,5,21,8,21,3,21,31,1,22,20,10,6,15,2,6,13,22,32,6,21,2,4,14,21,22,14,8,10,31,5,4,10,21,1,31,9,19,13,20,33,17,16,33,30,
                29,2,26,3,16,26,9,33,17,16,5,5,21,13,6,10,22,11,22,4,23,28,3,12,1,6,17,4,9,33,32,28,32,1,21,1,16,24,2,8,16,30,24,27,16,
                12,31,29,9,8,8,26,14,8,3,30,32,26,16,33,15,12,24,24,32,4,9,4,26,4,31,2,32,20,20,4,3,28,18,16,3,19,28,1,11,8,20,6,8,18,
                12,6,8,7,4,5,11,18,12,33,15,16,27,7,2,6,31,20,4,25,25,27,28,7,19,24,22,31,12,18,4,26,4,5,28,19,22,32,30,32,23,23,17,4,
                27,6,32,2,22,7,27,16,4,11,18,31,22,27,22,10,29,20,23,9,4,30,32,14,23,14,22,22,33,32,30,3,17,33,20,7,29,13,9,25,17,5,13,
                22,24,24,1,10,22,24,13,32,26,1,3,5,6,33,20,17,33,6,14,2,27,28,21,1,24,8,13,6,3,13,3,3,2,20,16,29,26,15,9,32,28,7,20,9,
                29,20,28,21,18,8,30,8,12,14,21,9,4,16,29,26,26,14,19,5,28,10,20,10,27,32,18,16,17,30,7,20,28,31,6,33,14,19,27,24,18,14,
                3,13,20,22,15,3,32,23,8,27,18,12,11,15,25,20,18,26,5,9,10,32,24,10,8,14,19,31,26,13,31,7,10,1,3,23,33,24,4,16,16,22,16,
                16,31,13,15,3,16,6,11,13,31,19,30,17,27,7,24,28,17,33,23,5,30,26,33,21,30,3,30,26,33,22,31,27,32,29,29,1,11,14,22,5,31,
                1,9,8,21,15,14,9,29,23,9,4,6,3,32,1,26,22,7,23,4,31,25,4,7,15,6,13,33,24,18,9,14,33,20,9,32,1,31,14,24,25,27,8,5,4,18,3,
                5,7,9,1,21,18,18,5,18,26,17,5,19,2,5,24,27,27,1,1,12,4,20,18,28,27,17,28,11,27,10,8,23,15,2,5,31,3,22,16,2,20,29,1,13,19,
                30,20,32,20,7,33,21,1,17,27,12,8,20,31,5,28,29,9,18,7,6,12,5,12,17,15,31,16,11,16,4,6,16,16,2,31,15,20,25,6,26,26,17,19,
                7,14,29,19,18,4,3,8,3,27,19,6,33,10,9,31,14,7,25,22,14,8,31,30,2,2,18,10,5,33,22,3,24,14,8,26,28,31,30,19,24,29,23,10,22,
                15,8,19,22,13,17,19,22,28,9,31,28,6,14,1,22,6,29,13,7,7,33,32,11,30,16,32,11,31,6,3,16,21,14,15,30,4,6,20,32,24,29,5,33,
                2,11,30,1,28,7,7,13,5,20,2,4,6,5,22,28,31,4,16,4,24,29,17,6,21,10,29,17,11,22,32,16,22,5,11,8,33,5,29,13,31,13,22,32,25,
                8,9,13,22,20,7,2,13,10,33,22,28,2,30,25,15,14,30,29,5,15,7,3,5,26,12,29,15,15,15,21,11,19,20,16,3,10,10,18,2,6,28,14,4,6,
                3,31,23,7,10,30,11,8,30,5,24,28,29,24,14,24,32,30,5,17,2,14,26,7,20,16,22,2,11,22,9,19,3,23,19,23,23,3,8,2,26,7,24,18,21,
                1,13,7,8,8,2,15,3,10,6,15,9,16,21,17,6,12,21,23,18,4,13,11,12,33,9,18,22,16,5,29,7,4,24,4,13,1,29,13,20,7,14,20,3,9,1,8,
                33,31,5,30,19,10,27,33,5,9,21,30,28,25,23,10,32,28,6,8,30,16,19,10,20,12,2,12,20,30,14,10,13,6,3,6,20,1,29,16,5,21,23,14,
                32,25,3,18,1,15,20,2,20,9,13,31,16,12,15,13,10,30,2,24,19,4,20,31,29,11,7,29,21,26,6,23,9,27,28,14,33,4,26,1,11,13,32,32,
                6,27,27,3,28,8,10,28,23,11,5,2,26,22,17,28,18,33,6,33,30,30,22,5,1,28,28,2,28,10,11,20,20,11,18,11,3,13,23,27,25,27,24,31,
                33,7,28,19,17,4,9,16,30,16,30,3,1,16,32,29,10,13,20,31,19,18,31,22,29,2,17,26,25,2,6,33,23,30,18,13,11,20,31,16,3,14,20,2,
                12,24,1,33,33,1,25,20,20,28,9,10,31,29,8,7,11,2,33,2,13,6,29,5,8,31,31,18,4,31,25,8,31,9,9,4,23,9,21,18,26,12,10,29,14,15,
                6,13,5,13,20,27,26,19,20,14,19,8,26,3,29,2,10,15,24,28,15,7,2,18,3,24,28,28,18,19,28,15,3,12,31,29,4,12,22,26,19,19,33,23,
                32,22,17,27,32,1,18,21,30,28,1,18,33,6,16,15,19,7,28,9,5,4,6,13,17,5,6,7,17,25,17,26,7,18,6,13,3,21,17,29,23,7,27,7,22,12,
                26,21,18,27,13,17,28,32,17,23,20,32,2,23,22,23,24,1,32,16,5,14,19,22,4,5,15,12,10,27,7,31,26,31,33,2,25,31,14,6,10,14,31,
                32,19,5,16,19,19,1,7,9,1,14,24,22,1,33,17,20,31,17,18,28,12,26,10,29,9,10,18,8,11,23,6,26,15,24,2,12,24,17,14,19,20,6,2,27,
                4,28,22,27,3,20,23,3,23,25,25,7,1,4,18,1,10,28,21,4,18,22,24,18,16,31,10,6,14,12,29,27,5,19,25,30,20,25,30,5,26,3,29,23,15,
                21,25,4,28,3,13,9,2,15,21,14,14,3,14,32,18,4,13,20,20,29,25,16,31,21,9,20,33,9,27,26,20,30,1,29,26,19,4,9,5,25,15,19,27,15,
                2,33,6,14,24,32,26,16,3,11,8,11,32,1,33,19,12,17,18,31,10,33,6,13,25,24,16,13,31,22,33,25,12,18,16,8,2,26,3,2,8,18,17,2,9,
                19,20,15,12,3,21,8,28,25,7,7,13,32,4,22,1,1,5,10,3,2,28,22,27,16,9,19,19,27,25,2,1,33,20,14,30,6,19,15,31,1,23,30,31,32,30,
                29,26,25,15,21,22,18,33,18,21,15,33,12,8,11,9,7,6,5,31,6,7,8,20,20,7,3,16,3,9,15,23,23,18,2,33,25,2,16,13,23,25,20,32,31,
                30,18,23,30,11,26,22,11,21,28,4,24,19,12,19,1,18,18,33,16,29,21,30,19,15,11,29,29,1,22,4,5,5,21,22,25,3,8,31,11,27,17,17,
                31,22,28,12,4,26,33,8,10,22,14,4,31,20,12,6,27,28,20,17,6,23,32,27,14,26,20,26,27,18,21,12,24,20,7,4,12,2,11,24,29,32,15,
                16,17,17,27,30,30,23,17,20,4,14,25,27,32,15,16,18,32,20,17,23,3,8,30,21,24,23,4,11,7,15,1,5,11,22,21,7,12,10,13,31,21,33,
                1,13,15,10,12,27,31,6,22,7,22,16,10,3,29,13,27,27,19,2,23,20,25,21,16,28,13,25,29,9,28,15,8,28,31,25,18,20,4,33,12,22,6,32,
                29,27,25,6,22,3,12,19,12,28,8,25,17,14,3,19,11,31,2,14,33,4,14,30,12,5,7,31,26,2,12,3,30,18,28,18,2,8,6,15,18,9,21,24,25,5,
                19,31,6,26,16,9,10,33,12,18,26,1,30,10,28,14,5,32,8,17,1,23,16,13,16,29,1,18,22,30,31,32,26,5,18,3,6,12,17,31,7,14,7,8,16,7,
                29,23,13,32,23,27,5,10,4,19,32,12,7,7,3,28,19,10,32,28,17,31,24,17,23,5,3,21,16,5,33,26,7,1,31,28,26,6,30,33,13,32,16,13,11,
                29,26,15,29,11,10,14,15,14,6,13,13,6,30,18,26,26,4,32,30,4,29,11,8,8,1,26,14,9,30,5,11,20,3,19,21,6,17,30,24,32,10,31,14,31,
                20,21,1,5,19,23,1,26,2,27,23,8,26,2,11,21,10,18,1,17,15,32,14,4,5,21,32,16,19,7,12,15,27,19,12,24,18,19,30,33,24,3,13,18,28,
                8,10,9,9,12,32,10,12,24,12,18,26,8,10,18,7,1,24,27,17,9,10,28,17,3,24,24,19,29,21,7,32,9,17,16,19,29,32,18,4,18,16,31,29,13,
                31,15,27,32,26,18,32,2,29,30,24,14,7,31,16,17,12,5,14,3,25,30,11,27,17,29,19,22,16,20,10,6,2,31,19,28,11,32,12,9,14,15,28,
                19,13,21,25,3,27,18,3,4,23,6,26,22,25,3,2,12,16,18,23,28,2,15,20,7,23,15,14,23,11,32,5,29,29,14,19,1,33,16,8,28,3,26,5,14,
                9,19,30,4,20,10,13,1,3,1,21,31,29,27,7,32,21,10,17,19,6,21,19,9,11,30,18,29,1,5,21,27,33,11,6,2,33,4,24,4,9,9,15,2,24,15,32,
                28,26,6,4,3,18,29,13,28,7,24,12,17,17,26,31,9,15,27,30,25,29,15,14,6,27,7,18,3,12,16,15,16,18,10,10,26,2,22,6,24,19,14,18,
                26,17,29,33,4,16,12,19,22,19,21,24,26,19,9,18,29,33,23,6,24,32,22,14,32,27,22,10,1,14,30,32,13,3,4,27,13,23,24,2,32,16,28,6,
                29,18,32,8,27,8,33,19,3,24,22,7,3,27,4,21,18,15,27,18,31,10,23,18,27,1,33,25,7,2,28,3,4,9,3,1,31,10,16,23,20,22,30,13,17,21,
                30,22,29,25,5,24,2,31,22,12,25,1,29,1,24,25,29,17,23,25,16,18,7,6,24,25,26,20,15,12,3,4,9,20,19,17,17,24,2,19,19,6,17,23,7,
                6,14,14,15,29,21,33,1,19,18,9,32,28,16,14,33,12,4,22,25,4,19,1,29,5,21,17,4,11,1,32,28,17,2,19,30,26,8,31,26,32,6,13,3,7,33,
                17,32,27,26,15,2,28,3,21,20,14,33,8,19,33,19,32,23,2,14,18,6,14,28,9,24,32,31,32,20,9,16,21,8,17,20,17,26,1,17,11,24,25,29,
                14,16,24,3,33,6,25,16,21,23,24,2,7,27,18,25,19,25,10,19,11,6,32,8,5,4,5,18,6,24,8,11,12,22,4,18,24,4,32,12,1,5,13,9,1,18,32,
                31,20,30,11,9,19,7,30,26,24,21,16,33,23,2,24,6,12,2,9,26,24,25,11,32,7,6,19,1,32,5,27,20,6,14,1,25,17,13,24,27,21,25,15,22,
                14,27,3,2,2,16,25,31,31,30,24,9,20,29,31,21,1,16,32,9,24,31,3,21,33,9,20,30,7,30,28,33,14,8,33,14,23,23,32,30,3,8,30,31,33,
                14,32,28,7,18,2,17,30,22,18,14,22,24,20,2,7,30,31,22,10,32,30,31,14,4,11,16,1,3,26,3,9,32,5,11,19,32,32,11,7,17,29,26,8,16,
                13,17,23,27,24,16,19,13,15,30,19,12,14,9,12,31,15,19,4,12,17,8,17,28,3,27,13,5,23,30,27,30,33,33,27,2,11,28,31,5,17,14,23,28,
                9,11,24,21,10,24,28,15,24,26,26,22,16,3,22,24,20,31,10,3,33,11,23,14,4,16,22,15,31,13,11,19,29,8,5,22,33,26,16,29,18,11,13,
                19,28,29,13,3,30,24,23,33,11,28,24,22,19,29,23,33,32,18,19,21,4,19,17,24,22,33,4,5,29,7,5,32,11,4,13,15,14,19,22,9,13,24,1,
                22,10,30,26,13,18,10,4,27,30,5,29,18,13,2,21,5,24,26,23,6,21,28,7,6,2,24,28,31,25,11,14,7,1,33,24,29,3,30,21,23,2,31,23,9,9,
                16,14,16,3,31,24,10,25,15,15,30,5,25,19,19,30,11,20,3,23,13,33,33,8,18,25,29,27,17,4,29,11,27,26,9,21,23,9,1,25,16,26,25,17,
                22,2,3,22,32,21,1,22,26,3,17,12,26,32,5,1,25,33,13,2,12,29,1,32,3,27,20,27,16,25,3,10,33,32,29,29,9,27,9,12,10,11,5,5,8,7,15,
                3,3,17,9,13,22,20,27,33,27,1,30,20,15,27,11,12,18,6,1,2,27,26,8,32,21,1,14,8,33,13,11,31,12,18,13,29,3,22,13,22,17,14,30,9,30,
                25,19,13,25,33,10,9,5,32,28,23,26,10,18,13,26,13,2,32,27,21,33,27,21,1,19,19,5,2,30,14,11,19,32,16,7,9,23,20,25,16,12,26,29,
                11,1,16,6,12,8,11,1,30,33,6,19,19,23,10,17,29,6,2,16,13,8,12,32,15,26,20,11,9,33,22,18,18,26,3,7,4,17,31,5,1,24,16,14,27,29,
                18,6,13,3,27,24,29,13,11,30,17,17,20,10,25,2,8,32,25,5,15,27,31,16,17,14,25,15,33,20,10,1,28,1,16,28,22,9,20,12,32,15,27,20,
                22,13,32,11,16,22,8,28,13,27,10,15,2,31,7,33,15,32,16,6,16,23,17,15,18,8,33,32,26,28,1,11,17,18,19,16,7,22,9,5,9,22,24,14,13,
                5,17,16,27,27,2,16,3,10,29,24,33,4,15,17,7,18,24,3,31,9,8,31,6,20,21,13,10,7,24,11,33,12,16,5,23,25,2,16,33,11,25,33,11,22,12,
                15,32,12,17,7,23,32,19,9,20,7,7,23,32,22,11,13,10,20,31,32,2,31,32,32,18,25,8,30,10,11,19,4,29,14,21,5,6,13,24,21,13,26,15,32,
                23,15,12,23,4,17,31,25,32,13,13,22,33,16,9,30,11,21,32,3,26,5,9,1,1,14,8,27,16,20,7,9,14,3,15,10,12,33,33,24,21,3,27,9,29,5,23,
                26,29,32,11,31,31,15,6,31,21,32,3,19,7,30,3,9,26,24,11,22,19,33,27,26,26,29,29,25,7,4,26,23,18,31,1,15,6,27,3,24,27,11,23,9,22,
                6,31,28,16,18,24,3,2,14,12,22,21,28,21,29,17,30,3,7,13,14,13,20,29,15,21,23,8,31,6,7,1,5,32,31,30,22,31,29,17,12,28,20,23,21,
                21,26,23,22,4,16,30,32,1,28,25,12,29,8,25,22,18,13,26,6,8,1,16,1,21,32,1,14,10,16,12,5,23,7,16,21,18,27,9,22,2,31,12,2,10,5,
                17,8,25,26,6,13,25,27,9,23,26,1,3,26,32,31,3,14,12,32,30,5,11,14,12,18,26,31,23,13,18,27,29,18,29,17,20,28,25,26,14,8,12,10,
                12,10,8,17,28,7,9,10,22,23,16,13,14,4,27,6,25,13,20,11,6,6,28,31,9,26,26,22,26,33,31,19,28,26,18,26,22,24,11,25,2,31,11,5,18,
                29,30,1,7,8,27,27,12,4,18,6,18,23,14,28,13,1,19,31,11,29,31,6,26,12,11,24,27,10,17,30,32,14,26,29,20,33,15,3,30,29,33,12,18,
                4,33,26,2,3,11,15,10,3,11,10,19,10,7,19,21,33,8,10,14,32,8,21,29,13,3,17,19,28,12,1,24,27,26,18,9,1,11,26,7,15,30,19,14,27,
                18,3,13,13,28,13,31,16,1,25,13,12,21,25,25,16,8,16,31,8,21,29,12,19,21,15,25,31,25,24,32,33,18,27,14,13,10,27,7,1,18,22,12,
                24,21,32,9,12,26,9,9,4,6,12,21,6,1,28,27,16,24,9,20,3,4,16,31,17,27,20,22,26,25,20,4,10,10,25,5,24,1,31,26,14,30,30,28,25,2,
                11,30,25,25,9,13,16,28,21,6,11,14,18,7,27,33,22,16,22,12,9,1,5,12,29,31,3,12,21,32,25,9,21,24,7,26,18,17,3,23,18,1,20,9,7,5,
                25,17,11,6,22,14,4,4,11,12,15,33,30,17,33,21,24,22,17,33,12,5,25,28,26,13,7,21,19,16,29,28,15,12,16,33,12,27,29,7,22,6,31,22,
                26,14,29,13,13,30,5,29,6,17,1,19,31,8,22,10,19,6,13,3,5,10,6,19,8,20,15,29,11,7,14,10,31,8,13,4,30,28,7,11,11,13,20,9,15,10,
                27,10,3,12,5,29,16,2,14,29,25,9,8,14,29,11,13,13,5,5,6,22,17,12,19,17,32,4,19,29,23,10,21,22,11,29,22,9,19,30,26,7,10,12,6,7,
                17,24,13,12,8,31,15,10,5,31,22,31,23,17,4,9,12,29,24,27,20,5,11,25,6,1,19,9,19,28,24,4,20,23,8,14,33,29,19,1,33,33,10,15,16,
                16,2,22,10,1,5,17,33,13,25,32,13,29,30,11,17,8,15,26,25,19,14,31,18,4,28,21,1,15,11,20,13,9,33,7,28,22,26,26,9,8,13,26,3,27,
                30,10,4,18,23,14,27,24,1,25,22,32,14,4,19,3,14,15,15,27,25,18,19,10,33,1,24,14,30,5,18,28,23,16,33,21,23,28,4,3,26,11,14,3,33,
                20,24,24,15,18,14,31,5,8,31,12,3,26,13,10,8,17,20,2,27,12,10,13,2,17,20,10,21,7,20,23,1,32,13,30,1,10,28,6,9,19,6,32,32,23,32,
                10,32,13,24,31,18,17,16,30,33,7,32,5,29,20,23,20,33,10,32,30,12,21,20,20,9,33,24,7,3,31,13,3,31,1,19,29,16,22,2,28,27,6,3,21,
                11,2,7,4,16,14,29,27,3,8,23,14,30,9,10,8,25,20,12,11,22,24,33,25,6,4,11,1,9,14,1,16,24,33,27,14,29,11,26,31,20,29,7,4,5,32,13,
                3,13,26,32,31,8,19,16,7,15,16,33,22,7,33,2,7,23,4,33,29,27,19,6,4,18,10,30,11,3,11,15,25,13,3,17,1,18,3,10,31,9,28,26,8,13,20,
                4,6,8,9,3,23,32,24,18,29,1,28,24,32,8,30,17,9,4,22,7,1,11,27,12,30,17,16,5,13,3,21,17,25,8,29,20,11,1,7,14,24,30,19,13,16,23,
                31,18,30,27,26,14,20,8,6,8,7,6,26,20,15,26,19,19,12,4,31,16,17,17,29,17,29,33,15,32,28,10,18,3,11,24,31,30,13,6,14,13,21,18,17,
                5,5,29,29,19,8,33,1,31,13,22,23,20,13,19,10,25,28,14,25,21,14,21,19,9,11,7,18,3,28,12,24,15,28,25,31,26,9,23,12,5,4,25,19,16,
                12,25,24,28,27,18,24,3,29,18,27,2,16,24,15,13,7,8,33,12,30,13,32,20,25,28,29,22,1,27,13,32,23,5,9,25,3,17,12,28,27,24,9,13,11,
                31,27,11,33,26,31,13,24,21,5,4,19,31,5,1,23,32,16,6,10,14,10,16,21,32,1,25,32,22,5,23,4,12,13,8,20,4,12,22,2,19,24,26,8,30,18,13,
                2,33,7,23,14,33,33,19,13,33,26,21,24,19,8,23,11,22,24,10,15,25,9,25,12,14,27,13,5,2,16,33,20,11,8,15,20,31,26,2,18,16,26,32,24,8,
                15,5,2,28,10,8,2,30,17,18,15,29,4,8,26,22,15,1,16,23,1,17,22,17,17,19,21,22,28,1,8,23,32,7,33,13,33,10,20,8,32,11,17,29,16,19,1,1,
                23,29,5,31,8,1,10,1,23,7,2,27,18,27,18,31,11,30,28,28,33,23,8,31,4,3,28,6,31,22,2,24,29,25,25,21,6,10,28,1,22,28,26,1,13,17,17,24,
                18,27,6,30,20,25,5,31,19,12,18,8,22,32,20,22,19,8,16,27,2,29,20,30,30,7,18,27,22,13,6,16,32,32,33,19,22,22,16,18,31,8,15,16,30,32,
                30,2,19,33,12,12,23,19,19,5,26,26,21,19,24,25,24,12,21,26,29,31,5,8,8,26,29,24,27,28,18,13,5,5,24,20,15,4,30,20,14,2,3,1,14,24,24,3,
                32,28,24,2,19,21,23,6,33,4,4,4,10,24,29,32,29,17,10,29,20,27,21,20,5,7,24,26,2,17,8,11,11,16,25,29,2,19,20,32,18,25,7,30,15,33,26,
                22,12,27,4,12,9,20,14,15,10,4,14,8,17,3,25,10,1,23,22,31,5,13,7,15,26,6,10,4,15,8,9,10,16,12,27,28,29,2,20,27,7,30,8,18,1,17,23,26,
                18,29,7,2,18,24,13,29,6,15,1,13,5,20,19,9,18,8,3,4,10,19,17,31,30,9,12,1,10,19,13,19,7,30,29,17,22,21,32,4,25,25,31,11,1,18,25,12,
                27,16,16,23,25,13,20,7,12,23,14,4,2,29,18,23,11,5,13,9,20,15,16,24,28,33,29,5,23,1,28,25,3,30,11,28,7,17,20,31,5,17,22,33,30,8,1,6,
                29,27,19,23,23,3,26,26,26,14,25,10,6,22,9,7,5,27,13,9,24,33,4,26,27,12,10,24,28,5,7,8,22,17,9,31,10,11,25,33,25,28,8,27,16,2,6,6,23,
                28,3,13,19,9,5,22,9,28,32,10,24,13,27,2,31,25,1,26,4,7,11,27,21,19,15,22,26,8,28,15,16,32,20,19,32,6,30,28,25,18,8,29,19,24,5,33,10,
                9,23,31,16,14,17,25,2,2,30,18,31,22,23,6,5,27,1,25,32,18,3,12,28,14,14,18,24,10,22,22,29,12,6,11,32,3,2,30,3,20,20,31,3,4,33,21,15,
                24,25,15,18,3,1,22,31,17,12,17,25,16,25,18,26,19,31,21,12,20,13,26,2,7,19,27,24,13,22,14,6,30,8,16,13,27,5,7,29,24,2,21,27,15,3,3,9,
                26,23,14,14,3,18,1,22,17,31,32,13,17,2,19,28,15,25,25,12,4,9,16,15,11,8,9,12,29,24,13,27,10,18,11,33,13,7,14,9,1,17,21,24,7,33,11,18,
                18,5,28,26,11,30,24,12,30,18,15,11,33,9,33,18,26,18,18,12,8,26,20,14,25,29,17,13,21,7,21,8,14,14,19,12,8,30,14,14,6,1,12,9,17,13,7,8,
                29,6,32,18,2,32,26,3,8,15,21,18,31,8,17,16,15,21,29,19,10,22,20,7,10,14,12,30,23,32,17,29,6,13,22,25,3,18,1,20,26,32,11,19,20,26,11,
                10,28,9,12,1,29,6,17,31,29,28,3,7,13,16,21,33,9,9,25,11,21,32,22,27,4,18,27,5,11,32,30,16,16,17,8,3,32,6,13,31,6,11,5,4,29,22,25,33,
                31,1,12,28,10,7,9,2,7,32,8,23,26,30,17,27,7,25,25,2,26,30,14,15,15,23,6,28,9,32,16,10,17,9,24};
        int K = 3772;

        int res = solution.numSubarrayProductLessThanK(data, K);

        assertEquals(22126, res);
    }

    @Test
    public void tt001() {
        int[] data = {10, 5, 2, 6};

        Arrays.stream(Arrays.copyOfRange(data, 0, 4)).forEach(x -> System.out.print(x + ", "));
    }
}
