package c;

public class LowerTriangular {

    public static boolean isLowerTriangularMatrix(int mat[][],int m,int n)
    {
        for (int i = 0; i < m; i++)
            for (int j = i + 1; j < n; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 4;

        int mat[][] = { { 1, 0, 0, 0 },
                { 1, 4, 0, 0 },
                { 4, 6, 2, 0 },
                { 0, 4, 7, 6 } };

        if(isLowerTriangularMatrix(mat,m,n))
            System.out.println("Given matrix is Lower triangular matrix.");
        else
            System.out.println("Given matrix is not Lower triangular matrix.");
    }

}
