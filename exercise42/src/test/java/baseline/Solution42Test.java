package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    Solution42 sol42 = new Solution42();


    @Test
    public void parser_Test() throws IOException {
        //Check that input from file has been parsed properly
        Parser test_parse = new Parser();
        List<Employee> test_list = new ArrayList<>();
        test_list = test_parse.parseInput("data\\exercise42_test_input.txt");
        assertEquals("Hideo",test_list.get(1).getFirstName());
    }

    @Test
    public void employee_test(){
        //Check that a specific string parses and is assigned to an employee object correctly
        Employee test_emp = new Employee();
        test_emp.parseInput("Johnson,Eric,77777");
        assertTrue((test_emp.getLastName().equals("Johnson"))&&(test_emp.getFirstName().equals("Eric"))&&(test_emp.getSalary().equals("77777")));
    }

}