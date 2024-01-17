import java.util.Arrays;

public class A5{

    public static void main(String [] args){

        int [] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        rotateArray(arr,3);

        System.out.println(Arrays.toString(arr));

    }

    public static void rotateArray(int [] arr , int k){

        if(arr.length < k){
            k = k % arr.length;
        }

        int temp [] = new int[k];

        for(int i=0;i < k;i++){
            temp[k-i-1] = arr[arr.length - i - 1];
        }

        for(int i = arr.length - 1; i>=k ; i--){
            arr[i] = arr[i-k];
        }

        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }

    }

}