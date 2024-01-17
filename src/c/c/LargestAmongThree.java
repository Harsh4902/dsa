package c.c;

import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int b = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int c = Integer.parseInt(sc.next());

        if(a > b && b > c)
            System.out.println("Largest Number is: " + a);
        else if(b > a && a > c)
            System.out.println("Largest Number is: " + b);
        else
            System.out.println("Largest Number is: " + a);
    }

}
