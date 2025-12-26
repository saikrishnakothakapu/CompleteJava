

public class Company {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Krishna");
        Employee emp2 = new Employee(102, "Reddy");

        /* Using Non-Static Method to display Employee Info 
           we cannot access non-static method directly using class name
           we need to create object to access non-static method
           we cannot access non-static method inside static method directly
           we should use object reference to access non-static method
           
        */

        System.out.println("Non Static Method Calls Before Changing Company Name");
        emp1.displayInfo();
        emp2.displayInfo();

        Employee.displayCompanyInfo();

        Employee.setCompanyName("Innovative Tech Corp.");

        System.out.println("Non Static Method Calls After Changing Company Name:");
        emp1.displayInfo();
        emp2.displayInfo();

        System.out.println("Static Method Calls After Changing Company Name:");
        Employee.displayInfo1(emp1);
        Employee.displayInfo1(emp2);
    }
}