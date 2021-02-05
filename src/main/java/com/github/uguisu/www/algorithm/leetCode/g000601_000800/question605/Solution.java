/**
 * 605. Can Place Flowers
 * 
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n,
 * return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 * 
 * Example 1
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * 
 * Example 2
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 * 
 * Note:
 *   The input array won't violate no-adjacent-flowers rule.
 *   The input array size is in the range of [1, 20000].
 *   n is a non-negative integer which won't exceed the input array size.
 */
package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question605;

public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        int[] flowerbed1 = {0,0,1,0,0};
        int[] flowerbed2 = {1,0,0,0,0,1};
        int[] flowerbed3 = {0,0,0};
        
        Solution s = new Solution();
        
        s.showResult("flowerbed1", true, s.canPlaceFlowers(flowerbed1, 2));
        s.showResult("flowerbed2", false, s.canPlaceFlowers(flowerbed2, 2));
        s.showResult("flowerbed3", true, s.canPlaceFlowers(flowerbed3, 2));
        
    }
    
    public void showResult(String name, boolean expected, boolean real) {
        
        System.out.println(String.format("[%s] Expected:[%s], the real is [%s]", name, expected, real));
        
    }
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int FLOWER_PLOT = 1;
        int EMPTY = 0;
        
        int i = 0;
        int adjacentCount = 0;
        int flowerCount = 0;
        
        // for HEAD
        if(EMPTY == flowerbed[0]) {
            for(adjacentCount = 0; i + adjacentCount < flowerbed.length; adjacentCount++) {
                if(FLOWER_PLOT == flowerbed[i + adjacentCount]) break;
            }
            if(i + adjacentCount == flowerbed.length) {
                // Loop to the last element, insert ZERO to the end
                adjacentCount = adjacentCount + 1;
            }
            flowerCount += adjacentCount / 2;
            i += adjacentCount;
        }
        
        while(i < flowerbed.length && flowerCount < n) {
            
            if(EMPTY == flowerbed[i]) {
                
                for(adjacentCount = 0; i + adjacentCount < flowerbed.length; adjacentCount++) {
                    if(FLOWER_PLOT == flowerbed[i + adjacentCount]) break;
                }
                
                if(i + adjacentCount == flowerbed.length) {
                    // Loop to the last element, insert ZERO to the end
                    adjacentCount = adjacentCount + 1;
                }
                
                flowerCount += ((adjacentCount - 1) / 2);
                
                i += adjacentCount;
            }
            
            i++;
        }
        
        return (flowerCount >= n) ? true : false;
    }

}
