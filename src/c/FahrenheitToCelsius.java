package c;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float Celsius, Fahrenheit = Float.parseFloat(sc.next());
        Celsius = (Fahrenheit - 32f)*(5f/9f);
        System.out.println("Temperature in Celsius is: " + Celsius);

    }

}
