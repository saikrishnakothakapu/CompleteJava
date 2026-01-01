
public class Demo {
    // Main method to demonstrate single-level inheritance

    public static void main(String[] args){

        /* Single-Level Inheritance:
         * In single-level inheritance, a class (Child) inherits from another class (Parent).
         * The Child class can access the methods and properties of the Parent class.
         */

        System.out.println("Single-Level Inheritance Demonstration");
        System.out.println("--------------------------------------------------");
        /* Creating an instance of Parent class */
        Parent parent = new Parent();
        parent.display();
        System.out.println("Addition: " + parent.add(10, 5));
        System.out.println("Subtraction: " + parent.subtract(10, 5));

        /* Creating an instance of Child class */
        System.out.println("--------------------------------------------------");
        System.out.println("Now demonstrating Child class which inherits from Parent class:");
        Child child = new Child();
        child.show();
        System.out.println("Multiplication: " + child.multiply(10, 5));
        System.out.println("Division: " + child.divide(10, 5));

        /* Demonstrating that Child class can access Parent class methods */
        System.out.println("Using Parent class methods from Child class:");
        Parent parentRefChild = new Child();
        parentRefChild.display();
        System.out.println("Addition using parent reference to child: " + parentRefChild.add(20, 10));
        System.out.println("Subtraction using parent reference to child: " + parentRefChild.subtract(20, 10));
        System.out.println("Note: Cannot access Child class methods using Parent reference.");
        System.out.println("--------------------------------------------------");
        System.out.println("Inheritance demonstration completed.");

    }
}