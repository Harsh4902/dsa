package c.c;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        int x = 0;

        Scanner sc = new Scanner(System.in);
        while (x!=5){
            System.out.println("Choose your option:");
            System.out.print("1.Add \n2.Substract \n3.Divide \n4.Multiply \n5.Exit\n");
            x = sc.nextInt();

            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            switch (x){
                case 1 -> System.out.println(a+b);
                case 2 -> System.out.println(a-b);
                case 3 -> System.out.println(a/b);
                case 4 -> System.out.println(a*b);
                case 5 -> System.out.println("closing.....");
                default -> System.out.println("Please choose valid option..");
            }

        }

    }

}
