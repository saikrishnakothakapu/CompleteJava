public class Demo {

    public static void main(String[] args){

        /* Create objects of Parent and Child classes
         * and demonstrate method overriding
         */

        // Creating object of Parent class
        Parent parent = new Parent("Krishna",25);

        // Creating object of Child class
        Child child = new Child("sai",26, "LPU");

        // Creating Parent class reference but Child class object
        Parent polyParent = new Child("Saikrishna", 26, "LPU");

        parent.getInfo();
        System.out.println("==============================");
        child.getInfo();
        System.out.println("==============================");
        polyParent.getInfo();

    }
}