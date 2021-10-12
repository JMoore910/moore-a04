package baseline;

import org.junit.jupiter.api.Test;

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
}