package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    //  Create a test that constructs a website with 4 input strings as arguments
    //  then test to see if getters work
    public Website testWebsite = new Website("Onion","Shrek",true,true);
    public WebsiteCreator testCreator = new WebsiteCreator();

    @Test
    void test_getter1(){
        assertEquals("Shrek",testWebsite.getAuthor());
    }

    @Test
    void test_getter2(){
        assertTrue(testWebsite.getJavaDir());
    }

    @Test
    void test_HTML_created() throws IOException {
        File f = testCreator.createWebsite(testWebsite,"data//test data//");
        assertTrue(f.exists());
    }
}