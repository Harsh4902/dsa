package c.c;

import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last index: ");
        int a = Integer.parseInt(sc.next());
        System.out.print(0+" "+1);
        fibonacci(a);

    }

    static int n1=0,n2=1,n3=0;
    static void fibonacci(int count){
        if(count-2>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(count-1);
        }
    }

}
