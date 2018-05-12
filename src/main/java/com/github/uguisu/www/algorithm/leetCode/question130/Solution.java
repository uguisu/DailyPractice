/**
 * 130. Surrounded Regions
 * 
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * 
 * For example,
 * 
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 
 * After running your function, the board should be:
 * 
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 
 * [思路]广度优先搜索算法
 * 题目中的"o"有如围棋中的子，只要不在边角的，就会被视为被包围的对象。
 * 那么问题就转化为，寻找与某一边相连接的路径。
 * 1)遍历各边，如果发现"o"，则以此为开始，搜索与其直接相连的路径；并将坐标一一记录
 * 2)四个边全部遍历完成以后，重新扫描整个矩阵。凡不在记录范围内的点，全部替换成"x"
 * 
 * 问题： 效率不高
 */
package com.github.uguisu.www.algorithm.leetCode.question130;

import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

/**
 * @author xixihe
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		
		char[][] board = { {'X','X','X','X'}, {'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		for(char[] I : board) {
			for(char J : I) {
				System.out.print(String.valueOf(J) + ",");
			}
			System.out.println();
		}
		System.out.println();
		
		// Call
		s.solve(board);
		
		for(char[] I : board) {
			for(char J : I) {
				System.out.print(String.valueOf(J) + ",");
			}
			System.out.println();
		}
		System.out.println();
	}

    public void solve(char[][] board) {
        
        // check
        if(null == board || 0 == board.length) {
            return;
        }

        HashMap<String, String> road = new HashMap<String, String>();
        
        // Search the first row
        for(int j = 0; j < board[0].length; j++) {
            if('O' == board[0][j]) {
                // find "O"
                getRoad(board, road, 0, j);
            }
        }
        // Search the last row
        for(int j = 0; j < board[board.length - 1].length; j++) {
            if('O' == board[board.length - 1][j]) {
                // find "O"
                getRoad(board, road, board.length - 1, j);
            }
        }
        // Search the first column
        for(int i = 0; i < board.length; i++) {
            if('O' == board[i][0]) {
                // find "O"
                getRoad(board, road, i, 0);
            }
        }
        // Search the last column
        for(int i = 0; i < board.length; i++) {
            if('O' == board[i][board[i].length - 1]) {
                // find "O"
                getRoad(board, road, i, board[i].length - 1);
            }
        }
        
        // DEBUG
//        for(String kk : road.keySet()) {
//        	System.out.println(kk);
//        }
        
        String strKey = "";
        for(int fi = 0; fi < board.length; fi++) {
            for(int fj = 0; fj < board[fi].length; fj++) {
                // create key
                strKey = String.valueOf(fi) + "," + String.valueOf(fj);
                
                board[fi][fj] = road.containsKey(strKey) ? 'O' : 'X';
            }
        }
    }
    
    public void getRoad(char[][] board, HashMap<String, String> road, int x, int y) {
        
        Queue<Integer> qX = new LinkedList<Integer>();
        Queue<Integer> qY = new LinkedList<Integer>();
        
        // Init
        qX.add(x);
        qY.add(y);
        int i = 0;
        int j = 0;
        
        String strKey = String.valueOf(x) + "," + String.valueOf(y);
        road.put(strKey, String.valueOf(board[x][y]));
        
        while(!qX.isEmpty()) {
            // Each posion should be stored in Queue, so id the Queue is empty, then road is end
            
            i = qX.poll();
            j = qY.poll();
            
            // Step 1) check above
            if(isUpTarget(board, i, j)) {
                // create key. Example:   "1,2" / "10,0"
                strKey = String.valueOf(i - 1) + "," + String.valueOf(j);
                
                if(!road.containsKey(strKey)) {
                    // find a new way point
                    qX.add(i - 1);
                    qY.add(j);
                    road.put(strKey, String.valueOf(board[i - 1][j]));
                }
            }
            // Step 2) check right
            if(isRightTarget(board, i, j)) {
                // create key. Example:   "1,2" / "10,0"
                strKey = String.valueOf(i) + "," + String.valueOf(j + 1);
                
                if(!road.containsKey(strKey)) {
                    // find a new way point
                    qX.add(i);
                    qY.add(j + 1);
                    road.put(strKey, String.valueOf(board[i][j + 1]));
                }
            }
            // Step 3) check below
            if(isBelowTarget(board, i, j)) {
                // create key. Example:   "1,2" / "10,0"
                strKey = String.valueOf(i + 1) + "," + String.valueOf(j);
                
                if(!road.containsKey(strKey)) {
                    // find a new way point
                    qX.add(i + 1);
                    qY.add(j);
                    road.put(strKey, String.valueOf(board[i + 1][j]));
                }
            }
            // Step 4) check left
            if(isLeftTarget(board, i, j)) {
                // create key. Example:   "1,2" / "10,0"
                strKey = String.valueOf(i) + "," + String.valueOf(j - 1);
                
                if(!road.containsKey(strKey)) {
                    // find a new way point
                    qX.add(i);
                    qY.add(j - 1);
                    road.put(strKey, String.valueOf(board[i][j - 1]));
                }
            }
        }
    }

    public boolean isUpTarget(char[][] board, int x, int y) {
        return (x - 1 >=0 && board[x - 1][y] == 'O') ? true : false;
    }
    public boolean isRightTarget(char[][] board, int x, int y) {
        return (y + 1 < board[x].length && board[x][y + 1] == 'O') ? true : false;
    }
    public boolean isBelowTarget(char[][] board, int x, int y) {
        return (x + 1 < board.length && board[x + 1][y] == 'O') ? true : false;
    }
    public boolean isLeftTarget(char[][] board, int x, int y) {
        return (y - 1 >= 0 && board[x][y - 1] == 'O') ? true : false;
    }
}
