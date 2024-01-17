package c.c;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int b = Integer.parseInt(sc.next());

        System.out.println("Sum of given numbers is : " +(a+b) );
    }

}
