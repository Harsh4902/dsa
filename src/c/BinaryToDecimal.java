package c;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int binary = Integer.parseInt(sc.next());
        int a = binary;
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }

        System.out.println("Decimal of " + a + " is " + decimal);

    }


}
