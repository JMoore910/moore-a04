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

public class ReadListFromFile {
    //  Create method: List<String> readFromFile(String fileName)
    //      try:
    //      Create a buffered reader br and open it to a new fileReader(fileName)
    //      Create a list of Strings
    //      input = br.readLine()
    //      while input != null
    //          add each line of the input file as a string element to the list
    //          list.add(input)
    //          input = br.readLine()
    //      finally:
    //          close br
    //  return the list


    //  Create method: List<String> convertList(List<String> lines)
    //      Create a full list that adds all elements of i split as a list to it
    //      List<String> full = new ArrayList<>;
    //      Move through list passed as argument with a for each loop
    //      for (String i: list)
    //          i += " %n";
    //          full.addAll(i.asList(i.split(" ")));
    //      return full;
}
