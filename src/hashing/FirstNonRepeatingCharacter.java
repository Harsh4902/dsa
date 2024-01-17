package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                int a = map.get(s.charAt(i));
                map.put(s.charAt(i),++a);
            }
            else
                map.put(s.charAt(i),1);

        }

        Character res = null;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                res = s.charAt(i);
                break;
            }
        }

        System.out.println("First non repeating character is: " + res);
    }

}
