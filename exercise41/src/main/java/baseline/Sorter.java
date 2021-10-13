package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Sorter {
    private final String inFileName;

    public Sorter() {
        //  Constructor for sorter object: Point files at their respective paths
        inFileName = "data\\exercise41_input.txt";
    }

    public List<String> readFile(List<String> list) throws IOException {
        //  SonarLint calls for this function to be static
        //  Create BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(inFileName))) {
            //  declare variable to read a line from file
            String input = br.readLine();
            while (input != null) {
                //  add input to the list
                list.add(input);
                input = br.readLine();
            }
        }
        //      return list of inputs
        return list;
    }

    public List<String> alphabetSortList(List<String> list) {
        //Use collections sort
        sort(list);
        return list;
    }


    public void runSorter() throws IOException {
        //  Create an object of class Sorter
        Sorter sortObject = new Sorter();
        ListPrinter printer = new ListPrinter();
        //  Create a list to store names
        List<String> nameList = new ArrayList<>();
        //  Call method to fill list with names from file
        nameList = sortObject.readFile(nameList);
        //  Call method to sort list in alphabetical order
        nameList = sortObject.alphabetSortList(nameList);
        //  Pass in the list to be printed by the Sorter Object
        if (printer.printToFile(nameList).exists())
            System.out.println("File printed!");
    }
}
