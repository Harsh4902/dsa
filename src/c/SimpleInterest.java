package c;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int p = sc.nextInt();
        System.out.println("Enter ROI: ");
        int r = sc.nextInt();
        System.out.println("Enter Duration: ");
        int n = sc.nextInt();

        calculate(p,r,n);

    }

    public static void calculate(int p, float r, int n){

        System.out.println("Simple Interest is: " + (p*r*n/100));

    }

}
