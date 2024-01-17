package c;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number: ");
        int y = Integer.parseInt(sc.next());

        System.out.println("LCM of given numbers is : " + ((x*y)/gcd(x,y)));
    }

    public static int gcd(int x, int y){
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }

        return gcd;
    }

}
