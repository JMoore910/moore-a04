package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Create an application that opens a text file for input,
    reads the text file into an ArrayList of Strings,
    then, loop through the arraylist to create a list of type WordOccurrences,
    a class data structure which stores a string, and an int number of times
    that string has been read.
    next, loop through that list to find the most commonly occurring word.
    loop to print a number of stars corresponding to how many times it has been read,
    then remove that word from the list
    //  Classes: WordOccurrences
    //           ReadFromFile
    //           ProcessList
 */

import java.io.FileNotFoundException;

public class Solution46 {
    private static final String FILEPATH = "data//exercise46_input.txt";
    public static void main(String[] args) throws FileNotFoundException {
        ProcessList processor = new ProcessList();
        processor.printOccurrences(FILEPATH);
    }
}
