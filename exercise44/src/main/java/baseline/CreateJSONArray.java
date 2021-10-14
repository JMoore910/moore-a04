package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import com.google.gson.*;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CreateJSONArray {
    public JsonArray readJsonFile(String file) {
        //      method returns a Json Array that can be read and checked by user
        //      Read the file to a string the string can then be parsed to a Json object
        try {
        //          create object that is read from file at specified filepath
        Object parseObj = JsonParser.parseReader(new FileReader(file));
        JsonObject json = (JsonObject) parseObj;
        return (JsonArray) json.get("products");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new JsonArray();
    }
}
