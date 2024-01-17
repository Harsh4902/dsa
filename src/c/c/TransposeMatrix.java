package c.c;

public class TransposeMatrix {

    public static void main(String[] args)
    {
        int n = 4;
        int m = 4;
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int B[][] = new int[n][m], i, j;

        // Function call
        transpose(A, B,n,m);

        System.out.print("Result matrix is \n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }

    static void transpose(int A[][], int B[][],int n, int m)
    {
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                B[i][j] = A[j][i];
    }

}
