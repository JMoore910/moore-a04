package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import java.util.List;

import org.junit.jupiter.params.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    ReadFromFile testReader = new ReadFromFile();
    ProcessList testProcessor = new ProcessList();
    static final String FILENAME = "data//exercise46_test_input.txt";

    @Test
    void test_read_file(){
        List<String> testList = testReader.readFromFile(FILENAME);
        assertFalse(testList.isEmpty());
    }

    @Test
    void test_convert_list() {
        List<String> testList = testReader.convertList(FILENAME);
        assertEquals("often",testList.get(0));
    }

    @Test
    void test_find_occurrences() {
        List<String> testList = testReader.convertList(FILENAME);
        List<WordOccurrences> testWords = testProcessor.findOccurrences(testList);
        assertEquals(8, testWords.get(0).getOccurrences());
    }

    @Test
    void testWordOccurrence() {
        WordOccurrences test = new WordOccurrences("test",1);
        test.addOccurrence();
        assertEquals(2,test.getOccurrences());
    }

    @ParameterizedTest
    @CsvSource( {"often,0" , "times,1" , "few,2" , "rare,3"})
    void test_sort_occurrences(String word, String rank) {
        List<String> testList = testReader.convertList(FILENAME);
        List<WordOccurrences> testWords = testProcessor.findOccurrences(testList);
        assertEquals(word, testWords.get(parseInt(rank)).getWord());
    }
}