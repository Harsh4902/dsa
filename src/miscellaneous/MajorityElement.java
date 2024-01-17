package miscellaneous;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

        int [] arr = {2,2,1,1,1,2,2};

        Arrays.sort(arr);

        System.out.println("Majority element is : " + arr[arr.length/2]);

    }

}
