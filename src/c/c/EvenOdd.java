package c.c;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 != 0)
            System.out.println("Given number is Odd");
        else
            System.out.println("Given Number is Even");


        sc.close();
    }

}
