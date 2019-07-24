package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceArrayElement {
    public ArrayList replaceElement(ArrayList fruits, String input, String replacer) {
        if(fruits.contains(input)){
            int index=fruits.indexOf(input);
            fruits.set(index,replacer);

        }
        return fruits;
    }
}
