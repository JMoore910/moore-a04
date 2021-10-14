package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

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
    //  Create method: List<String> findStrings(List<String> list)
    //      Create a list to return that will contain the replaced string in the first element,
    //      and the replacer string in the second
    //      List<String> strings = new ArrayList<>();
    //      create a counting variable for counting the two string being found
    //      int j = 0;
    //      Enter a for each loop to search the list passed in as an argument
    //      for(String i: list)
    //          if(i.contains("[\"]"))
    //              add the string element without quotation marks to the list
    //              strings.add(i.replaceAll("^\"+|\"+$", ""))
    //              j ++;
    //          if (j>=2)
    //              found both strings, exit loop
    //              break;
    //      return strings;


    //  Create method: List<String> replaceStrings(String replaced, String replacer, List<String> list)
    //      String temp = "";
    //      now search argument list for all elements that match the replaced string
    //      if the element at an index matches the replaced string,
    //          set at that index the replacer string
    //      else if the element at an index contains quotation marks and contains the replaced string
    //          check if there is a quotation mark at the start
    //              if so, concatenate a quotation mark to temp string
    //          check if there is a quotation mark at the end
    //              if so, concatenate replacer string and a quotation mark to temp string
    //          else
    //              concatenate replacer string to temp string
    //          set at that index the temp string;
    //      return list;
}
