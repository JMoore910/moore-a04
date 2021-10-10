package baseline;

import java.io.IOException;


/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
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

public class Solution41 {
    //  Create Method: ArrayList<String> readFile(ArrayList<String> list, String fileName)
    //      Create BufferedReader
    //      BufferedReader br = new BufferedReader(new FileReader(fileName));
    //      try {
    //          declare variable to read a line from file
    //          String input = br.readLine();
    //          while (input != null) {
    //              add input to the list
    //              list.add(input)
    //              input = br.readLine();
    //          }
    //      } finally {
    //          br.close();
    //      }
    //      return list of inputs


    //  Create Method: ArrayList<String> alphabetSortList(ArrayList<String> list)
    //      array list passed in as argument
    //      use index to signify location of found lowest string
    //      use lowest string to represent the string that will come first in
    //      the list alphabetically;
    //      String lowest;
    //      int index;
    //      int k = 0;
    //      open loops
    //      for (int i = 0; i < list.length(); i ++)
    //          lowest = list(i);
    //          index = i;
    //          for (int j = i; j < list.length(); j ++)
    //              while(1)
    //                  check if the element of the list is lower than the current lowest,
    //                  iterates through all characters until it finds a character that is lower or higher
    //                  first checks if it is reading the comma character yet
    //                  if (lowest.charAt(k) == ',') || (list(j).charAt(k) == ',')
    //                      continue on with no changes
    //                      break;
    //                  else if(lowest.charAt(k) > list(j).charAt(k))
    //                      if list element is the new lowest, assign the element to lowest
    //                      lowest = list(j)
    //                      index = j;
    //                      break;
    //                  else if(lowest.charAt(k) < list(j).charAt(k))
    //                      list element is not lowest, continue on with no changes
    //                      break;
    //              exit while loop and j for loop.
    //          move the lowest into the first spot. If lowest didn't change, neither will
    //          list(index) = list(i)
    //          list(i) = lowest
    //      once through the for loop, return the list
    //      return list

    //  Create Method: void printToFile(ArrayList<String> list, String fileName)
    //      use a for each loop and print out the string i at each element of list
    //      for (String i : list)
    //          Path outFile = Path.of(".txt");
    //          Files.writeString(outFile,i);


    public static void main(String[] args) throws IOException {
        //  List<String> nameList = new ArrayList<>();
        //  nameList = readFile(nameList,"exercise41_input.txt")
        //  nameList = alphabetSortList(nameList)
        //  printToFile(nameList,"exercise41_output.txt")
    }
}
