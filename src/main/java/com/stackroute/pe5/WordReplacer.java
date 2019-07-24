package com.stackroute.pe5;

import java.util.Map;

public class WordReplacer {
    public String wordMover(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String value = map.get("val1");
        map.replace("val2", value);
        map.replace("val1", " ");
        return map.toString();
    }
}
