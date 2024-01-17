package c.c;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int b = Integer.parseInt(sc.next());

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
    }

}
