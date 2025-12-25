import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = sc.nextDouble();
    System.out.print("Enter third number: ");
    double num3 = sc.nextDouble();
    System.out.print("Enter fourth number: ");
    double num4 = sc.nextDouble();

    Addition addition = new Addition();

    // Using overloaded methods to add numbers
    double twoNumResult = addition.add(num1, num2);
    System.out.println("Sum of two numbers: " + twoNumResult);
    System.out.println("*****************");

    // Using overloaded methods to add numbers
    double threeNumResult = addition.add(num1, num2, num3);
    System.out.println("Sum of three numbers: " + threeNumResult);
    System.out.println("*****************");


    // Using overloaded methods to add numbers
    double fourNumResult = addition.add(num1, num2, num3, num4);
    System.out.println("Sum of four numbers: " + fourNumResult);
    System.out.println("*****************");




    sc.close();
    }


}