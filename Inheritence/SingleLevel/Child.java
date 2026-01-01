

/*
 * Child.java
 * This class demonstrates single-level inheritance by extending the Parent class.
 */
public class Child extends Parent {

    /* 
    Method to display a message specific to the Child class
     */


    public void show() {
        System.out.println("This is the Child class.");
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
    }
}