package c;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle");
        int r = sc.nextInt();
        area(r);
    }

    public static void area(int r){

        System.out.println("Area of given circle is : " + (Math.PI * r * r) + " unit sq.");

    }

}
