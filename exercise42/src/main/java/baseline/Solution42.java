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


public class Solution42 {
    //  Set File Path
    //  private final String in = "data\\exercise42_input.txt";


    //  Create method: private ArrayList<String> readFromFile() throws IOException
    //      Create String list to return
    //      List<String> list = new ArrayList<>();
    //      Create BufferedReader
    //      BufferedReader br = new BufferedReader(new FileReader(in))
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
    //      return list;


    //  Create method: public ArrayList<Employee> parseInput()
    //      Create arrayList to return
    //      List<Employee> employeeList = new ArrayList<>();
    //      Create arrayList to store inputs and read input into input list
    //      Employee emp;
    //      List<String> inputList = readFromFile();
    //      for (String i : inputList)
    //          use variable emp to represent employee data being added to list
    //          emp = new Employee();
    //          call parse method through emp
    //          emp.parseInput(i);
    //          employeeList.add(emp);
    //      return employeeList;

    //  Create method: private void printList(ArrayList<Employee> list)
    //      print: "Last      First     Salary"
    //      print: "--------------------------"
    //      for (Employee emp : list) {
    //          int numSpaces = 10 - emp.getLastName().length()
    //          print: emp.getLastName()
    //          for (int i = 0; i < numSpaces; i++)
    //              print a space for the number of spaces
    //              print: " "
    //          int numSpaces = 10 - emp.getFirstName().length()
    //          print: emp.getFirstName()
    //          for (int i = 0; i < numSpaces; i++)
    //              print a space for the number of spaces
    //              print: " "
    //          print: emp.getLastName()
    //          print: \n
    //      when loops are exited a full table of each employee info will have been printed


    public static void main(String[] args) {
        //  List<Employee> employeeList = parseInput();
        //  printList(employeeList);
    }
}
