
public class DoWhileLoop {

    public static void main(String[] args) {

        /*
            Do while loop is similar to while loop, the only difference is that
            in do while loop, the condition is checked after executing the loop body.
            This means that the loop body will always execute at least once,
            even if the condition is false from the beginning.
            */

        int i=0;

        /* 
        do{
            System.out.println("Value of i: " + i);
            i++;
        }
        while(i<5);
        }     
        */

        // Example of do while loop that executes only once
       

        do{
            System.out.println("Value of i: " + i);
            i++;
        }
        while(i<5);
    }
}