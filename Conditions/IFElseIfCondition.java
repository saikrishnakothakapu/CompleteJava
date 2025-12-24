

public class IfElseIfCondition {
    public static void main(String[] args) {

        /* 
        Example of if-else if-else condition 
        to check the value of a number and print appropriate messages.

        */

        int number = 15;

        // Check the value of the number using if-else if-else
        
        if (number > 20) {
            System.out.println("The number is greater than 20.");
        } else if (number > 10) {
            System.out.println("The number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("The number is 10 or less.");
        }
    }
}