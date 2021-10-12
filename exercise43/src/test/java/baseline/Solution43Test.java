package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    //  Create a test that constructs a website with 4 input strings as arguments
    //  then test to see if getters work
    public Website test = new Website("Onion","Shrek",true,true);

    @Test
    void test_getter1(){
        assertEquals("Shrek",test.getAuthor());
    }

    @Test
    void test_getter2(){
        assertTrue(test.getJavaDir());
    }

}