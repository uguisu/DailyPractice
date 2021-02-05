/*
条件, 满足其一:
1) 数组里面的元素可以被index整除
2) 某个index可以被其所对应元素整除

思路
1) 能够找到一个函数，遵循元素的全排列，生成所有可能的组合；
2) 适当的“剪枝”处理，减少循环次数
 */
package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question526;

public class Solution {

    // solution amount
    private int count = 0;

    public int countArrangement(int N) {

        // init target array
        int[] target = new int[N];
        for(int i = 0; i < N; i++) {
            target[i] = i + 1;
        }

        digArray(0, target);

        return count;
    }

    private void digArray(int targetIndex, int[] target) {

        // the last element
        if(targetIndex == target.length) {
            count++;
        }

        for(int i = targetIndex; i < target.length; i++) {
            // swap
            swap(target, targetIndex, i);

            // if (targetIndex + 1 < target.length) {
            if (0 == target[targetIndex] % (targetIndex + 1) || 0 == (targetIndex + 1) % target[targetIndex]) {
                digArray(targetIndex + 1, target);

                // debug
                // Arrays.stream(target).forEach(x -> System.out.print(x + ","));
                // System.out.println();
            }

            // rollback original sort
            swap(target, targetIndex, i);
        }

    }

    private void swap(int[] target, int x, int y) {
        int temp = target[x];
        target[x] = target[y];
        target[y] = temp;
    }
}
