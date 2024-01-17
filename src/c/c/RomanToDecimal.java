package c.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDecimal {

    private static Map<Character,Integer> map = new HashMap<>(){{put('I',1);put('V',5);put('X',10);put('L',50);put('C',100);put('D',500);put('M',1000);}};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String roman = sc.next();

        System.out.println(convert(roman.toUpperCase()));
    }

    public static int convert(String s){
        int total = 0;
        for (int i=0; i<s.length(); i++)
        {
            int s1 = map.get(s.charAt(i));
            if (i+1 <s.length()) {
                int s2 = map.get(s.charAt(i+1));
                if (s1 >= s2)
                    total = total + s1;
                else
                    total = total - s1;
            }
            else
                total = total + s1;
        }
        return total;
    }


}
