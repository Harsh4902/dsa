package c;

import java.util.Arrays;
import java.util.Scanner;

public class WordsInSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = input.nextLine();
        System.out.println("Number of words in given sentence is: " + s.split(" ").length);

    }

}