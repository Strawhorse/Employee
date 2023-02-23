
/**
 * John Bracken
 * sba22328
 * CA1 semester 2
 */


public class Employee {

    // class parameters
    private String name;
    private String email;
    private int empNum;
    
    // static counter for employee number initialised at 1
    static int nextEmpNum = 1;

    // One constructor initialises the name and email instance fields with default values
    public Employee() {
        System.out.println("New employee created");
        this.name = "Default Employee Name";
        this.email = "Default Email Address";
        this.empNum = nextEmpNum;

        // counter to increment the employee number
        nextEmpNum++;
    }
    
    // The other constructor initialises these fields with values passed as parameters
    public Employee(String name, String email) {
        System.out.println("New employee created");
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        
        // counter to increment the employee number        
        nextEmpNum++;
    }
    
    // accessor methods for name, email, and employee number - use getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }


    // set email setter with String email parameter with length check of 3
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        }
        else {
            System.out.println("Sorry, email address is too short!");
        }
    }
    
    // returns the current value of nextEmpNum
    public static void getNextEmpNum(){
        System.out.println("The current value of the nextEmpNum variable is: " + nextEmpNum);
    }
    
}
