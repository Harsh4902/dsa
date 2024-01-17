package SearchingAlgorithm;

import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {

        int [] arr = {1,1,2,2,2,3,4,4,5};

        System.out.println(Arrays.toString(search(arr,1)));
        System.out.println(Arrays.toString(search(arr,2)));
        System.out.println(Arrays.toString(search(arr,3)));
        System.out.println(Arrays.toString(search(arr,4)));
        System.out.println(Arrays.toString(search(arr,5)));

    }

    public static  int [] search(int [] arr, int target){

        int first = -1;
        int last = -1;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target && first == -1)
                first = i;

            if(arr[i] == target && first != -1)
                last = i;

        }

        return  new int[] {first,last};

    }

}
