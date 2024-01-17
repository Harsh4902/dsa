package c;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear= false;
        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        }
        else
            isLeapYear = false;

        if (!isLeapYear)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");

    }
}
