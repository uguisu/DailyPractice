package com.github.uguisu.www.algorithm.leetCode.g000801_001000.question938;

import java.util.Stack;

public class Solution {

    /**
     * 普通深度优先，效果一般
     * Runtime: 8 ms, faster than 5.29% of Java online submissions for Range Sum of BST.
     * Memory Usage: 47 MB, less than 66.29% of Java online submissions for Range Sum of BST.
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 二叉查找树 + 给定范围

        // verify
        if(null == root)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        TreeNode wrk;
        int rtn = 0;

        while(!stack.isEmpty()) {

            wrk = stack.pop();

            if(null != wrk.left)
                stack.add(wrk.left);
            if(null != wrk.right)
                stack.add(wrk.right);

            if(low <= wrk.val && wrk.val <= high)
                rtn += wrk.val;
        }

        return rtn;
    }

    /**
     * 由于给出了取值范围，考虑递归进行剪枝
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
     * Memory Usage: 47.2 MB, less than 42.83% of Java online submissions for Range Sum of BST.
     */
    public int rangeSumBST_001(TreeNode root, int low, int high) {

        // verify
        if(null == root)
            return 0;

        int rtn = 0;

        if(low <= root.val && root.val <= high)
            rtn += root.val;

        if(null != root.left && root.left.val < low && root.val < low) {
            // 根节点和左叶子都比最小值小
            // 根据二叉查找树的性质，剪枝
        } else {
            rtn += rangeSumBST(root.left, low, high);
        }
        if(null != root.right && high < root.val && high < root.right.val) {
            // 根节点和右叶子都比最大值大
            // 根据二叉查找树的性质，剪枝
        } else {
            rtn += rangeSumBST(root.right, low, high);
        }

        return rtn;
    }
}
