package baseline;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private String salary;

    Employee() {
    }

    public void parseInput(String employeeInfo) {
        List<String> employeeParsed;
        //  use split() to split the string passed in into a list of strings
        employeeParsed = Arrays.asList(employeeInfo.split(","));
        //  then use setters to set all variables
        setLastName(employeeParsed.get(0));
        setFirstName(employeeParsed.get(1));
        setSalary(employeeParsed.get(2));
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }

}
