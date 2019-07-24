package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AlphabetSortTest {
    AlphabetSort alphabetSort;

    @Before
    public void setUp() throws Exception {
        alphabetSort=new AlphabetSort();
    }

    @After
    public void tearDown() throws Exception {
        alphabetSort=null;
    }

    @Test
    public void givenASetOfStringShouldReturnSortedOrder(){

        Set<String> setList = new HashSet<String>();
        setList.add("this");
        setList.add("is");
        setList.add("vijay");
        setList.add("from");
        setList.add("cgi");

        System.out.println("INput LIst is"+setList);


        List<String> expected = new ArrayList<String>();
        expected.add("cgi");
        expected.add("from");
        expected.add("is");
        expected.add("this");
        expected.add("vijay");

        System.out.println("Expected Output is" +expected);
       List<String> actualvalue = alphabetSort.alphabetSortMethod(setList);
        System.out.println("Actual Output is" + actualvalue);
        assertEquals(expected,actualvalue);
    }
}