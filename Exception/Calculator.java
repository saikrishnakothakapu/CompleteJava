

public class Calculator {

    public int divide(int num1, int num2){

        int result =0;

        try{
             result = num1/num2;
        }
        catch(Exception e){
            System.out.println("Exception message:" + e);
        }

        return result;
    }
}