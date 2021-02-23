package com.github.uguisu.www.algorithm.leetCode.g000001_000200.question200;

public class Solution {

    private int m = 0;
    private int n = 0;

    private char ISLAND = '1';

    /**
     * 采用递归的方式进行搜索。
     * "染色"的思路很重要
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
     * Memory Usage: 41.7 MB, less than 44.82% of Java online submissions for Number of Islands.
     */
    public int numIslands(char[][] grid) {

        // verify
        if(null == grid || 0 == grid.length)
            return 0;

        int rtn = 0;
        m = grid.length;
        n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(ISLAND == grid[i][j]) {
                    findIsland(i, j, grid);
                    rtn++;
                }
            }
        }

        return rtn;
    }

    /**
     * 对找到的相连接的'1'进行"染色" -> 即，将其值改成'0'
     */
    private void findIsland(int i, int j, char[][] grid) {

        // 将当前的值修改，避免重复查找
        grid[i][j] = '0';

        if( 0 <= i - 1 && ISLAND == grid[i - 1][j]) {
            // 上面发现'1'
            findIsland(i - 1, j, grid);
        }
        if(i + 1 < m && ISLAND == grid[i + 1][j]) {
            // 下面发现'1'
            findIsland(i + 1, j, grid);
        }
        if(0 <= j - 1 && ISLAND == grid[i][j - 1]) {
            // 左边发现'1'
            findIsland(i, j - 1, grid);
        }
        if(j + 1 < n && ISLAND == grid[i][j + 1]) {
            // 右边发现'1'
            findIsland(i, j + 1, grid);
        }
    }
}
