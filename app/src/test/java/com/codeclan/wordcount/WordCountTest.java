package com.codeclan.wordcount;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.wordcount.WordCount.wordCount;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Baxter on 14/03/2017.
 */


public class WordCountTest {

    String words;

    @Before
    public void before() {
        words = "Hello World";
    }

    @Test
    public void testStringConvertedToArray(){
        String[] stringArray = words.split(" ");
        assertEquals(stringArray.length, 2);
    }

    @Test
    public void testWordCountMethod(){
        assertEquals(wordCount(words), 2);
    }


}
