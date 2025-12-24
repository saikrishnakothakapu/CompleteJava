

public class TernaryOperator {
    public static void main(String[] args) {

        /* The ternary operator is a shorthand for an if-else statement.
         * It takes three operands: a condition, a value if true, and a value if false.
         * Syntax: condition ? value_if_true : value_if_false;
         */
        
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;

        System.out.println("The maximum value is: " + max);
    }
}   