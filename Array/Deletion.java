
public class Deletion{
    public static void main(String[] args){

        int[] array = {10,20,30,40,50};
        System.out.println("Original Array:");
        printArray(array);

        int elementToDelete = 30;
        deleteElement(array, elementToDelete);

        System.out.println("Array after deleting element " + elementToDelete + ":");
        printArray(array);

    }

    public static void deleteElement(int[] array, int element){

        int index =-1;

        for(int i=0; i<array.length;i++){
            if(array[i]==element){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("Element not found in the array.");
            return;
        }

        for(int i=index; i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0; // Optional: Set last element to 0 after deletion
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}