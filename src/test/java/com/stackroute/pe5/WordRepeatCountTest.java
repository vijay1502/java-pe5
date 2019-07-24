package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordRepeatCountTest {
WordRepeatCount wordRepeatCount;
    @Before
    public void setUp() throws Exception {
        wordRepeatCount=new WordRepeatCount();
    }

    @After
    public void tearDown() throws Exception {
        wordRepeatCount=null;
    }
    @Test
    public void givenAStringShouldReturnCountOfEachWordThroughMap(){
        Map<String,Integer> mapExpected=new HashMap<String,Integer>();
        mapExpected.put("one",3);
        mapExpected.put("two",2);
        String input="one@one one/two-two";
        Map<String,Integer> actualResult=wordRepeatCount.checkFrequency(input);
        assertEquals(mapExpected,actualResult);
    }
}