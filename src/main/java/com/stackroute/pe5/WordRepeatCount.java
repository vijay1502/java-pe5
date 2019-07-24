package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepeatCount {
    public Map<String, Integer> checkFrequency(String input) {
        if (input == null) return null;
        List<String> stringList = Arrays.asList(input.split("[\\s_@'*?,(+)#$%^&!~./;`-]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : stringList) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);//map.get will return
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }


}