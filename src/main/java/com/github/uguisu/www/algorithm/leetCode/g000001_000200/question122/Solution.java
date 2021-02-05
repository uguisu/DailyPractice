/**
 * 122.Best Time to Buy and Sell Stock II
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * 
 * [思路]重点是将各个时间点进行分段，累加各个上升区间的价格差。
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question122;

public class Solution {
    public int maxProfit(int[] prices) {
        
        // check
        if(null == prices || prices.length == 0) return 0;
        if(prices.length == 1) return 0;
        
        int intMinPrice = prices[0];
        int intMaxProfit = 0;
        int intProfitAmount = 0;
        
        for(int i = 1; i < prices.length; i++) {
            // verify if the array is increasing
            if(prices[i - 1] <= prices[i]) {
                // 1) increasing
                
                // get min price
                intMinPrice = Math.min(intMinPrice, prices[i]);
                // calculate profile
                intMaxProfit = Math.max(intMaxProfit, prices[i] - intMinPrice);
            } else {
                // 2) decreasing
                
                intProfitAmount += intMaxProfit;
                
                intMaxProfit = 0;
                intMinPrice = prices[i];
            }
            
        }
        
        intProfitAmount += intMaxProfit;
        
        return intProfitAmount;

    }
}