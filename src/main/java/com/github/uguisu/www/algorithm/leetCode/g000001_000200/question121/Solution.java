/**
 * 121.Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * 
 * [思路]因为只关注一支股票，所以直接查找最低点和最高点就可以了
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question121;

public class Solution {

    /**
     * 最大最小值算法
     */
    public int maxProfit(int[] prices) {
        
        // check
        if(null == prices || prices.length == 0) return 0;
        if(prices.length == 1) return 0;

        int intMinPrice = prices[0];
        int intMaxProfit = 0;
        
        for(int intP = 1; intP < prices.length; intP++) {
            // Get min price
            intMinPrice = Math.min(intMinPrice, prices[intP]);
            // Cal max profile
            intMaxProfit = Math.max(intMaxProfit, prices[intP] - intMinPrice);
        }
        
        return intMaxProfit;
    }

    /**
     * 按照DP思路
     * Runtime: 4 ms, faster than 16.02% of Java online submissions for Best Time to Buy and Sell Stock.
     * Memory Usage: 54.9 MB, less than 13.66% of Java online submissions for Best Time to Buy and Sell Stock.
     */
    public int maxProfit_dp(int[] prices) {

        // verify
        if(null == prices || 0 == prices.length)
            return 0;

        // init
        int len = prices.length;
        int minVal = prices[0];

        int[] dp = new int[len];
        dp[0] = 0;

        for(int i = 1; i < len; i++) {

            // 记录最小值
            minVal = Math.min(minVal, prices[i]);

            if(prices[i - 1] > prices[i]) {
                dp[i] = dp[i - 1];
                continue;
            }

            // 找最小的
            dp[i] = Math.max(dp[i - 1], prices[i] - minVal);
        }

        return dp[len - 1];
    }
}
