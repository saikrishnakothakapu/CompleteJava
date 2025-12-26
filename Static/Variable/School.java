

public class School {

    public static void main(String[] args){

        /* Here we are creating two objects of Student class and setting the static variable schoolName using
         the class name itself. Then we are displaying the information of both students. Since schoolName is static,
         it will have the same value for both objects. */

        Student student1 = new Student("Sai", 25);
        Student student2 = new Student("Krishna",26);

        Student.setSchoolName("LPU");

        student1.displayInfo();
        
        student2.displayInfo();
    }
}