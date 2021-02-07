package com.github.uguisu.www.algorithm.leetCode.g000401_000600.question496;

import java.util.HashMap;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // 利用Map，保存nums2，键存放元素，值存放元素下标
        HashMap<Integer, Integer> num2Map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++)
            num2Map.put(nums2[i], i);

        int[] rtn = new int[nums1.length];

        // 然后遍历nums1，获取该元素在nums2中的下标，然后往后寻找比它大的元素
        int startIndex = 0;
        boolean isFind = false;
        for(int i = 0; i < nums1.length; i++) {
            // 取得查找开始点
            startIndex = num2Map.get(nums1[i]);
            // 初始化标志位
            isFind = false;

            for(int j = startIndex; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]) {
                    isFind = true;
                    rtn[i] = nums2[j];
                    break;
                }
            }

            if(!isFind)
                rtn[i] = -1;
        }

        return rtn;
    }

}
