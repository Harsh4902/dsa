package c;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int y = Integer.parseInt(sc.next());

        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);

    }

}
