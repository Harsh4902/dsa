package c.c;

import java.util.ArrayList;

public class BalancedParetheses {


    public static boolean isBalanced(String s){

        Stack<Character> stack = new Stack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            if (stack.empty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return stack.empty();
    }

    public static void main( String[] args) {

            String s = "[()]{}{[()()]()}";

        System.out.println(isBalanced(s));

    }

}

class Stack <T> {

    ArrayList<T> A;
    int top = -1;
    int size;
    Stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }
    void push(T X)
    {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        }
        else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }
    T top()
    {
        if (top == -1) {

            System.out.println("Stack Underflow");

            return null;
        }
        else
            return A.get(top);
    }
    T pop()
    {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            return A.get(top--);
        }
    }
    boolean empty() { return top == -1; }

}
