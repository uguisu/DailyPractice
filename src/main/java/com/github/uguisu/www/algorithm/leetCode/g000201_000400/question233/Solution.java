/**
 * 233.Number of Digit One
 * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 * For example:
 * Given n = 13,
 * Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.
 * 
 * [思路1] http://blog.csdn.net/xudli/article/details/46798619
 * 每10个数, 有一个个位是1, 每100个数, 有10个十位是1, 每1000个数, 有100个百位是1.  做一个循环, 每次计算单个位上1得总个数(个位,十位, 百位)
 * 例子:
 * 以算百位上1为例子:   假设百位上是0, 1, 和 >=2 三种情况:
 *   case 1: n=3141092, a= 31410, b=92. 计算百位上1的个数应该为 3141 *100 次.
 *   case 2: n=3141192, a= 31411, b=92. 计算百位上1的个数应该为 3141 *100 + (92+1) 次.
 *   case 3: n=3141592, a= 31415, b=92. 计算百位上1的个数应该为 (3141+1) *100 次.
 *   以上三种情况可以用 一个公式概括:
 *     (a + 8) / 10 * m + (a % 10 == 1) * (b + 1);
 *     --------           -------------
 *       {1}                  {2}
 *       
 *     {1} 加8是为了0，1两种情况，2的时候进位；
 *     {2} 判断当前为是否为1，为了cover case2的那种情况
 *     
 * [思路2] 百位上的数字，百位以下（低位）的数字，百位（更高位）以上的数字.
 *    如果百位上的数字为0，则可以知道，百位上可能出现1的次数由更高位决定;
 *    如果百位上的数字为1，则可以知道，百位上可能出现1的次数不仅受更高位影响，还受低位影响，也就是由更高位和低位共同决定;
 *    如果百位上数字大于1（即为2~9），则百位上可能出现1的次数也仅由更高位决定.
 *  这个方法只要分析N就可以得到f（N），避开了从1到N的遍历，输入长度为Len的数字N的时间复杂度为O（Len），即为O（ln（n）/ln（10）+1）
 */
package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question233;

public class Solution {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.countDigitOne(121));
		System.out.println(s.countDigitOne1(121));
	}

	/**
	 * http://blog.csdn.net/xudli/article/details/46798619
	 */
	public int countDigitOne(int n) {
		int ones = 0;
		for (long base = 1; base <= n; base *= 10) {
			long a = n / base, b = n % base;
			ones += (a + 8) / 10 * base;
			if (a % 10 == 1)
				ones += b + 1;
		}
		return ones;
	}
	
	/**
	 * http://blog.csdn.net/sunnyyoona/article/details/46943643
	 */
	public int countDigitOne1(int n) {
		int rtn = 0;
		
		// 低位部分
		int intLow = 0;
		// 当前位
		int intCur = 0;
		// 高位部分
		int intHigh = 0;
		// Base
		int base = 1;
		// work
		int num = n;
		
		while (num > 0) {
			intLow = n - num * base;
			intCur = num % 10;
			intHigh = num / 10;

			if (0 == intCur) {
				// 如果为0则这一位1出现的次数由更高位决定 (更高位数字*当前位数)
				rtn += intHigh * base;
			} else if (1 == intCur) {
				// 如果为1则这一位1出现的次数不仅受更高位影响还受低位影响(更高位数字*当前位数+低位数字+1)
				rtn += (intHigh * base + (intLow + 1));
			} else {
				// 大于1则仅受更高位影响, 外加当前位置上已经出现过的1 (更高位数字 * 当前位数 + 当前位数)
				rtn += (intHigh * base + base);
			}

			base *= 10;
			num /= 10;
		}
		
		return rtn;
	}
}
