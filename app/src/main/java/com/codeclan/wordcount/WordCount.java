package com.codeclan.wordcount;

/**
 * Created by Adam Baxter on 14/03/2017.
 */

public class WordCount {

    public static int wordCount(String text) {
        String[] wordArray = text.split(" ");
        return wordArray.length;
    }
}

