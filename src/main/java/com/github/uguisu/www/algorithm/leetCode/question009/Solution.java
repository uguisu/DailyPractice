package com.github.uguisu.www.algorithm.leetCode.question009;

import java.util.Stack;

class Solution {
    public boolean isPalindrome(int x) {
        // verify
        if(x < 0)
            return false;

        int length = (int) Math.log10(x) + 1;

        if(x < 10)
            return true;

        if(x < 100) {
            // 不足3位的需要单独对待
            return x % 10 == x / 10;
        }

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < length / 2; i++) {
            // 以中间数字为界，从右向左，截取每一个数字如栈
            st.add(x % 10);
            x /= 10;
        }

        // 判断是否需要丢弃中间数字
        x = (length % 2 == 0) ? x : x / 10;

        for(int i = 0; i < length / 2; i++) {
            if(st.pop() != x % 10)
                return false;
            x /= 10;
        }
        return true;
    }
}