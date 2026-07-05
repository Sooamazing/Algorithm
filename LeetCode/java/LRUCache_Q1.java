package LeetCode.java;

import java.util.LinkedHashMap;
import java.util.Map;

// 26-07-05 45min
// https://leetcode.com/problems/lru-cache
public class LRUCache_Q1 {

    private LinkedHashMap<Integer, Integer> map;

    public LRUCache_Q1(int capacity) {

        // load factor default: 0.75
        map = new LinkedHashMap<Integer, Integer>(capacity, (float) 0.75, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {

                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        // int get(int key) Return the value of the key if the key exists, otherwise return -1.
        return (int) map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        // Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
        map.put(key, value);
        // System.out.println(map);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new
 * LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */