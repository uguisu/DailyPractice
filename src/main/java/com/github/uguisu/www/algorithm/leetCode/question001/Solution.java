/**
 * 1.Two Sum
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * The return format had been changed to zero-based indices. Please read the above updated description carefully.
 * 
 * [思路1]双循环是最容易想到的，但是效率不行。
 * [思路2]条件可以肯定一定会存在两个元素相加等于target，因此，做减法可以加速查找；再利用HashMap的时间复杂度O(1)这个特性，将每次减法的结果保存起来，为以后的查找使用。 
 */
package com.github.uguisu.www.algorithm.leetCode.question001;

import java.util.HashMap;

/**
 * @author test
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		int input[] = {2, 7, 11, 15};
		int output[];
		int target = 9;
		
		output = s.twoSum(input, target);
		
		for(int i : output) {
			System.out.println(i);
		}
	}

    public int[] twoSum(int[] nums, int target) {
        
        // check
        if(null == nums || nums.length < 2) {
            return null;
        }
        
        int RTN[] = {0, 0};
        int intWrk = 0;
        // Key: target - nums[i];  value: index
        HashMap<Integer, Integer> mapWrk = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            
            intWrk = target - nums[i];
            
            if(mapWrk.containsKey(intWrk)) {
                // find it
                RTN[0] = mapWrk.get(intWrk);
                RTN[1] = i;
                break;
            } else {
                // store in map
                mapWrk.put(nums[i], i);
            }
        }

        return RTN;
    }
}
