/**
 * 172.Factorial Trailing Zeroes
 * 
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * [思路1] 任何数字都能够分解成为质数，当2*5的时候，就会在末尾出现"零"。
 * 只要有偶数就能分解出"2"，因此，能够分解出"5"才是关键。
 * 考虑到25(5^2)/125(5^3)/625(5^4)这种5的n次方的情况，这种情况会分理处更多的"5"。
 * 因此，问题转化成了 return n / 5 + n / 25 + n / 125 + n / 625 + n / 3125 + .....
 * 但遗憾的是，5^14 超过了Integer.MAX_VALUE，因此改用double类型的变量替换int类型的变量。
 * 
 * Integer.MAX_VALUE = 2,147,483,647
 * Double.MAX_VALUE  = 1.7976931348623157E308
 * 
 * [思路2]网上看来的思路，核心思想就是不断按照5来分组，直到无法再分为止。
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question172;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		System.out.println(s.trailingZeroes(1808548329));
		System.out.println(s.trailingZeroes1(1808548329));
	}
	
	/**
	 * trailingZeroes
	 * @param n
	 * @return
	 */
    public int trailingZeroes(int n) {
        int rtn = 0;
        // verify
        if(0 == n) {
            // 0! = 0
            return 0;
        }
        // int intwrk = 5;
        double intwrk = 5;
        while( (int)(n / intwrk) > 0 ) {
            rtn += (n / intwrk);
            intwrk *= 5;
            // System.out.println(intwrk);
        }
        return rtn;
    }
    
	/**
	 * trailingZeroes
	 * @param n
	 * @return
	 */
    public int trailingZeroes1(int n) {
        int c = 0;
        while (n >= 5) {
            n /= 5;
            c += n;
        }
        return c;
    }
}
