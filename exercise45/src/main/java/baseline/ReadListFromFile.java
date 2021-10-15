package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
Create a class that takes a list of strings as input from a file
    'data//exercise45_input.txt' is opened by a new FileReader inside of
    a Buffered Reader constructor.
    The reader will reach each line of the file as its own string, and add that string to a list of strings
    inside a for loop, concatenate a space and an endline character onto the string element.
    Then, each element in the list is split into another, temporary list by spaces.
    after the split, a new list is used to addAll elements in the temporary list, looping
    until reaching the end of the original list. Close the buffered reader
    When finished, the program will return a list with all strings in the list as their own element,
    including additional endLine indicators
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadListFromFile {
    public List<String> readFromFile(String fileName) {
        //      Create a list of Strings
        List<String> list = new ArrayList<>();
        //  Create a buffered reader in an automated try block
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String input = br.readLine();
            while (input != null) {
                //  add each line of the input file as a string element to the list
                list.add(input);
                input = br.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return list;
    }
    //  Convert List is necessary to receive a list of strings to find the replacement string
    public List<String> convertList(List<String> list) {
        //  Return a list that adds all elements of the first line split as
        return (Arrays.asList(list.get(0).split(" ")));
    }
}
