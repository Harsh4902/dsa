package c.c;

import java.util.Scanner;

public class ConsonantAndVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                vowel++;
            else
                consonant++;
        }

        System.out.println("Number of consonant is: " + consonant + " and vowel is: " + vowel);

    }

}
