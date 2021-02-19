package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question215;

public class Solution {

    public int findKthLargest(int[] nums, int k) {

        // verify
        if(null == nums || 0 == nums.length)
            return 0;

        int size = nums.length;

        // 遍历后一半数组
        for(int i = size / 2; i >= 0; i--)
            // 调整堆的结构
            sink(nums, size - 1);

        for(int i = size - 1; i > 0; i--) {
            // 将最大的数字放到队尾
            exchange(nums, 0, i);
            // 调整堆的结构
            sink(nums, i - 1);
        }

//        // debug
//        for(int deb : nums) {
//            System.out.print(deb + ", ");
//        }

        return nums[size - k];
    }

    /**
     * 下沉
     * @param heap heap
     * @param heapPoint 范围
     */
    private void sink(int[] heap, int heapPoint) {

        int left = 0;
        int right = 0;
        int i = 0;

        while(i < heapPoint) {

            // 计算左右子树的索引
            left = i * 2 + 1;
            right = left + 1;

            if(right <= heapPoint && heap[i] < heap[right] && heap[left] < heap[right]) {
                // 右子节点存在且大于父节点
                exchange(heap, right, i);
                i = right;
                continue;
            }

            if(left <= heapPoint && heap[i] < heap[left]) {
                // 左节点大于父节点
                exchange(heap, left, i);
                i = left;
                continue;
            }

            i++;
        }
    }

    /**
     * 交换制定对象的值
     */
    private void exchange(int[] heap, int p1, int p2) {
        int tmp = heap[p1];
        heap[p1] = heap[p2];
        heap[p2] = tmp;
    }
}
