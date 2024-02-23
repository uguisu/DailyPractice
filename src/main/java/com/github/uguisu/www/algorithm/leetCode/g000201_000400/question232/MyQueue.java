package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question232;

import java.util.Stack;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
 * Memory Usage: 36.9 MB, less than 53.40% of Java online submissions for Implement Queue using Stacks.
 */
public class MyQueue {

    // 思路：分成"读"和"写"两个栈，读取用的栈空了，就把写入栈里面的多有数据copy过来

    private final Stack<Integer> writeStack;
    private final Stack<Integer> readStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.writeStack = new Stack<>();
        this.readStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        writeStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        if(readStack.empty())
            copyStackA2B(writeStack, readStack);

        return readStack.pop();
    }

    /** Get the front element. */
    public int peek() {

        if(readStack.empty())
            copyStackA2B(writeStack, readStack);

        return readStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return writeStack.empty() && readStack.empty();
    }

    private void copyStackA2B(Stack<Integer> a, Stack<Integer> b) {
        while(!a.empty())
            b.add(a.pop());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */