package c.c;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            sum += remainder;
            n = n/10;
        }
        System.out.println("The sum of digits of the given number is: " + sum);

    }

}
