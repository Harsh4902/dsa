import java.util.Arrays;
import java.util.HashSet;

public class A6{

   public static void main(String[] args) {
        int arr [] = {1,1,2,2,2,3,3,4,4};

        System.out.println("Given Array is : " + Arrays.toString(arr));
        arr = removeDuplicates(arr);
        System.out.println("Given Array after removing the duplicates: " + Arrays.toString(arr));
   } 

   public static int [] removeDuplicates(int [] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int a : arr)
            set.add(a);

        int [] temp = new int [set.size()];
        int i = 0;
        for(int a : set){
            temp[i] = a;
            i++;
        }
        
        return temp;
   }

}