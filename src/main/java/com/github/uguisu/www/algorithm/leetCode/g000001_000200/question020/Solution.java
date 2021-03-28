package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {


    public boolean isValid(String s) {
        // verify
        if(null == s || 0 == s.length())
            return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> dict = new HashMap<>();
        dict.put(')', '(');
        dict.put('}', '{');
        dict.put(']', '[');

        char slice[] = s.toCharArray();

        for(char _w : slice) {
            if(dict.containsKey(_w)) {

                if(stack.empty())
                    return false;

                if(!dict.get(_w).equals(stack.pop()))
                    return false;

            } else {
                stack.add(_w);
            }
        }

        return stack.empty();
    }

}
