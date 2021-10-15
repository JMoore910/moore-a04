package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Read each line of the input text file as a string in a list,
    then parse the list into a larger list with all words included
 */


public class ReadFromFile {
    public List<String> readFromFile(String fileName) {
        //  Read text from input text file line by line into a list to return
        //  Create a list of Strings
        List<String> list = new ArrayList<>();
        //  Create a buffered reader in a try block
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

    public List<String> convertList(String fileName) {
        //  Call to get list as input from file
        List<String> list = readFromFile(fileName);
        //  list is currently full lines, each needs to be split
        List<String> parsedList = new ArrayList<>();
        //  enter a for loop and parse each element of the list
        //  and set it into parsedList
        for (String i: list)
            parsedList.addAll(Arrays.asList(i.split(" ")));
        return parsedList;
    }
}
