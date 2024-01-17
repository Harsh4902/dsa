package c;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float Fahrenheit, Celsius = Float.parseFloat(sc.next());
        Fahrenheit =((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);

    }

}
