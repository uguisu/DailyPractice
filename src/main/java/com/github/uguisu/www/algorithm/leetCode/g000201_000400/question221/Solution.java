package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question221;

public class Solution {

    public int maximalSquare(char[][] matrix) {

        int h = matrix.length;
        int w = matrix[0].length;

        //verify
        if(1 == h && 1 == w) {
            // 只有一个元素
            return ('0' == matrix[0][0]) ? 0 : 1;
        }

        // init
        int[][] dp = new int[h + 1][w + 1];
        int counter = 0;
        int top = 0;
        int left = 0;
        int topLeft = 0;

        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= w; j++) {

                if('0' == matrix[i - 1][j - 1])
                    // not a square
                    continue;

                top = dp[i - 1][j];
                left = dp[i][j - 1];
                topLeft = dp[i - 1][j - 1];

                dp[i][j] = Math.min(topLeft, Math.min(top, left)) + 1;

                // accumulate
                counter = Math.max(counter, dp[i][j]);
            }
        }

        return counter * counter;
    }
}
