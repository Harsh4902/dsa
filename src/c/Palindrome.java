package c;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isPalindrome(n))
            System.out.println("Given Number is Palindrome");
        else
            System.out.println("Given Number is not Palindrome");

    }

    public static boolean isPalindrome(int n){

        String s1 = Integer.toString(n);

        for(int i=0;i<s1.length()/2;i++){

            if(s1.charAt(i) != s1.charAt(s1.length() - 1 - i))
                return false;

        }

        return true;
    }

}
