package c.c;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of rectangle");
        int a = sc.nextInt();
        System.out.println("Enter Width of rectangle");
        int b = sc.nextInt();
        area(a,b);
    }

    public static void area(int a,int b){

        System.out.println("Area of given rectangle is : " + (a*b) + " unit sq.");

    }

}
