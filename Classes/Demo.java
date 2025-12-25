
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Calculator cal = new Calculator();

        System.out.println("Addition: " + cal.add(num1, num2));
        System.out.println("Subtraction: " + cal.subtract(num1, num2));
        System.out.println("Multiplication: " + cal.multiply(num1, num2));
        try {
            System.out.println("Division: " + cal.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}