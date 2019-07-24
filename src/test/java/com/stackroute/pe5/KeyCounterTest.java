package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyCounterTest {
KeyCounter keyCounter;
    @Before
    public void setUp() throws Exception {
        keyCounter=new KeyCounter();
    }

    @After
    public void tearDown() throws Exception {
        keyCounter=null;
    }

    @Test
    public void givenAStringArrayShoyldReturnMapWithStringAndBooleanPair(){
        String[] array={"a","b","c","d","e","a","c","e"};
        Map<String,Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        expected.put("e",true);
        System.out.println(expected);
        Map<String, Boolean> actualResult=keyCounter.keyCountChecker(array);
        assertEquals(expected,actualResult);

    }
}