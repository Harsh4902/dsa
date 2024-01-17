package c.c;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int a = Integer.parseInt(sc.next());

        System.out.println("Factorial of given Number is: " + factorial(a));

    }

    public static int factorial(int a){

        if(a <= 1)
            return 1;

        return a*factorial(a-1);
    }

}
