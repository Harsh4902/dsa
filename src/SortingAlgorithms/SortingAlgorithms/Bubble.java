import java.util.Arrays;

public class Bubble {
    
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};

        System.out.println("Given Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sort(int [] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

}
