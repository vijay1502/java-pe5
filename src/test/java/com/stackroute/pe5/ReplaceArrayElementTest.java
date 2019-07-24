package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceArrayElementTest {
ReplaceArrayElement replaceArrayElement;
    @Before
    public void setUp() throws Exception {
        replaceArrayElement=new ReplaceArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        replaceArrayElement=null;
    }
    @Test
    public void givenAnArrayListShouldReturnListWithReplacedValue(){
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");
        List<String> expected = new ArrayList<String>();
        expected.add("Banana");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
        List actualvalue = replaceArrayElement.replaceElement((ArrayList) fruits,"Apple","Banana");
        assertEquals(expected,actualvalue);
    }
}