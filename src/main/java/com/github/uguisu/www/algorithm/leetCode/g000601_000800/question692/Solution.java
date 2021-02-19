package com.github.uguisu.www.algorithm.leetCode.g000601_000800.question692;

import java.util.*;

public class Solution {

    public List<String> topKFrequent(String[] words, int k) {

        // verify
        if(null == words || 0 == words.length)
            return null;

        // 定义字典
        HashMap<String, Integer> dict = new HashMap<>();

        // 统计各词出现频率
        for(String w : words) {
            int times = dict.getOrDefault(w, 0);
            dict.put(w, ++times);
        }

        PriorityQueue<WordNode> queue = new PriorityQueue<>();
        for(String wk : dict.keySet()) {
            queue.offer(new WordNode(wk, dict.get(wk)));

            if(queue.size() > k)
                // 已经找到足够的返回值
                queue.poll();

        }

        // debug
//        while(!queue.isEmpty()) {
//            System.out.print(queue.poll().word + ", ");
//        }
//        System.out.print("\n");

        List<String> rtn = new ArrayList<>();
        while(!queue.isEmpty())
            rtn.add(queue.poll().word);

        Collections.reverse(rtn);

        return rtn;
    }

    private class WordNode implements Comparable<WordNode> {
        public String word;
        public int freq;

        public WordNode(String word, int freq) {
            this.word = word;
            this.freq = freq;
        }

        @Override
        public int compareTo(WordNode o) {
            int rtn = freq - o.freq;
            // If two words have the same frequency, then the word with the lower alphabetical order comes first.
            return (0 == rtn) ? o.word.compareTo(word) : rtn;
        }
    }
}
