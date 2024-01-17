import java.util.Arrays;

public class QuickSort{


    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 

    static void sort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {5,4,3,2,1};

        System.out.println("Given Array: " + Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

}