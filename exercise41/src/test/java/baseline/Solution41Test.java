package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Sorter sort = new Sorter();
    ArrayList<String> testList = new ArrayList<>(Arrays.asList(
            "Xavier,Charles",   // sorted array as follows  :   "Aran,Samus"
            "Wheezer,Carl",     //                          :   "Marley,Bob"
            "Aran,Samus",       //                          :   "Obama,Barack"
            "Marley,Bob",       //                          :   "Wheezer,Carl"
            "Obama,Barack"      //                          :   "Xavier,Charles"
    ));

    //Test two locations in sorted list to see if it was sorted properly

    @Test
    void test_alphabet_sort_1(){
        List<String> actualList;
        actualList = sort.alphabetSortList(testList);
        assertEquals("Aran,Samus",actualList.get(0));
    }

    @Test
    void test_alphabet_sort_2(){
        List<String> actualList;
        actualList = sort.alphabetSortList(testList);
        assertEquals("Obama,Barack",actualList.get(2));
    }

    @Test
    void output_file_exists() throws IOException {
        ListPrinter testPrint = new ListPrinter();
        File f = testPrint.printToFile(testList);
        assertTrue(f.exists());
    }
}