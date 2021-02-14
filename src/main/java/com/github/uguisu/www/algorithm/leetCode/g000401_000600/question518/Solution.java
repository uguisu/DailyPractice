package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question518;

public class Solution {

    /**
     * 完全背包的思路
     */
    public int change_001(int amount, int[] coins) {

        // verify
        if(0 == amount)
            return 1;
        if(null == coins || 0 == coins.length)
            return 0;

        // init
        int coinAmount = coins.length;
        int[][] dp = new int[amount + 1][coinAmount +1];

        for(int j = 1; j < coinAmount + 1; j++) {
            dp[0][j] = 1;
        }

        // 金额
        for(int i = 1; i < amount + 1; i++) {
            // 硬币
            for(int j = 1; j < coinAmount + 1; j++) {

                if(i >= coins[j - 1]) {
                    // 不需要加入当前硬币就可以凑足要求的面额 + 加入当前硬币以后正好凑足要求的面额
                    dp[i][j] = dp[i][j - 1] + dp[i - coins[j - 1]][j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }

            }
        }

        return dp[amount][coinAmount];
    }

    /**
     * 使用爬楼梯问题的思路
     * （效果更好）
     */
    public int change(int amount, int[] coins) {

        // verify
        if(0 == amount)
            return 1;
        if(null == coins || 0 == coins.length)
            return 0;

        // init
        int coinAmount = coins.length;
        int[] dp = new int[amount + 1];

        dp[0] = 1;

        // 硬币
        for(int j : coins) {
            // 金额
            for(int i = 1; i < amount + 1; i++) {

                if(i - j >= 0)
                    dp[i] += dp[i - j];

            }
        }

        return dp[amount];
    }
}
