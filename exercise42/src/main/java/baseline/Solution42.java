package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Create an application that reads a list of strings from file, each string will need to be parsed
    Create method: ArrayList<String> readFromFile()
        reads contents of a file into a list of strings, then returns the list
    Create method: ArrayList<Employee> parseInput(ArrayList<Employee> list)
        take an empty list of employees, and a list of the string inputs,
        then for each employee element, parse the corresponding input element to it
    Create method: void printList(ArrayList<Employee> list)
        prints out a table format to User

    Create class: Employee
        Create a method in Employee class that takes a String, parses (split()) it and sets last name,
        first name, and salary to an object employee
 */


import java.io.IOException;
import java.util.List;

public class Solution42 {
    //  All methods moved to Parser class
    public static void main(String[] args) throws IOException {
        Parser parse = new Parser();
        //  Give file path within function call
        List<Employee> employeeList = parse.parseInput("data\\exercise42_input.txt");
        parse.printList(employeeList);
    }
}
