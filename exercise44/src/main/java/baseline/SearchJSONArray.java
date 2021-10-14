package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import com.google.gson.*;
import java.util.Scanner;


public class SearchJSONArray {
    private static final Scanner input = new Scanner(System.in);


    private String getUserSearch() {
        //  prompt user to input a product name to search for
        System.out.print("What is the product name? ");
        return input.nextLine();
    }


    public Product searchJsonArray(String search, JsonArray json) {
        //      get product name from user input method
        for (JsonElement i: json) {
            if (i.getAsJsonObject().get("name").getAsString().equals(search)) {
                return new Product(i.getAsJsonObject().get("name").getAsString(), i.getAsJsonObject().get("price").getAsDouble(),
                        i.getAsJsonObject().get("quantity").getAsInt());
            }
        }
        //      if product name is not contained in Json array, loop will exit
        //      returns a product of the name "Product not found"
        return new Product("Product not found",0.0,0);
    }


    public void runSearch(String filePath) {
        //      Run search is a basic method meant to pull complexity away from main,
        //      and integrate it into responsibility of SearchJSONArray class
        //      it loops for input and outputs based on the results of other
        //      functions in this class and, as such, I believe it does not require a test case.
        //
        CreateJSONArray arrayCreator = new CreateJSONArray();
        JsonArray jsonArray = arrayCreator.readJsonFile(filePath);
        Product product;
        String search;
        while (true) {
            //    start input loop
            search = getUserSearch();
            product = searchJsonArray(search, jsonArray);
            if (product.getName().equals("Product not found"))
                System.out.println("Sorry, that product was not found in our inventory%n");
            else
                break;
        }
        //      once out of loop, print Product name, price, and quantity
        product.printProduct();
    }
}
