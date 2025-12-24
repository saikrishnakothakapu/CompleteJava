

public class NestedIfCondition {
    public static void main(String[] args) {

        /* This example demonstrates nested if conditions.
         * It checks if a number is positive and then checks if it is even or odd.
         */

        int number = 15;

        // First level condition: Check if the number is positive
        if (number > 0) {

            // Second level condition: Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is a positive even number.");
            } else {
                System.out.println(number + " is a positive odd number.");
            }
            // End of second level condition
        }
        // End of first level condition
        // Handle the case when the number is not positive 
        else {
            System.out.println(number + " is not a positive number.");
        }
    }
}