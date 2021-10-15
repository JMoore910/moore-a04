package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import java.util.ArrayList;
import java.util.List;

/*
Create a class for string list processing.
    When processing, first find the first two strings surrounded by quotation marks
    the first one found will be the string to replace, and the second will be the
    string that replaces.
    Return to the start of the list and move through again, this time comparing each
    element to the replaced string, then if they are equal, assign the replacer string
    to that element.
    Conditions when searching the list to look out for are whether the string contains
    quotation marks. If so, replace with replacer string with quotation marks
    concatenated onto the front and back
    When finished, the program will return a changed list with all strings that need replacing
    being properly replaced
 */
public class ProcessList {
    public List<String> findStrings(List<String> list) {
        //  method finds first two strings enclosed with quotes
        //  Create a list to return that will contain the replaced string in the first element,
        //  and the replacer string in the second
        List<String> strings = new ArrayList<>();
        //  create a counting variable for counting the two string being found
        int j = 0;
        //  Enter a for each loop to search the list passed in as an argument
        for(String i: list) {
            if(i.startsWith("\"")) {
                //  add the string element without quotation marks to the list
                strings.add(i.replaceAll("[\"]", ""));
                j ++;
            }
            if (j>=2) {
                //  found both strings, exit loop
                break;
            }
        }
        return strings;
    }


    public void replaceStrings(String replaced, String replacer, List<String> list) {
        //  now search argument list for all elements that match the replaced string
        //  create count variable to track index of list we are at
        //  use String i in for loop to represent the element at each index
        int count = 0;
        for (String i: list) {
            //  Use String.replaceAll to replace all instances of the String you want to replace
            list.set(count,i.replaceAll(replaced, replacer));
            count++;
        }
    }
}
