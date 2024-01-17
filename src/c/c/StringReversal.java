package c.c;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder res = new StringBuilder();

        for(int i= s.length()-1 ;i>=0;i--)
            res.append(s.charAt(i));

        System.out.println("reversed String is : " + res);
    }

}
