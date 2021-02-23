package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    /**
     * 控制的细节比较多
     * Runtime: 1 ms, faster than 61.19% of Java online submissions for Binary Tree Level Order Traversal.
     * Memory Usage: 39.6 MB, less than 20.90% of Java online submissions for Binary Tree Level Order Traversal.
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> rtn = new ArrayList<>();

        // verify
        if(null == root)
            return rtn;

        // init
        boolean isQ1 = true;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);

        List<Integer> levelCounter = new ArrayList<>();
        levelCounter.add(root.val);
        rtn.add(levelCounter);

        // 广度优先
        levelCounter = new ArrayList<>();
        TreeNode wTree;
        while(! (q1.isEmpty() && q2.isEmpty()) ){

            wTree = isQ1 ? q1.poll() : q2.poll();

            if(null != wTree.left) {

                if(isQ1) {
                    q2.add(wTree.left);
                } else {
                    q1.add(wTree.left);
                }

                levelCounter.add(wTree.left.val);
            }
            if(null != wTree.right) {
                if(isQ1) {
                    q2.add(wTree.right);
                } else {
                    q1.add(wTree.right);
                }
                levelCounter.add(wTree.right.val);
            }

            // 控制队列交替
            if(isQ1 && q1.isEmpty()) {
                isQ1 = false;
                if(0 < levelCounter.size()) {
                    // 避免添加空列表
                    rtn.add(levelCounter);
                    levelCounter = new ArrayList<>();
                }
            }
            if(!isQ1 && q2.isEmpty()) {
                isQ1 = true;
                if(0 < levelCounter.size()) {
                    // 避免添加空列表
                    rtn.add(levelCounter);
                    levelCounter = new ArrayList<>();
                }
            }
        }
        return rtn;
    }


    public List<List<Integer>> levelOrder_001(TreeNode root) {

        List<List<Integer>> levelOrder = new ArrayList<>();

        if(root == null){
            return levelOrder;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        List<Integer> temp = new ArrayList<Integer>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            TreeNode curr = q.remove();

            if(curr == null){
                if(temp.size() == 0){
                    break;
                }
                // Represents end of a level
                levelOrder.add(temp);
                temp = new ArrayList<Integer>();
                // Adding new level
                q.add(null);

            } else {
                temp.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        return levelOrder;
    }
}
