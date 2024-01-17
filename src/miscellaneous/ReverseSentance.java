package miscellaneous;

import java.util.Scanner;

public class ReverseSentance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String [] arr = s.split(" ");

        StringBuilder str = new StringBuilder();
        for(int i= arr.length-1;i>=0;i--){

            if(i==0)
                str.append(arr[i]);
            else
                str.append(arr[i] + " ");

        }

        System.out.println(str);
    }

}
