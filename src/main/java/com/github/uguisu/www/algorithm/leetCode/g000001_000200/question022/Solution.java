package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    List<String> rtn = new ArrayList<>();
    private static final String BRACKET = "()";
    // 避免重复
    private final HashSet<String> cache = new HashSet<>();

    /**
     * Runtime: 13 ms, faster than 5.23% of Java online submissions for Generate Parentheses.
     * Memory Usage: 39.6 MB, less than 25.69% of Java online submissions for Generate Parentheses.
     */
    public List<String> generateParenthesis(int n) {
        backtrack(n - 1, BRACKET);
        return rtn;
    }

    /**
     * 思路：
     *   - 利用插空挡的方法，将括号成对的插到指定位置。
     *   - 每次迭代，只需要扫描一半的字符串就可以了
     * 例如：
     *   "()"  ->  [位置1]([位置2])
     *   "(())"  ->  [位置1]([位置2]([位置3]))
     *
     * LeetCode上的方法：控制左右括号数量的方法，效率高，但无法推广到任意种类的括号混排
     * 我的方法是可以推广到任意括号进行匹配的
     */
    private void backtrack(int n, String creator) {

        // 退出条件
        if(0 == n) {
            if(!cache.contains(creator)) {
                // 发现新的组合
                rtn.add(creator);
                cache.add(creator);
            }
            return;
        }

        for(int i = 0; i <= creator.length() / 2; i++) {
            // 插空档的方法
            backtrack(n - 1, creator.substring(0, i) + BRACKET + creator.substring(i));
        }
    }
}
