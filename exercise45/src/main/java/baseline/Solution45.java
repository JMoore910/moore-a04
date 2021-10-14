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

    Create a class for printing that creates a ReadListFromFile object, and
    a ProcessList object, then calls their methods to get a list to output to a file
    The program will need to ask the User for the name of the file they wish to create,
    then the file's path is set to be "data//" + userInput + ".txt"
    specify to user to not input a string including a file extension as it is added automatically
    loop to validate that their string does not contain ".txt" if so, make them input a new string
    Once a valid fileName has been input, it is then created at the specified location.
    Then, the program creates a buffered writer which takes the new list obtained from the
    ProcessList object and outputs all string elements to the file. If an end of line indicator is found,
    instead print end of line. Close the buffered writer.
    When finished, there will exist a new file of the user specified name, with the changed text from
    the input file.
 */

public class Solution45 {
    //  private static final String FILEPATH = "data//exercise45_input.txt";
    public static void main(String[] args) {
        //  Create a PrintListToFile object app
        //  app.printListToFile(FILEPATH);
    }
}
