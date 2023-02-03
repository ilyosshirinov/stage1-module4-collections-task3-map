package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String t = "";
        sentence += " ";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '.' || sentence.charAt(i) == ',') {
                if (t.length() > 0) {
                    t = t.toLowerCase();
                    if (map.containsKey(t)) {
                        map.put(t, map.get(t) + 1);
                    } else map.put(t, 1);
                }
                t = "";
            } else t += sentence.charAt(i);
        }
        return map;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator creator = new WordRepetitionMapCreator();
        String s = "sentense in loWER caSE, SENTENsE IN UPper CAse.";
        System.out.println(creator.createWordRepetitionMap(s));
    }
}
