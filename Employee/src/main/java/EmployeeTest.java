/*
 * Employee test class containing the main method
 */


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * John Bracken
 * sba22328
 * CA1 semester 2
 */

public class EmployeeTest {
    
    // main method
    public static void main(String[] args) {

        // creating 3 new instances of the class Employee

        Employee employee1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");


        // array to store these 3 employee objects loaded with their values
        Employee[] projectGroup = new Employee[]{employee1, employee2, employee3};


        // prints out the value of variable nextEmpNum to the terminal window
        // changed this to a static void method, so it could simply be called with class name and method name
        Employee.getNextEmpNum();


        // search and display the name of each of the employees in the projectGroup array
        // who have an employee number ABOVE the value stored in a variable called m (set as 1 here to test)

        int m = 1;
        System.out.println("Looking for employees with an employee number greater than " + m);
        for (Employee employee : projectGroup) {
            while (employee.getEmpNum() > m) {
                System.out.println("Employee number " + employee.getEmpNum() + " is called " + employee.getName());
                break;
            }
        }

    }
}
