

public class FinalVariable {

    

    public static void main(String[] args){

        final int num =10;

        //num=11;
        // If you try to assign new value to final variable it will throw compilation error 
        /*FinalVariable.java:11: error: cannot assign a value to final variable num
        num=11;
        ^
        1 error
        */
       
        System.out.println(num);

    }
}