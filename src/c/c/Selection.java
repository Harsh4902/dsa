import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};

        System.out.println("Given Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sort(int [] arr){

        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] <= arr[i])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}
