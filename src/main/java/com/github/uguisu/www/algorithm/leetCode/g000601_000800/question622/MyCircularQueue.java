package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question622;

public class MyCircularQueue {

    // internal store
    private final int[] q;

    private int pFront = 0;
    private int pRear = 0;
    private int counter = 0;
    private final int k;

    /**
     * Initializes the object with the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.q = new int[k];
        this.k = k;
    }

    /**
     * Inserts an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        // verify
        if(isFull())
            return false;

        q[pRear] = value;
        counter++;

        pRear = (pRear >= k - 1) ? 0 : pRear + 1;

        return true;
    }

    /**
     * Deletes an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        // verify
        if(isEmpty())
            return false;

        counter--;
        pFront = (pFront >= k - 1) ? 0 : pFront + 1;

        return true;
    }

    /**
     * Gets the front item from the queue. If the queue is empty, return -1.
     */
    public int Front() {
        // verify
        if(isEmpty())
            return -1;

        return q[pFront];
    }

    /**
     * Gets the last item from the queue. If the queue is empty, return -1.
     */
    public int Rear() {
        // verify
        if(isEmpty())
            return -1;

        int targetIdx = (0 == pRear) ? k -1 : pRear - 1;

        return q[targetIdx];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return counter == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return counter == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */