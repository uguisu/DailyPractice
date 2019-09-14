package com.github.uguisu.www.algorithm.leetCode.question981;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    /** internal data store */
    private Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    /** Initialize your data structure here. */
    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            // a new key come
            map.put(key, new TreeMap<Integer, String>());
        }

        // get cached values
        TreeMap<Integer, String> tMap = map.get(key);
        tMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";

        TreeMap<Integer, String> tMap = map.get(key);

        // NOTE!!! floorKey() 有可能返回 null，当TreeMap中所有的key都大于timestamp时
        Integer sKey = tMap.floorKey(timestamp);
        return null == sKey ? "" : tMap.get(sKey);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */