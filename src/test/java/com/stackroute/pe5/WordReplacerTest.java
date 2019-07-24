package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordReplacerTest {
WordReplacer wordReplacer;
    @Before
    public void setUp() throws Exception {
        wordReplacer=new WordReplacer();
    }

    @After
    public void tearDown() throws Exception {
        wordReplacer=null;
    }
    @Test
    public void givenAStringMapShouldReurnShouldReturnCountOfWords(){
        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("val1","Java");
        stringMap.put("val2","C++");
        String actual = wordReplacer.wordMover(stringMap);
        String expected = "{val2=Java, val1= }";
        assertEquals(expected, actual);

    }
}