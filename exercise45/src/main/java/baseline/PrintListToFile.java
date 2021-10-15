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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrintListToFile {
    public static final Scanner input = new Scanner(System.in);


    public void readAndProcessList(String inFile) {
        //  method made specifically to run processes of other classes and their methods
        //  this method contains no non-borrowed processes, so I believe it does not merit a test case
        //  Create a list of Strings
        List<String> replacers;
        List<String> firstLine;
        //  Create a ReadListFromFile object readObj
        //  Create a ProcessList object processObj
        ReadListFromFile readObj = new ReadListFromFile();
        ProcessList processObj = new ProcessList();

        //  move list through other class' methods until you have a processed list
        List<String> list = readObj.readFromFile(inFile);
        firstLine = readObj.convertList(list);
        replacers = processObj.findStrings(firstLine);
        processObj.replaceStrings(replacers.get(0),replacers.get(1),list);
        //  call to get file name from user
        String fileName = getFileName();
        printToFile(list,fileName);
    }


    private String getFileName() {
        //  method for user input, does not merit a test case
        String fileName;
        //  prompt user to input a filename without .txt file extension
        while (true) {
            System.out.println("Please enter an output text file name\nDo not include extensions");
            fileName = input.nextLine();
            if (!fileName.contains("."))
                break;
            System.out.println("That is not a valid file name: Do not give extensions and remove periods.%n");
        }
        //      concatenate fileName to format it properly
        fileName = "data//" + fileName + ".txt";
        return fileName;
    }


    public void printToFile(List<String> list,String outFile) {
        //  method to print a list to an output file
        //  create a buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            //  enter a for each loop to go through list printing all strings
            for (String i : list) {
                bw.write(i);
                bw.write("\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        //  When program finishes, file is created within data folder
    }
}
