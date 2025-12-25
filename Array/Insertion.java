
public class Insertion {

    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        System.out.println("Original Array:");
        printArray(array);

        int indexToInsert = 2;
        int valueToInsert = 25;

        insert(array, indexToInsert, valueToInsert);

        System.out.println("Array after insertion:");
        printArray(array);
    }

    public static void insert(int[] array, int index, int value){

        if(index <0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of length " + array.length);
        }

        for(int i =array.length-1; i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=value;

    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}