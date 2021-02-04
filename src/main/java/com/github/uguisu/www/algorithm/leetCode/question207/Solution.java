package com.github.uguisu.www.algorithm.leetCode.question207;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // verify
        if(0 == numCourses || null == prerequisites || 0 == prerequisites.length)
            return true;

        // 统计每个点的入度
        int[] indegreeArray = new int[numCourses];
        // 统计每个点的子节点(子节点有可能重复，所以使用Map来记录)
        HashMap<Integer, HashMap<Integer, Integer>> nodeChild = new HashMap<>();
        // counter
        int counter = 0;

        for(int[] wrkNode : prerequisites) {
            // 入度增加
            indegreeArray[wrkNode[0]] += 1;
            // 追加子节点
            HashMap<Integer, Integer> wnd = nodeChild.getOrDefault(wrkNode[1], new HashMap<Integer, Integer>());
            wnd.put(wrkNode[0], wrkNode[0]);
            nodeChild.put(wrkNode[1], wnd);
        }

        Queue<Integer> pendingQueue = new LinkedList<>();
        for(int i = 0; i < indegreeArray.length; i++) {
            if(0 == indegreeArray[i])
                // 将入度为0的点入队列
                pendingQueue.add(i);
        }

        while(!pendingQueue.isEmpty()) {
            int targetNode = pendingQueue.poll();

            HashMap<Integer, Integer> wrkMap = nodeChild.get(targetNode);
            if(null != wrkMap) {
                for (int key : wrkMap.keySet()) {
                    // 字节点的入度减
                    indegreeArray[key] -= 1;

                    // 检查是否发现新的入度为零的点
                    if (0 == indegreeArray[key])
                        pendingQueue.add(key);
                }
            }

            counter++;
        }
        return (counter == numCourses);
    }
}
