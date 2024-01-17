package c;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(n + " is prime number");
            }

        }
    }

}
