package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AlphabetSort {
    public List<String> alphabetSortMethod(Set<String> setList) {
        Set<String>  sortedString = new TreeSet<String>(setList);
        List<String> output=new ArrayList<String>(sortedString);
        return output;
    }
}

