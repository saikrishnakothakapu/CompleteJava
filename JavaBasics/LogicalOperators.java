
public class LogicalOperators {
    public static void main(String[] args) {

        /*

            Logical Operators in Java:
            1. AND (&&): Returns true if both operands are true.
            2. OR (||): Returns true if at least one operand is true.
            3. NOT (!): Returns true if the operand is false, and false if the operand is true.
        */
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b;
        System.out.println("Logical AND (a && b): " + andResult); // false

        // Logical OR
        boolean orResult = a || b;
        System.out.println("Logical OR (a || b): " + orResult); // true

        // Logical NOT
        boolean notResult = !a;
        System.out.println("Logical NOT (!a): " + notResult); // false

        // Combining logical operators
        boolean combinedResult = (a && !b) || (b && !a);
        System.out.println("Combined Result ((a && !b) || (b && !a)): " + combinedResult); // true
    }
}