package c;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter messure of side A: ");
        int a = sc.nextInt();
        System.out.println("Enter messure of side B: ");
        int b = sc.nextInt();
        System.out.println("Enter messure of side XC: ");
        int c = sc.nextInt();
        area(a,b,c);
    }

    public static void area(int a,int b ,int c){

        int s = (a+b+c)/2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of given triangle is : " + area + " unit sq.");
    }

}
