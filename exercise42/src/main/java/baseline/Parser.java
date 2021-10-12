package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private List<String> readFromFile(String in) throws IOException {

        //  Create String list to return
        List<String> list = new ArrayList<>();
        //  Create BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(in))) {
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

    //  Use Parser class to store parsing non statically
    public List<Employee> parseInput(String in) throws IOException {
        //  Create arrayList to return
        List<Employee> employeeList = new ArrayList<>();
        //  Create arrayList to store inputs and read input into input list
        Employee emp;
        List<String> inputList = readFromFile(in);
        for (String i : inputList) {
            //  use variable emp to represent employee data being added to list
            emp = new Employee();
            //  call parse method through emp
            emp.parseInput(i);
            employeeList.add(emp);
        }
        return employeeList;
    }


    public void printList(List<Employee> list) {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (Employee emp : list) {
            int numSpaces = 10 - emp.getLastName().length();
            System.out.print(emp.getLastName());
            for (int i = 0; i < numSpaces; i++) {
                //  print a space for the number of spaces
                System.out.print(" ");
            }
            numSpaces = 10 - emp.getFirstName().length();
            System.out.print(emp.getFirstName());
            for (int i = 0; i < numSpaces; i++) {
                //  print a space for the number of spaces
                System.out.print(" ");
            }
            System.out.println(emp.getSalary());
            //  when loops are exited a full table of each employee info will have been printed
        }
    }

}
