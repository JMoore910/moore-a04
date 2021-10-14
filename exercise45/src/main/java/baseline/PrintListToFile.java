package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
Create a class for printing that creates a ReadListFromFile object, and
    a ProcessList object, then calls their methods to get a list to output to a file
    The program will need to ask the User for the name of the file they wish to create,
    then the file's path is set to be "data\" + userInput + ".txt"
    specify to user to not input a string including a file extension as it is added automatically
    loop to validate that their string does not contain ".txt" if so, make them input a new string
    Once a valid fileName has been input, it is then created at the specified location.
    Then, the program creates a buffered writer which takes the new list obtained from the
    ProcessList object and outputs all string elements to the file. If an end of line indicator is found,
    instead print end of line. Close the buffered writer.
    When finished, there will exist a new file of the user specified name, with the changed text from
    the input file.
 */

public class PrintListToFile {
    //  Create method: List<String> readAndProcessList(String inFile)
    //      Create a list of Strings
    //      List<String> readList;
    //      List<String> replacers;
    //      List<String> processed;
    //      Create a ReadListFromFile object readObj
    //      Create a ProcessList object processObj
    //      move list through other class' methods until you have a processed list
    //      list = readObj.readListFromFile(inFile);
    //      list = readObj.convertList(list);
    //      replacers = processObj.findStrings(list);
    //      processed = processObj.replaceStrings(replacers.get(0),replacers.get(1),list);
    //      return processed;


    //  Create method: String getFileName()
    //      String fileName;
    //      prompt user to input a filename without .txt file extension
    //      while (true)
    //          print: "Please enter an output text file name%nDo not include extensions"
    //          fileName = input.nextLine();
    //          if !fileName.contains(".")
    //              break;
    //          print: "That is not a valid file name: Do not give extensions and remove periods.%n"
    //      concatenate fileName to format it properly
    //      fileName = "data\" + fileName + ".txt";
    //      return fileName;


    //  Create method: void printListToFile(String inFile)
    //      List<String> list = readAndProcessList(inFile);
    //      create a buffered writer
    //      call to get file name from user
    //      String fileName = getFileName();
    //      try:
    //          BufferedWriter bw = new BufferedWriter(New file(fileName))
    //          enter a for each loop to go through list printing all strings, and a new line when
    //          a new line is found
    //          for (String i : list)
    //              if (i.contains("%n"))
    //                  bw.print("%n");
    //              else
    //                  bw.print(i);
    //      finally:
    //          close bw
    //      When program finishes, file is created within data folder
}
