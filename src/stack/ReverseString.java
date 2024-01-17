package stack;

public class ReverseString {

    public static String reverse(String s){
        String res = "";

        Stack<Character> stack = new Stack<>(s.length());

        for(int i = 0; i < s.length() ;i++)
            stack.push(s.charAt(i));

        while (!stack.empty())
            res += stack.pop();

        return res;
    }

    public static void main(String[] args) {
        String s = "Harshvardhan";

        System.out.println("Current String : " + s);

        s = reverse(s);

        System.out.println("Reversed String : " + s);
    }

}
