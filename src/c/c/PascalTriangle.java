package c.c;

public class PascalTriangle {

    public static void main(String[] args) {

        int n = 4, i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));}
            System.out.println();
        }
    }
    public static int factorial(int a){
        if(a <= 1)
            return 1;
        return a*factorial(a-1);
    }
}
