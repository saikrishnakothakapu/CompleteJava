

public class Student {

    private String name;
    private int age;
    // Static variable to hold the school name shared by all instances
    // Static variable will be shared among all objects of the class. Same as a global variable
    // Only one copy of static variable will be created in the memory
    // It can be accessed by class name itself
    private static String schoolName;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School Name: " + schoolName);
        System.out.println("--------------");
    }

}