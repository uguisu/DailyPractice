package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(empty()) {
            q1.add(x);
        } else if(q1.size() > 0) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int rtn = 0;

        // verify
        if(empty())
            return rtn;

        if(0 == q1.size()) {
            rtn = switchQa2Qb(q2, q1);
        } else {
            rtn = switchQa2Qb(q1, q2);
        }

        return rtn;
    }

    /** Get the top element. */
    public int top() {
        int rtn = 0;

        // verify
        if(empty())
            return rtn;

        // 按照朴素的想法，这里的代码重复了
//        if(0 == q1.size()) {
//            rtn = switchQa2Qb(q2, q1);
//            q1.add(rtn);
//        } else {
//            rtn = switchQa2Qb(q1, q2);
//            q2.add(rtn);
//        }
        // 为了避免代码重复，先调一遍pop()
        rtn = pop();
        if(0 == q1.size()) {
            q2.add(rtn);
        } else {
            q1.add(rtn);
        }

        return rtn;
    }

    /**
     * transfer all elements from A to B, and return the last element
     */
    private int switchQa2Qb(Queue<Integer> qA, Queue<Integer> qB) {
        int len = qA.size();
        for(int i = 0; i < len - 1; i++)
            qB.add(qA.poll());
        return qA.poll();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return 0 == q1.size() && 0 == q2.size();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */