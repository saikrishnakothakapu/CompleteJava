
public class ArrayInitilize {
    public static void main(String[] args) {
        // Method 1: Initialize array during declaration
        int[] array1 = {1, 2, 3, 4, 5};

        // Method 2: Declare and then initialize using 'new' keyword
        int[] array2;
        array2 = new int[]{6, 7, 8, 9, 10};

        // Method 3: Declare an array and allocate memory, then assign values
        int[] array3 = new int[5];
        array3[0] = 11;
        array3[1] = 12;
        array3[2] = 13;
        array3[3] = 14;
        array3[4] = 15;

        // Print arrays to verify initialization
        System.out.println("Array 1:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray 2:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray 3:");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}