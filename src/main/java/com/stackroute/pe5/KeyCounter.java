package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class KeyCounter {
    public Map<String, Boolean> keyCountChecker(String[] inputString) {

        Map<String, Boolean> resultMap = new HashMap<>();
        // if the input is null should return null
        if (inputString == null) {
            return null;
        }
        // set boolean value is the string repeat more than once
        else {

            for (int i = 0; i < inputString.length; i++) {

                String word = inputString[i];
                if (resultMap.containsKey(word))
                    resultMap.put(word, true);
                else
                    resultMap.put(word, false);
            }
            return resultMap;
        }
    }
}
