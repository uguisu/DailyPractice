package com.github.uguisu.www.algorithm.leetCode.g000201_000400.question210;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // verify
        if(0 == numCourses)
            return new int[] {0};

        // return
        int[] rtn = new int[numCourses];

        if(0 < numCourses && (null == prerequisites || 0 == prerequisites.length)) {
            for(int i = 0; i < numCourses; i++) {
                rtn[i] = i;
            }
            return rtn;
        }

        // 统计每个点的入度
        int[] indegreeArray = new int[numCourses];
        // 统计每个点的子节点(子节点有可能重复，所以使用Map来记录)
        HashMap<Integer, HashMap<Integer, Integer>> nodeChild = new HashMap<>();
        // counter
        int counter = 0;

        for(int[] wrk : prerequisites) {
            // 入度
            indegreeArray[wrk[0]] += 1;
            // 子节点
            HashMap<Integer, Integer> wrkChildMap = nodeChild.getOrDefault(wrk[1], new HashMap<>());
            wrkChildMap.put(wrk[0], wrk[0]);
            nodeChild.put(wrk[1], wrkChildMap);
        }

        Queue<Integer> pendingQueue = new LinkedList<>();
        for(int i = 0; i < indegreeArray.length; i++) {
            if(0 == indegreeArray[i])
                pendingQueue.add(i);
        }

        while(!pendingQueue.isEmpty()) {
            int targetNode = pendingQueue.poll();

            HashMap<Integer, Integer> wrkChildMap = nodeChild.get(targetNode);
            if(null != wrkChildMap) {
                for(int key : wrkChildMap.keySet()) {
                    // 更改子节点的入度
                    indegreeArray[key] -= 1;
                    // 检查是否发现新的入度为零的点
                    if(0 == indegreeArray[key])
                        pendingQueue.add(key);
                }
            }

            rtn[counter] = targetNode;
            counter++;
        }

        return (numCourses == counter) ? rtn : new int[] {};
    }

}
