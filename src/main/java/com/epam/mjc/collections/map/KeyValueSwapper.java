package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map1 = new HashMap<>();
        for (Integer integer : sourceMap.keySet()) {
            map1.put(sourceMap.get(integer), integer);
        }

        return map1;
    }

    public static void main(String[] args) {
        KeyValueSwapper swapper = new KeyValueSwapper();
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "one");
        sourceMap.put(2, "two");
        sourceMap.put(3, "three");
        sourceMap.put(10, "temp");
        System.out.println(swapper.swap(sourceMap));
    }
}
