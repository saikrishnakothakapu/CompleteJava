
public class Search{

    public static void main(String[] args){

        int[] array={10,20,30,40,50};
        int target=30;
        int result=searchElement(array,target);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found in the array.");
        }

    }

    public static int searchElement(int[] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}