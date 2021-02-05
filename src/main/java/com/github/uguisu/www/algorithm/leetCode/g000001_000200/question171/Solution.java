/**
 * 171.Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * 
 * [思路]数论问题。
 *    5 = 10 ^ 0 * 5
 *   15 = 10 ^ 1 * 1 + 10 ^ 0 * 5
 *  125 = 10 ^ 2 * 1 + 10 ^ 1 * 2 + 10 ^ 0 * 5
 *  同理，Excel的单元格坐标也就是26进制的字母表示.
 */
package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question171;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();

		String strIn = "A";

		System.out.println(s.titleToNumber(strIn));

	}

	public int titleToNumber(String s) {
		int rtn = 0;

		// verify
		if (null == s || "".equals(s.trim()))
			return 0;

		// Static ascii string
		String ASCII = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int BASE = 26;
		String strS = s.toUpperCase();
		int inWrk = 0;

		for (int i = 0; i < strS.length(); i++) {

			inWrk = ASCII.indexOf(strS.substring(strS.length() - (i + 1),
					strS.length() - i));
			if (-1 == inWrk) {
				// find no ascii char
				return 0;
			} else {
				rtn = rtn + (int) Math.pow(BASE, i) * inWrk;
			}
		}

		return rtn;
	}

	/**
	 * 网上看来的解决方案，与我的代码本质的区别在于使用charAt() 代替indexOf()
	 */
	public int titleToNumber1(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}
}
