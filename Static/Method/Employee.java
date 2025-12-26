

public class Employee{

    private int id;
    private String name;
    private static String companyName;

    static {
        companyName = "Tech Solutions Inc.";
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    /* Non-static method to display employee details
       We can use static variables inside non-static methods
    */
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------------");
    }

    public static void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------------");
    }

    /* Static method to display employee details
       We cannot use non-static variables directly inside static methods
       Hence we pass Employee object as parameter to access non-static variables
    */

    public static void displayInfo1(Employee emp){
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------------");
    }




}