/**
 * 123.Best Time to Buy and Sell Stock III
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 *[思路] 原本认为是连续分段问题，但是条件限制：最多仅能买卖两次，导致按照一般的分段计算方式失效。
 * 原因：最大利润可能跨过一个“峰谷”区间才出现。
 * 从左到右，用最低价格计算出，最低价格到各个高点时候的利润，放数组里。
 * 从右至左，用最高价格计算出，最高价格到各个地点时候的利润，放数组里。
 * 将两次得到的数据进行累加，即为最佳组合。
 *
 * 例：input = {1,  2,  4,  2,  5,  7,  2,  4,  9,  0}
 *
 *     M1 =  0,  1,  3,  3,  4,  6,  6,  6,  8,  8   (最低价格算出的利润)
 *
 *     M2 =  8,  7,  7,  7,  7,  7,  7,  5,  0,  0   (最高价格算出的利润)
 *
 * 加总   =  8,  8, 10, 10, 11, 13, 13, 11,  8,  8
 *
 * 根据汇总的结果可知，最大利润的组合为{1,  2,  4,  2,  5,  7} + {2,  4,  9,  0}
 *
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question123;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();

		int[] in = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
		System.out.println(s.maxProfit(in));
	}

    public int maxProfit(int[] prices) {

        // check
        int N = prices.length;
        if(null == prices || N == 0) return 0;

        int[] intMinPriceProfit = new int[N];
        int[] intMaxPriceProfit = new int[N];

        // Calculate minPrice from left to right
        intMinPriceProfit[0] = 0;
        int intMinPrice = prices[0];
        for(int i = 1; i < N; i++) {
            // Get min price
            intMinPrice = Math.min(intMinPrice, prices[i]);
            // Calculate intMinPriceProfit
            intMinPriceProfit[i] = Math.max(intMinPriceProfit[i - 1], prices[i] - intMinPrice);
        }

        // Calculate maxPrice from right to left
        // [注意] 不能随便的给一个变量赋于Integer.MIN_VALUE这样的初值；除非这个变量在后面的运算中将会被赋予正确的值。
        // intMaxPriceProfit[N - 1] = Integer.MIN_VALUE 将导致错误
        intMaxPriceProfit[N - 1] = 0;
        int intMaxPrice = prices[N - 1];
        for(int i = N - 1 - 1; i >= 0; i--) {
            // Get max price
            intMaxPrice = Math.max(intMaxPrice, prices[i]);

            // Calculate intMaxPriceProfit
            intMaxPriceProfit[i] = Math.max(intMaxPriceProfit[i + 1], intMaxPrice - prices[i]);
        }

        int RTN = 0;
        for(int i = 1; i < N; i++) {
            RTN = Math.max(RTN, intMinPriceProfit[i] + intMaxPriceProfit[i]);
        }

        return RTN;
    }
}
