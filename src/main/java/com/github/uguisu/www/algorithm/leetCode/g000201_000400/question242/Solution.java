package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // check NULL & Space
        if(null == s && null == t) return true;
        if("".equals(s) && "".equals(t)) return true;
        if((null != s && null == t) || (null == s && null != t)) return false;
        
        // 1) verify length
        if(s.length() != t.length()) return false;
        // 2) verify chars
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        // [思路]当字符串比较长的时候，循环会很慢。可以整体把握的时候应该整体把握。
//        for(int i = 0; i < s.length(); i++) {
//            if(s1[i] != t1[i]) return false;
//        }
//        return true;
        return String.valueOf(s1).equals(String.valueOf(t1));
    }
}
