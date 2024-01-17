package c;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

    }

}
