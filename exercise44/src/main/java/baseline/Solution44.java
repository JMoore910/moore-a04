package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Create an application that reads a Json file as input to a JSON Array using a JsonParser
    application then gets input from user for the name of a product and searches the JSON array
    for the name of that product, and if it finds the product, returns a Product containing
    the array element's name, price, and quantity
    the searcher object then calls the Product's printProduct method.
    the user must enter the name of a product in inventory, and will be stuck in a loop until they
    do so.
 */


public class Solution44 {
    private static final String FILEPATH = "data//exercise44_input.json";
    public static void main(String[] args) {
        // Create a searcher object that finds an object from the input JSON file
        SearchJSONArray searcher = new SearchJSONArray();
        searcher.runSearch(FILEPATH);
    }
}
