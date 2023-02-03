package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return sourceList.contains((requiredValue - 2) / 5) && ((requiredValue - 2) % 5 == 0);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++) {
            map.put(sourceList.get(i), sourceList.get(i) * 5 + 2);
        }
        return map;
    }
}
