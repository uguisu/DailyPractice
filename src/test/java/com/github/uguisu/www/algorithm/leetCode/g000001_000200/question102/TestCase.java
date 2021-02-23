package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question102;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TestCase {

    @Test
    public void test001() {
        Queue<Integer> tt = new LinkedList<>();

        tt.add(1);
        // 注意：队列里面是可以插入 null 的
        tt.add(null);
        tt.add(3);
        tt.add(4);

        int l = tt.size();
        System.out.println("size = " + l);

        for(int i = 0; i < l; i++) {
            System.out.println(tt.poll());
        }

    }
}
