

public class TypeConversion {
    public static void main(String[] args) {

        /*
            Type conversion in Java refers to the process of converting a value from one data type to another.
            There are two main types of type conversion:
            1. Implicit Conversion (Widening)
            2. Explicit Conversion (Narrowing)

            1. Implicit Conversion (Widening):
               This occurs when a smaller data type is automatically converted to a larger data type.
               For example, converting an int to a double.

            2. Explicit Conversion (Narrowing):
               This occurs when a larger data type is manually converted to a smaller data type using casting.
               For example, converting a double to an int.
            3. Why is type conversion important?
               Type conversion is important because it allows for flexibility in operations and ensures that
               data can be manipulated and used in different contexts without losing information.
            
               Author: Saikrishna Reddy
                Date: December, 2025
        */
        // Implicit Conversion (Widening)
        int intValue = 42;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion (int to double): " + doubleValue);

        // Explicit Conversion (Narrowing)
        double anotherDoubleValue = 9.99;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion (double to int): " + anotherIntValue);

    }
}