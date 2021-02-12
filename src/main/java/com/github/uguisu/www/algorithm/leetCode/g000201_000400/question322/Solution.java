package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question322;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {

        // verify
        if(null == coins || 0 == coins.length)
            return -1;

        // init
        int[] dp = new int[amount + 1];

        // 注意，不能随意设置最大值！Integer.MAX_VALUE反而会导致内存溢出 => Integer.MAX_VALUE - amount - 1
        // Arrays.fill(dp, Integer.MAX_VALUE);
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for(int i = 1; i < amount + 1; i++) {
            for(int coin : coins) {
                if (coin <= i)
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
