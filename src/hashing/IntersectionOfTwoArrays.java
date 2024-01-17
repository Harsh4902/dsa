package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,5,2,5,3,7,8};
        int [] arr2 = {3,5,0,4,2};

        System.out.println("Array 1 is: " + Arrays.toString(arr1));
        System.out.println("Array 2 is: " + Arrays.toString(arr2));
        System.out.println("Intersection of give arrays is : " + Arrays.toString(findIntersection(arr1, arr2)));

    }

    public static int [] findIntersection(int [] arr1,int [] arr2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int a : arr1){
            set1.add(a);
        }

        for(int a : arr2){
            if(set1.contains(a))
                set2.add(a);
        }

        int result [] = new int[set2.size()];
        int i = 0;
        for(Integer a : set2){
            result[i] = a;
            i++;
        }

        return result;

    }

}
