import java.util.Arrays;

public class Counting {
    
    public static int[] sort(int[] arr) {
        int N = arr.length;
        int M = 0;
 
        for (int i = 0; i < N; i++) {
            M = Math.max(M, arr[i]);
        }
 
        int[] countArray = new int[M + 1];
 
        for (int i = 0; i < N; i++) {
            countArray[arr[i]]++;
        }
 
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
 
        int[] outputArray = new int[N];
 
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }
 
        return outputArray;
    }

    public static void main(String[] args) {
         int arr [] = {5,4,3,2,1};

        System.out.println("Given Array: " + Arrays.toString(arr));
        arr = sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}
