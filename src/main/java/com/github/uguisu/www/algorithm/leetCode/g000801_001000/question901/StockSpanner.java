/*
自身思路的问题：每次都要遍历之前所有的元素，导致速度很慢。
借用stack，可以保证阶段性的存储之前的计算结果，直接复用，避免挨个遍历
 */
package com.github.uguisu.www.algorithm.leetCode.g000801_001000.question901;

import java.util.LinkedList;
import java.util.List;

public class StockSpanner {

    List<Integer> lst = new LinkedList<>();

    public StockSpanner() {

    }

    public int next(int price) {
        int rtn = 1;

        lst.add(price);

        if(1 == lst.size()) {
            return 1;
        }
        for(int i = lst.size(); 1 < i; i--) {
            if(lst.get(i - 2) > price)
                break;
            rtn++;
        }

        return rtn;
    }
}

