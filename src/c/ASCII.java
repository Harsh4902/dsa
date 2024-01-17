package c;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("ASCII value of given character is : " + (int)s.charAt(0));
    }

}
