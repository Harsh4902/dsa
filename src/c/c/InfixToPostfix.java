import java.util.ArrayList;

public class InfixToPostfix {

    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }
    static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.empty() && stack.top() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.empty() && (prec(s.charAt(i)) < prec(stack.top()) ||
                        prec(s.charAt(i)) == prec(stack.top()) &&
                                associativity(s.charAt(i)) == 'L')) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.empty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String expression = "a+b*(c.c^d-e)^(f+g*h)-i";
        infixToPostfix(expression);
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
