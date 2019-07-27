/*
思路:
1) 写一个函数，能够找到所有给定数组的子数组
   - 原数组的元素顺序不能改变
   - 新生成的子数组必须是原数组的一个片段，不能出现中间丢失元素的情况
   - 采用“切割指定长度”的方式，生成子数组可以满足需求
2) 按照条件进行“剪枝”操作，加快速度

结论:
- Arrays.copyOfRange 速度比较慢
 */
package com.github.uguisu.www.algorithm.leetCode.question713;

public class Solution {

    /*
      Solution 4
      官方提供的最快版本，依靠"Sliding Window"方法，使用双指针在数组中移动"窗口"，用来统计结果
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, ans = 0, curr = 1;
        for(int right = 0; right < nums.length; right++){
            curr *= nums[right];
            while(curr >= k && left <= right) curr /= nums[left++];
            ans += (right - left + 1);
        }
        return ans;
    }

    /*
      Solution 3
      最奇妙的想法是：将连乘操作，使用对数，转换成加法操作
     */
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if (k == 0) return 0;
//        double logk = Math.log(k);
//        double[] prefix = new double[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//            prefix[i+1] = prefix[i] + Math.log(nums[i]);
//        }
//
//        int ans = 0;
//        for (int i = 0; i < prefix.length; i++) {
//            int lo = i + 1, hi = prefix.length;
//            while (lo < hi) {
//                int mi = lo + (hi - lo) / 2;
//                if (prefix[mi] < prefix[i] + logk - 1e-9) lo = mi + 1;
//                else hi = mi;
//            }
//            ans += lo - i - 1;
//        }
//        return ans;
//    }

    /*
      Solution 2
      双指针改进版本，从头遍历到末尾，性能勉强可以接受
     */
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//
//        int count = 0;
//
//        for(int i = 0; i < nums.length; i++) {
//            int wrk = 1;
//
//            for(int j = i; j < nums.length; j++) {
//                wrk *= nums[j];
//                if(wrk >= k) {
//                    break;
//                } else {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }

    /*
      Solution 1
      依靠每次从原始数组中"切取"一个字数组的方式，计算速度最慢。
     */
//    // result
//    private int count;
//    private int k;
//
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//
//        this.k = k;
//
//        for(int i = 1; i <= nums.length; i++) {
//            splitSubArray(nums, i);
//        }
//
//        return count;
//    }
//    /**
//     * split sub array
//     * @param nums target array
//     * @param targetLength target length
//     */
//    public void splitSubArray(int[] nums, int targetLength) {
//
//        for(int i = 0; i < nums.length; i++) {
//
//            int amount = 1;
//            boolean isCorrect = true;
//
//            if (i + targetLength <= nums.length) {
//
//                for(int k = i; k <  i + targetLength; k++) {
//                    amount *= nums[k];
//
//                    if(amount >=  this.k) {
//                        isCorrect = false;
//                        break;
//                    }
//                }
//
//                if(isCorrect)
//                    this.count++;
//            }
//        }
//    }
}
