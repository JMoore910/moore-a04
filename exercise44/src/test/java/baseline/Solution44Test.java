package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.*;
import org.junit.jupiter.api.Test;

class Solution44Test {
    //Methods to test:
    //  CreateJSONArray.readJsonFile
    //  SearchJSONArray.searchJsonArray

    //  From all four classes these two methods are the only ones which are not responsible for printing
    //  or getting input from user
    CreateJSONArray createTester = new CreateJSONArray();
    SearchJSONArray searchTester = new SearchJSONArray();

    @Test
    void test_create_json_array(){
        JsonArray testArray = createTester.readJsonFile("data//Exercise44_test_input.json");
        JsonElement testElement = testArray.get(6);
        String testString = testElement.getAsJsonObject().get("name").getAsString();
        assertEquals("Wide Beam",testString);
    }


    @Test
    void test_search_json_array1(){
        JsonArray testArray = createTester.readJsonFile("data//Exercise44_test_input.json");
        Product test;
        test = searchTester.searchJsonArray("Super Missiles",testArray);
        assertEquals(250,test.getQuantity());
    }

    @Test
    void test_search_json_array2(){
        JsonArray testArray = createTester.readJsonFile("data//Exercise44_test_input.json");
        Product test;
        test = searchTester.searchJsonArray("Screw Attack",testArray);
        assertEquals(1500.00,test.getPrice());
    }



}