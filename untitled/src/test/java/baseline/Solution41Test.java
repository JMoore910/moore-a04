package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Solution41 sol41 = new Solution41();
    ArrayList<String> testList = new ArrayList<>(Arrays.asList(
            "Xavier,Charles",   // sorted array as follows  :   "Aran,Samus"
            "Wheezer,Carl",     //                          :   "Marley,Bob"
            "Aran,Samus",       //                          :   "Obama,Barack"
            "Marley,Bob",       //                          :   "Wheezer,Carl"
            "Obama,Barack"      //                          :   "Xavier,Charles"
    ));



    @Test
    public void test_alphabet_sort_1(){
        List<String> actualList = new ArrayList<>();
        //actualList = sol41.alphabetSortList(testList)
        //assert equals("Aran,Samus",actualList(0))
    }

    @Test
    public void test_alphabet_sort_2(){
        List<String> actualList = new ArrayList<>();
        //actualList = sol41.alphabetSortList(testList)
        //assert equals("Obama,Barack",actualList(2))
    }
}