package com.w3.inhertiancemainTest;

import com.w3.employeeinhertiance.Employee;
import com.w3.employeeinhertiance.HrManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeTest {
    @Test
    public void getsalaryTest() {
        int salary = 20000;
        int excepted = 20000;
        Employee e = new Employee(salary);
        int result = e.getSalary();
        Assertions.assertEquals(excepted, result);
        Employee emp = new HrManager(30000);
        int res = emp.getSalary();
        Assertions.assertEquals(30000, res);
    }
        @Test
                public void workTest() {

            String excepted = "working as employee";
            Employee e = new Employee(1000);
            //TO test the methods which just prints i.e., if there is no return type
            // that is done by using below code
            ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStreamCaptor));
            e.work();
            Assertions.assertEquals(excepted+System.lineSeparator(), outputStreamCaptor.toString());
// or you directly return the string for the work()  make return type of work as String
            //instead of sout return the statment as String
           // String s = e. work();
        }


}
