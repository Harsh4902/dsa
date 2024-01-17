package c.c;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isPerfect(n))
            System.out.println("Given number is a perfect number.");
        else
            System.out.println("Given number is not a perfect number.");
    }

    public static boolean isPerfect(int n){

        int sum=0;

        for(int i=1;i<=n/2;i++){
            if(n %
                    i == 0)
                sum += i;
        }


        return sum==n;
    }

}
