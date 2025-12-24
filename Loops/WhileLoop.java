

public class WhileLoop {

    public static void main(String[] args){

        /* 
        While loop is used to repeat a block of code as long as a specified condition is true.
        The syntax of a while loop is:
        while (condition) {
            // code block to be executed
        }
        */

        int i=0;

        // Example of a while loop
        // This loop will print the value of i from 0 to 4
        // as long as the condition (i < 5) is true
        while (i<5){
            System.out.println("i = "+ i);
            i++;
        }
    }
}