import java.util.ArrayList;

public class EvaluatePostfix {

    public static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack = new Stack<>(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c))
                stack.push(c - '0');

            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String exp = "435*+2-";

        System.out.println(evaluatePostfix(exp));

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
