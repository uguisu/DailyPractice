package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question241;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> diffWaysToCompute(String expression) {
        // verify
        if(null == expression || "".equals(expression))
            return null;

        List<Integer> rtn = new ArrayList<>();

        if(1 == expression.length()) {
            rtn.add(Integer.valueOf(expression));
            return rtn;
        }

        char w;
        for(int i = 0; i < expression.length(); i++) {

            // get char
            w = expression.charAt(i);

            if(Character.isDigit(w))
                continue;

            String left = expression.substring(0, i);
            String right = expression.substring(i + 1);

            List<Integer> leftVal = diffWaysToCompute(left);
            List<Integer> rightVal = diffWaysToCompute(right);

            for(int l : leftVal) {
                for(int r : rightVal) {
                    rtn.add(cal(w, l, r));
                }
            }
        }

        // input is just a number
        if(0 == rtn.size())
            rtn.add(Integer.valueOf(expression));

        return rtn;
    }

    private int cal(char w, int left, int right) {

        int rtn = 0;

        if('+' == w)
            rtn = left + right;
        if('-' == w)
            rtn = left - right;
        if('*' == w)
            rtn = left * right;

        return rtn;
    }
}
