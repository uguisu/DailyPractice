/**
 * 
 */
package com.github.uguisu.www.algorithm.hw.question001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1) Create a binary tree
 * 2) Find ways from root node
 */
public class Solution {

	public static final String RTN_ERROR = "error";
	public static final String SPLIT_FLG = ",";
	
	// All ways
	private ArrayList<ArrayList<Integer>> Ways = new ArrayList<ArrayList<Integer>>();
	// One of the way
	private ArrayList<Integer> way = new ArrayList<Integer>();
	
	/**
	 * Tree Node internal class
	 * @author xin.he
	 */
	private class TreeNode {
		
		// Left child node
		public TreeNode left;
		// Right child node
		public TreeNode right;
		// Node value
		public int value;
		
		/**
		 * Constructor
		 */
		public TreeNode() {
			this.left = null;
			this.right = null;
			this.value = 0;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// For test
		new Solution(22, "10,5,12,4,7");
	}
	
	/**
	 * @param n Target value
	 * @param input Tree node array
	 */
	public Solution(int n, String input) {
		// Create tree
		TreeNode myTree = createBinaryTree(input);
		// Find way
		findWay(n, myTree);
		
		// debug
		for(ArrayList<Integer> b1 : Ways) {
			for(Integer b2 : b1) {
				System.out.print(b2);
				System.out.print(" -> ");
			}
			System.out.println("");
		}
		
		if(Ways.size() == 0) {
			System.out.println(RTN_ERROR);
		}
	}
	
	/**
	 * Create binary tree
	 * @param input Tree node array
	 * @return Root node
	 */
	private TreeNode createBinaryTree(String input) {
		
		// check
		if(null == input || "".equals(input)) {
			return null;
		}
		
		String[] aryTreeNode = input.split(SPLIT_FLG);
		
		// Declare root node
		TreeNode root = new TreeNode();
		root.value = Integer.valueOf(aryTreeNode[0]);

		// Store node
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		nodeQueue.add(root);
		
		TreeNode current;
		for(int i = 1; i < aryTreeNode.length; ) {
			// get current node
			current = nodeQueue.poll();
			
			// Add left
			if(i < aryTreeNode.length) {
				TreeNode left = new TreeNode();
				left.value = Integer.valueOf(aryTreeNode[i]);
				current.left = left;
				i++;
				nodeQueue.add(left);
			}
			// Add right
			if(i < aryTreeNode.length) {
				TreeNode right = new TreeNode();
				right.value = Integer.valueOf(aryTreeNode[i]);
				current.right = right;
				i++;
				nodeQueue.add(right);
			}
		}
		
		return root;
	}
	
	
	private void findWay(int n, TreeNode root) {
		
		way.add(root.value);
		
		if(root.left == null && root.right == null) {
			if(n - root.value == 0) {
				// find last
				ArrayList<Integer> tmp = new ArrayList<Integer>(way);
				Ways.add(tmp);
			}
			// rollback a level
			way.remove(way.size() - 1);
			return;
		}
		
		if(n - root.value > 0) {
			findWay(n - root.value, root.left);
			findWay(n - root.value, root.right);
		}
		if(n - root.value < 0) {
			// rollback a level
			way.remove(way.size() - 1);
			return;
		}
		
		// rollback a level
		way.remove(way.size() - 1);
	}

}
