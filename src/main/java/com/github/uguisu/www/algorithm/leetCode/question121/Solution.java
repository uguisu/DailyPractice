/**
 * 121.Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * 
 * [思路]因为只关注一支股票，所以直接查找最低点和最高点就可以了
 */
package com.github.uguisu.www.algorithm.leetCode.question121;

public class Solution {
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
}
