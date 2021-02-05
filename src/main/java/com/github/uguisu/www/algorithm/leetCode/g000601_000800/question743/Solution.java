/**
 * // TODO
 * 743. Network Delay Time
 *
 * There are N network nodes, labelled 1 to N.
 *
 * Given times, a list of travel times as directed edges times[i] = (u, v, w),
 * where u is the source node, v is the target node, and w is the time it takes for a signal to travel from source to target.
 *
 * Now, we send a signal from a certain node K. How long will it take for all nodes to receive the signal? If it is impossible, return -1.
 *
 * Note:
 *     N will be in the range [1, 100].
 *     K will be in the range [1, N].
 *     The length of times will be in the range [1, 6000].
 *     All edges times[i] = (u, v, w) will have 1 <= u, v <= N and 1 <= w <= 100.
 *
 * 思路：
 *     1) Dijkstra's algorithm
 *     2) 递归求解
 */
package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question743;

public class Solution {

    // 用来记录具体哪些点已经走过了
    private int[] mapExist;

    public int networkDelayTime(int[][] times, int N, int K) {

        mapExist = new int[N + 1];

        // regist K exist
        mapExist[K] = 1;

        int maxLength = subNetworkDelayTime(times, N, K);

        int i = 1;
        for(; i <= N; i++) {
            if(mapExist[i] != 1) {
                break;
            }
        }

        return (i <= N)? -1 : maxLength;
    }

    private int subNetworkDelayTime(int[][] times, int N, int K) {

        int maxLength = 0;

        // regist K exist
        mapExist[K] = 1;

        for(int[] times0 : times) {
            if(times0[0] == K && mapExist[times0[1]] == 0) {
                maxLength = times0[2];
                maxLength = maxLength + subNetworkDelayTime(times, N, times0[1]);
            }
        }

        return maxLength;
    }
}
