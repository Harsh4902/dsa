package c;

public class DiagonalSum {

    public static void main(String[] args) {

        int m=3;
        int n=3;

        int mat[][] = {{ 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }};

        int sum = 0;

        for(int i=0; i<m && i<n;i++){

            sum += mat[i][i];

        }

        System.out.println("Sum of diagonal is : "  +sum);

    }

}
