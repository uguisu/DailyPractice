package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question389;

public class Solution {

    /**
     * Runtime: 1 ms, faster than 98.90% of Java online submissions for Find the Difference.
     * Memory Usage: 37.4 MB, less than 68.98% of Java online submissions for Find the Difference.
     */
    public char findTheDifference(String s, String t) {
        // verify
        if(null == s || "".equals(s))
            return t.charAt(0);

        int[] dict = new int[26];
        char wC;

        for(int i = 0; i < s.length(); i++) {

            // 找到字典的相应位置进行加算
            wC = s.charAt(i);
            dict[wC - 'a']++;
            // 找到字典的相应位置进行减算
            wC = t.charAt(i);
            dict[wC - 'a']--;
        }

        // t 比 s 多一个字符
        wC = t.charAt(t.length() - 1);
        dict[wC - 'a']--;

        char rtn = 'a';

        // 遍历字典，找到不为零的位置
        for(int i = 0; i < dict.length; i++) {
            if(0 != dict[i]) {
                rtn += i;
                break;
            }
        }

        return rtn;
    }

    /**
     * Runtime: 1 ms, faster than 98.90% of Java online submissions for Find the Difference.
     * Memory Usage: 37.2 MB, less than 88.94% of Java online submissions for Find the Difference.
     */
    public char findTheDifference2(String s, String t) {
        // verify
        if(null == s || "".equals(s))
            return t.charAt(0);

        int counter = 0;
        // char wC;
        for(int i = 0; i < s.length(); i++) {
            counter = counter + s.charAt(i) - t.charAt(i);
        }

        // t 比 s 多一个字符
        counter = counter - t.charAt(t.length() - 1);

        return (char) (counter * -1);
    }
}
