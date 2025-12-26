

public class University {



    public static void main(String[] args) {

    

        Professor prof = new Professor("Dr. Raghu", 45);
        
        Student student = new Student("Sai", 20);
        

        System.out.println("\nUpdating Professor Details...");
        //as variables are private in Professor class, we need to use setter methods
        //we cannot access them directly like in Student class
        prof.setName("Dr. Ramesh");
        prof.setAge(50);
        prof.displayInfo();
        System.out.println("************************************************");

        System.out.println("\nUpdating Student Details...");
        //as variables are public in Student class, we can access them directly
        //no need to use setter methods
        //Anyone can access and modify these variables directly
        student.name = "Aman"; //direct access as name is public in Student class
        student.age = 21; //direct access as age is public in Student class
        student.displayInfo();
        System.out.println("************************************************");






    }
}