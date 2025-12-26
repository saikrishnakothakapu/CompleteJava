

public class Demo {

    static {
        /* Static block executed once when the class is loaded
         we can use static block to initialize static variables
         we can use static block to execute code before main method */
        System.out.println("Static block executes when the class is loaded. Even before main method is executed.");
    }

        public static void main(String[] args) {
            System.out.println("Main method executed.");
        }
    
}