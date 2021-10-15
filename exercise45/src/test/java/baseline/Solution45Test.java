package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {
    String inFilePath = "data//exercise45_input_test.txt";
    String outFilePath = "data//exercise45_output_test.txt";
    ReadListFromFile testReader = new ReadListFromFile();
    List<String> list = testReader.readFromFile(inFilePath);
    //  methods to test:
    //  ReadListFromFile: readListFromFile
    @Test
    void test_read_file_to_list(){
        //  Tests if list exists and it is of a specific size
        assertEquals(3,list.size());
    }

    //  newList is the first element of list, the first line of the input file
    List<String> newList = testReader.convertList(list);
    //  ReadListFromFile: convertList
    @Test
    void test_convert_list(){
        //  Tests if list has been split properly
        assertEquals("Samus",newList.get(0));
    }

    //  ProcessList: findStrings
    @Test
    void test_find_strings1(){
        //  Tests if the string to replace is accurate to input file
        ProcessList tester = new ProcessList();
        List<String> testStrings = tester.findStrings(newList);
        assertEquals("missile",testStrings.get(0));
    }

    @Test
    void test_find_strings2(){
        //  Tests if the string to replace is accurate to input file
        ProcessList tester = new ProcessList();
        List<String> testStrings = tester.findStrings(newList);
        assertEquals("supermissile",testStrings.get(1));
    }

    @Test
    void test_replace_strings(){
        //  Tests if processed list contains old string as false
        ProcessList tester = new ProcessList();
        List<String> testStrings = tester.findStrings(newList);
        tester.replaceStrings(testStrings.get(0),testStrings.get(1),list);
        assertFalse(list.contains(testStrings.get(0)));
    }

    @Test
    void test_create_file(){
        //  Tests if a file is created with list written
        ProcessList tester = new ProcessList();
        List<String> testStrings = tester.findStrings(newList);
        tester.replaceStrings(testStrings.get(0),testStrings.get(1),list);
        PrintListToFile testPrinter = new PrintListToFile();
        testPrinter.printToFile(list,outFilePath);
        File f = new File(outFilePath);
        assertTrue(f.exists());
    }
}