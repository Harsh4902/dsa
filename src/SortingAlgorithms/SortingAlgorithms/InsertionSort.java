import java.util.Arrays;

public class InsertionSort{

    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};

        System.out.println("Given Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sort(int [] arr){

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

}