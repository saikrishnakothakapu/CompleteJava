

public class Student {

    public String name;
    public int age;
    public static String universityName;

    static {
        universityName = "LPU";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University Name: " + universityName);
    }
}