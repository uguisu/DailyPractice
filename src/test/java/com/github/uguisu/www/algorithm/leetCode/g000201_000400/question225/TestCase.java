package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question225;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    @Test
    public void test001() {
        MyStack m = new MyStack();

        m.push(1);
        m.push(2);
        m.push(3);
        assertEquals(3, m.top());
    }
}
