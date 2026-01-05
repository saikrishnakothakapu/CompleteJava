

public class Demo {

    public static void main(String[] args){

        Calculator cal = (x,y) -> x+y;
        Calculator cal1 = (x,y)-> x-y;
        Calculator cal2 = (x,y)-> x*y;

        System.out.println("Sum of two numbers " + cal.calculate(5,7));
        System.out.println("Subtraction of two numbers " + cal1.calculate(6,2));
        System.out.println("Multiplication of two numbers " + cal2.calculate(2,9));

    }
}