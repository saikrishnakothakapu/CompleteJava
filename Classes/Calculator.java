

public class Calculator {

    /* Basic arithmetic operations: addition, subtraction, multiplication, division */

    // Method to add two integers
    public int add(int a, int b){
        return a+b;
    }

    // Method to subtract two integers          
    public int subtract(int a, int b){
        return a-b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b){
        return a*b;
    }

    // Method to divide two integers
    public double divide(int a, int b){

        if(b==0){
            // Handle division by zero
            // You can throw an exception or return a special value
            // Here, we choose to throw an exception
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }

        return (double) a/b;
    }
}