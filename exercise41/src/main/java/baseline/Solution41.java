package baseline;


/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Due to multiple problems faced during pushing, renaming etc,
    I lost history of commits prior to completion of exercise
    including pseudocode commits. I cannot recover this, I am sorry

        
    Create an application that reads a list of names from
    file, then sorts them alphabetically, and calculates
    the name count
    Create method: ArrayList<String> readFile()
        Uses a buffered reader to read a text file and adds each line to a list
        which it then returns
    Create method: ArrayList<String> sortList(ArrayList<String> list)
        takes in the list and looks at the first character of each element,
        finding the least, and moving it to the front. Do so in a for loop
        with a nested for each loop
    Create method: void printList(ArrayList<String> list)
        goes through each element of list and prints it
        using a for each loop
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution41 {


    public static void main(String[] args) throws IOException {
        //  Create an object of class Sorter
        Sorter sortObject = new Sorter();
        //  Create a list to store names
        List<String> nameList = new ArrayList<>();
        //  Call method to fill list with names from file
        nameList = sortObject.readFile(nameList);
        //  Call method to sort list in alphabetical order
        nameList = sortObject.alphabetSortList(nameList);
        //  Pass in the list to be printed by the Sorter Object
        sortObject.printToFile(nameList);
    }
}
